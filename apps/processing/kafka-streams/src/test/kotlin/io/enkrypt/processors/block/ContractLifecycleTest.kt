package io.enkrypt.processors.block

import io.enkrypt.avro.capture.BlockRecord
import io.enkrypt.common.extensions.amountBI
import io.enkrypt.common.extensions.data20
import io.enkrypt.common.extensions.ether
import io.enkrypt.common.extensions.hex
import io.enkrypt.kafka.mapping.ObjectMapper
import io.enkrypt.kafka.streams.models.ChainEvent
import io.enkrypt.kafka.streams.models.StaticAddresses
import io.enkrypt.kafka.streams.processors.block.ChainEvents
import io.enkrypt.util.Blockchains
import io.enkrypt.util.TestEthereumListener
import io.enkrypt.util.createBlockRecord
import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec
import mu.KotlinLogging
import org.ethereum.core.AccountState
import org.ethereum.core.BlockSummary
import org.ethereum.core.CallTransaction
import org.ethereum.core.genesis.GenesisLoader
import org.ethereum.solidity.compiler.CompilationResult
import org.ethereum.solidity.compiler.SolidityCompiler
import org.ethereum.util.ByteUtil
import org.ethereum.util.ByteUtil.wrap
import org.ethereum.vm.OpCode
import org.ethereum.vm.hook.VMHook
import org.ethereum.vm.program.Program
import org.spongycastle.util.encoders.Hex
import java.math.BigInteger

class LoggingVMHook : VMHook {

  val logger = KotlinLogging.logger {}

  override fun step(program: Program, opcode: OpCode) {
    logger.info { "Step: origin = ${program.originAddress.shortHex()} owner = ${program.ownerAddress.shortHex()}, opcode = $opcode" }
  }
}

class ContractLifecycleTest : BehaviorSpec() {

  private val logger = KotlinLogging.logger {}

  private val erc20Source = ContractLifecycleTest::class.java.getResource("/solidity/erc20.sol").readText()

  private val listener = TestEthereumListener()

  private val genesisBlock = Blockchains.Genesis.apply {
    // initial balances
    addPremine(wrap(Blockchains.Users.Bob.address), AccountState(BigInteger.ZERO, 20.ether()))

    stateRoot = GenesisLoader.generateRootHash(premine)
  }

  private val objectMapper = ObjectMapper()

  private val sbc = Blockchains.Factory.createStandalone(genesisBlock, listener)
  private val cbc = Blockchains.Factory.createContractFocused(genesisBlock, listener)

  init {

    given("a block with a contract creation") {

      sbc.sender = Blockchains.Users.Bob

      val contract = sbc
        .withGasLimit(500000)
        .submitNewContract(erc20Source, "ERC20")

      val blockRecord = sbc.createBlockRecord(listener)

      `when`("we convert the block") {

        val chainEvents = ChainEvents.forBlock(blockRecord)

        then("there should be 2 chain events") {
          chainEvents.size shouldBe 2
        }

        then("there should be a fungible ether transfer for the coinbase") {
          checkCoinbase(chainEvents.first(), 3000292048000000000.toBigInteger())
        }

        then("there should be a contract creation event") {
          val creation = chainEvents[1].contractCreation
          creation.getAddress() shouldBe contract.address.data20()
          creation.getData().hex() shouldBe contract.binary
          creation.getCreator() shouldBe Blockchains.Users.Bob.address.data20()
          creation.getBlockHash() shouldBe blockRecord.getHeader().getHash()
          creation.getTxHash() shouldBe blockRecord.getTransactions().first().getHash()
        }
      }
    }

    given(" a live contract which holds some ether") {
      val res = SolidityCompiler.compile(
        erc20Source.toByteArray(),
        true,
        SolidityCompiler.Options.ABI,
        SolidityCompiler.Options.BIN
      )
      val cres = CompilationResult.parse(res.output)

      val tx = Blockchains.Utils.createTx(
        cbc,
        Blockchains.Users.Bob,
        ByteUtil.EMPTY_BYTE_ARRAY,
        Hex.decode(cres.getContract("ERC20").bin)
      )
      Blockchains.Utils.executeTransaction(cbc, tx)

      val contractAddress = tx.contractAddress

      `when`("the contract self destructs") {

        val c = CallTransaction.Contract(cres.getContract("ERC20").abi)
        val callData = c.getByName("seppuku").encode()

        val methodTx = Blockchains.Utils.createTx(cbc, Blockchains.Users.Bob, contractAddress, callData, 0L)

        val (executor, executionSummary) = Blockchains.Utils.executeTransaction(cbc, methodTx)

        val programResult = executor.result
        val touchedAccounts = programResult.touchedAccounts

        val blockSummary = BlockSummary(
          cbc.bestBlock,
          emptyMap(), // Not interested in block reward
          arrayListOf(executor.receipt),
          arrayListOf(executionSummary)
        )
        val chainEvents = ChainEvents.forBlock(
          objectMapper.convert(
            objectMapper,
            BlockSummary::class.java,
            BlockRecord.Builder::class.java,
            blockSummary
          ).build()
        )

        then("there should be 2 chain events") {
          chainEvents.size shouldBe 2
        }

        then("there should be a fungible ether transfer for the coinbase") {
          checkCoinbase(chainEvents.first(), 3000292048000000000.toBigInteger())
        }

        then("there should be several fungible transfer events") {
          programResult.futureRefund shouldBe 24000L
        }
      }
    }
  }

  private fun checkCoinbase(event: ChainEvent, reward: BigInteger) {
    val coinbaseTransfer = event.fungibleTransfer
    coinbaseTransfer.getFrom() shouldBe StaticAddresses.EtherZero
    coinbaseTransfer.getTo() shouldBe Blockchains.Coinbase.address.data20()
    coinbaseTransfer.amountBI shouldBe reward
  }
}
