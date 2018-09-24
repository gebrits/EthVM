/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.enkrypt.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BlockHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1593863988012918882L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BlockHeader\",\"namespace\":\"io.enkrypt.avro\",\"fields\":[{\"name\":\"parentHash\",\"type\":{\"type\":\"fixed\",\"name\":\"Bytes32\",\"size\":32}},{\"name\":\"unclesHash\",\"type\":\"Bytes32\"},{\"name\":\"coinbase\",\"type\":{\"type\":\"fixed\",\"name\":\"Bytes20\",\"size\":20}},{\"name\":\"stateRoot\",\"type\":\"Bytes32\"},{\"name\":\"txTrieRoot\",\"type\":\"Bytes32\"},{\"name\":\"receiptTrieRoot\",\"type\":\"Bytes32\"},{\"name\":\"logsBloom\",\"type\":\"bytes\"},{\"name\":\"difficulty\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"number\",\"type\":\"long\"},{\"name\":\"gasLimit\",\"type\":\"bytes\"},{\"name\":\"gasUsed\",\"type\":\"long\"},{\"name\":\"mixHash\",\"type\":\"bytes\"},{\"name\":\"extraData\",\"type\":\"bytes\"},{\"name\":\"nonce\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BlockHeader> ENCODER =
      new BinaryMessageEncoder<BlockHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BlockHeader> DECODER =
      new BinaryMessageDecoder<BlockHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BlockHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BlockHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BlockHeader>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BlockHeader to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BlockHeader from a ByteBuffer. */
  public static BlockHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public io.enkrypt.avro.Bytes32 parentHash;
  @Deprecated public io.enkrypt.avro.Bytes32 unclesHash;
  @Deprecated public io.enkrypt.avro.Bytes20 coinbase;
  @Deprecated public io.enkrypt.avro.Bytes32 stateRoot;
  @Deprecated public io.enkrypt.avro.Bytes32 txTrieRoot;
  @Deprecated public io.enkrypt.avro.Bytes32 receiptTrieRoot;
  @Deprecated public java.nio.ByteBuffer logsBloom;
  @Deprecated public java.nio.ByteBuffer difficulty;
  @Deprecated public long timestamp;
  @Deprecated public long number;
  @Deprecated public java.nio.ByteBuffer gasLimit;
  @Deprecated public long gasUsed;
  @Deprecated public java.nio.ByteBuffer mixHash;
  @Deprecated public java.nio.ByteBuffer extraData;
  @Deprecated public java.nio.ByteBuffer nonce;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BlockHeader() {}

  /**
   * All-args constructor.
   * @param parentHash The new value for parentHash
   * @param unclesHash The new value for unclesHash
   * @param coinbase The new value for coinbase
   * @param stateRoot The new value for stateRoot
   * @param txTrieRoot The new value for txTrieRoot
   * @param receiptTrieRoot The new value for receiptTrieRoot
   * @param logsBloom The new value for logsBloom
   * @param difficulty The new value for difficulty
   * @param timestamp The new value for timestamp
   * @param number The new value for number
   * @param gasLimit The new value for gasLimit
   * @param gasUsed The new value for gasUsed
   * @param mixHash The new value for mixHash
   * @param extraData The new value for extraData
   * @param nonce The new value for nonce
   */
  public BlockHeader(io.enkrypt.avro.Bytes32 parentHash, io.enkrypt.avro.Bytes32 unclesHash, io.enkrypt.avro.Bytes20 coinbase, io.enkrypt.avro.Bytes32 stateRoot, io.enkrypt.avro.Bytes32 txTrieRoot, io.enkrypt.avro.Bytes32 receiptTrieRoot, java.nio.ByteBuffer logsBloom, java.nio.ByteBuffer difficulty, java.lang.Long timestamp, java.lang.Long number, java.nio.ByteBuffer gasLimit, java.lang.Long gasUsed, java.nio.ByteBuffer mixHash, java.nio.ByteBuffer extraData, java.nio.ByteBuffer nonce) {
    this.parentHash = parentHash;
    this.unclesHash = unclesHash;
    this.coinbase = coinbase;
    this.stateRoot = stateRoot;
    this.txTrieRoot = txTrieRoot;
    this.receiptTrieRoot = receiptTrieRoot;
    this.logsBloom = logsBloom;
    this.difficulty = difficulty;
    this.timestamp = timestamp;
    this.number = number;
    this.gasLimit = gasLimit;
    this.gasUsed = gasUsed;
    this.mixHash = mixHash;
    this.extraData = extraData;
    this.nonce = nonce;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return parentHash;
    case 1: return unclesHash;
    case 2: return coinbase;
    case 3: return stateRoot;
    case 4: return txTrieRoot;
    case 5: return receiptTrieRoot;
    case 6: return logsBloom;
    case 7: return difficulty;
    case 8: return timestamp;
    case 9: return number;
    case 10: return gasLimit;
    case 11: return gasUsed;
    case 12: return mixHash;
    case 13: return extraData;
    case 14: return nonce;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: parentHash = (io.enkrypt.avro.Bytes32)value$; break;
    case 1: unclesHash = (io.enkrypt.avro.Bytes32)value$; break;
    case 2: coinbase = (io.enkrypt.avro.Bytes20)value$; break;
    case 3: stateRoot = (io.enkrypt.avro.Bytes32)value$; break;
    case 4: txTrieRoot = (io.enkrypt.avro.Bytes32)value$; break;
    case 5: receiptTrieRoot = (io.enkrypt.avro.Bytes32)value$; break;
    case 6: logsBloom = (java.nio.ByteBuffer)value$; break;
    case 7: difficulty = (java.nio.ByteBuffer)value$; break;
    case 8: timestamp = (java.lang.Long)value$; break;
    case 9: number = (java.lang.Long)value$; break;
    case 10: gasLimit = (java.nio.ByteBuffer)value$; break;
    case 11: gasUsed = (java.lang.Long)value$; break;
    case 12: mixHash = (java.nio.ByteBuffer)value$; break;
    case 13: extraData = (java.nio.ByteBuffer)value$; break;
    case 14: nonce = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'parentHash' field.
   * @return The value of the 'parentHash' field.
   */
  public io.enkrypt.avro.Bytes32 getParentHash() {
    return parentHash;
  }

  /**
   * Sets the value of the 'parentHash' field.
   * @param value the value to set.
   */
  public void setParentHash(io.enkrypt.avro.Bytes32 value) {
    this.parentHash = value;
  }

  /**
   * Gets the value of the 'unclesHash' field.
   * @return The value of the 'unclesHash' field.
   */
  public io.enkrypt.avro.Bytes32 getUnclesHash() {
    return unclesHash;
  }

  /**
   * Sets the value of the 'unclesHash' field.
   * @param value the value to set.
   */
  public void setUnclesHash(io.enkrypt.avro.Bytes32 value) {
    this.unclesHash = value;
  }

  /**
   * Gets the value of the 'coinbase' field.
   * @return The value of the 'coinbase' field.
   */
  public io.enkrypt.avro.Bytes20 getCoinbase() {
    return coinbase;
  }

  /**
   * Sets the value of the 'coinbase' field.
   * @param value the value to set.
   */
  public void setCoinbase(io.enkrypt.avro.Bytes20 value) {
    this.coinbase = value;
  }

  /**
   * Gets the value of the 'stateRoot' field.
   * @return The value of the 'stateRoot' field.
   */
  public io.enkrypt.avro.Bytes32 getStateRoot() {
    return stateRoot;
  }

  /**
   * Sets the value of the 'stateRoot' field.
   * @param value the value to set.
   */
  public void setStateRoot(io.enkrypt.avro.Bytes32 value) {
    this.stateRoot = value;
  }

  /**
   * Gets the value of the 'txTrieRoot' field.
   * @return The value of the 'txTrieRoot' field.
   */
  public io.enkrypt.avro.Bytes32 getTxTrieRoot() {
    return txTrieRoot;
  }

  /**
   * Sets the value of the 'txTrieRoot' field.
   * @param value the value to set.
   */
  public void setTxTrieRoot(io.enkrypt.avro.Bytes32 value) {
    this.txTrieRoot = value;
  }

  /**
   * Gets the value of the 'receiptTrieRoot' field.
   * @return The value of the 'receiptTrieRoot' field.
   */
  public io.enkrypt.avro.Bytes32 getReceiptTrieRoot() {
    return receiptTrieRoot;
  }

  /**
   * Sets the value of the 'receiptTrieRoot' field.
   * @param value the value to set.
   */
  public void setReceiptTrieRoot(io.enkrypt.avro.Bytes32 value) {
    this.receiptTrieRoot = value;
  }

  /**
   * Gets the value of the 'logsBloom' field.
   * @return The value of the 'logsBloom' field.
   */
  public java.nio.ByteBuffer getLogsBloom() {
    return logsBloom;
  }

  /**
   * Sets the value of the 'logsBloom' field.
   * @param value the value to set.
   */
  public void setLogsBloom(java.nio.ByteBuffer value) {
    this.logsBloom = value;
  }

  /**
   * Gets the value of the 'difficulty' field.
   * @return The value of the 'difficulty' field.
   */
  public java.nio.ByteBuffer getDifficulty() {
    return difficulty;
  }

  /**
   * Sets the value of the 'difficulty' field.
   * @param value the value to set.
   */
  public void setDifficulty(java.nio.ByteBuffer value) {
    this.difficulty = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'number' field.
   * @return The value of the 'number' field.
   */
  public java.lang.Long getNumber() {
    return number;
  }

  /**
   * Sets the value of the 'number' field.
   * @param value the value to set.
   */
  public void setNumber(java.lang.Long value) {
    this.number = value;
  }

  /**
   * Gets the value of the 'gasLimit' field.
   * @return The value of the 'gasLimit' field.
   */
  public java.nio.ByteBuffer getGasLimit() {
    return gasLimit;
  }

  /**
   * Sets the value of the 'gasLimit' field.
   * @param value the value to set.
   */
  public void setGasLimit(java.nio.ByteBuffer value) {
    this.gasLimit = value;
  }

  /**
   * Gets the value of the 'gasUsed' field.
   * @return The value of the 'gasUsed' field.
   */
  public java.lang.Long getGasUsed() {
    return gasUsed;
  }

  /**
   * Sets the value of the 'gasUsed' field.
   * @param value the value to set.
   */
  public void setGasUsed(java.lang.Long value) {
    this.gasUsed = value;
  }

  /**
   * Gets the value of the 'mixHash' field.
   * @return The value of the 'mixHash' field.
   */
  public java.nio.ByteBuffer getMixHash() {
    return mixHash;
  }

  /**
   * Sets the value of the 'mixHash' field.
   * @param value the value to set.
   */
  public void setMixHash(java.nio.ByteBuffer value) {
    this.mixHash = value;
  }

  /**
   * Gets the value of the 'extraData' field.
   * @return The value of the 'extraData' field.
   */
  public java.nio.ByteBuffer getExtraData() {
    return extraData;
  }

  /**
   * Sets the value of the 'extraData' field.
   * @param value the value to set.
   */
  public void setExtraData(java.nio.ByteBuffer value) {
    this.extraData = value;
  }

  /**
   * Gets the value of the 'nonce' field.
   * @return The value of the 'nonce' field.
   */
  public java.nio.ByteBuffer getNonce() {
    return nonce;
  }

  /**
   * Sets the value of the 'nonce' field.
   * @param value the value to set.
   */
  public void setNonce(java.nio.ByteBuffer value) {
    this.nonce = value;
  }

  /**
   * Creates a new BlockHeader RecordBuilder.
   * @return A new BlockHeader RecordBuilder
   */
  public static io.enkrypt.avro.BlockHeader.Builder newBuilder() {
    return new io.enkrypt.avro.BlockHeader.Builder();
  }

  /**
   * Creates a new BlockHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BlockHeader RecordBuilder
   */
  public static io.enkrypt.avro.BlockHeader.Builder newBuilder(io.enkrypt.avro.BlockHeader.Builder other) {
    return new io.enkrypt.avro.BlockHeader.Builder(other);
  }

  /**
   * Creates a new BlockHeader RecordBuilder by copying an existing BlockHeader instance.
   * @param other The existing instance to copy.
   * @return A new BlockHeader RecordBuilder
   */
  public static io.enkrypt.avro.BlockHeader.Builder newBuilder(io.enkrypt.avro.BlockHeader other) {
    return new io.enkrypt.avro.BlockHeader.Builder(other);
  }

  /**
   * RecordBuilder for BlockHeader instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BlockHeader>
    implements org.apache.avro.data.RecordBuilder<BlockHeader> {

    private io.enkrypt.avro.Bytes32 parentHash;
    private io.enkrypt.avro.Bytes32 unclesHash;
    private io.enkrypt.avro.Bytes20 coinbase;
    private io.enkrypt.avro.Bytes32 stateRoot;
    private io.enkrypt.avro.Bytes32 txTrieRoot;
    private io.enkrypt.avro.Bytes32 receiptTrieRoot;
    private java.nio.ByteBuffer logsBloom;
    private java.nio.ByteBuffer difficulty;
    private long timestamp;
    private long number;
    private java.nio.ByteBuffer gasLimit;
    private long gasUsed;
    private java.nio.ByteBuffer mixHash;
    private java.nio.ByteBuffer extraData;
    private java.nio.ByteBuffer nonce;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.enkrypt.avro.BlockHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.parentHash)) {
        this.parentHash = data().deepCopy(fields()[0].schema(), other.parentHash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unclesHash)) {
        this.unclesHash = data().deepCopy(fields()[1].schema(), other.unclesHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.coinbase)) {
        this.coinbase = data().deepCopy(fields()[2].schema(), other.coinbase);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stateRoot)) {
        this.stateRoot = data().deepCopy(fields()[3].schema(), other.stateRoot);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.txTrieRoot)) {
        this.txTrieRoot = data().deepCopy(fields()[4].schema(), other.txTrieRoot);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.receiptTrieRoot)) {
        this.receiptTrieRoot = data().deepCopy(fields()[5].schema(), other.receiptTrieRoot);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.logsBloom)) {
        this.logsBloom = data().deepCopy(fields()[6].schema(), other.logsBloom);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[7].schema(), other.difficulty);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[8].schema(), other.timestamp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.number)) {
        this.number = data().deepCopy(fields()[9].schema(), other.number);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.gasLimit)) {
        this.gasLimit = data().deepCopy(fields()[10].schema(), other.gasLimit);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.gasUsed)) {
        this.gasUsed = data().deepCopy(fields()[11].schema(), other.gasUsed);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.mixHash)) {
        this.mixHash = data().deepCopy(fields()[12].schema(), other.mixHash);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.extraData)) {
        this.extraData = data().deepCopy(fields()[13].schema(), other.extraData);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.nonce)) {
        this.nonce = data().deepCopy(fields()[14].schema(), other.nonce);
        fieldSetFlags()[14] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BlockHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(io.enkrypt.avro.BlockHeader other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.parentHash)) {
        this.parentHash = data().deepCopy(fields()[0].schema(), other.parentHash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unclesHash)) {
        this.unclesHash = data().deepCopy(fields()[1].schema(), other.unclesHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.coinbase)) {
        this.coinbase = data().deepCopy(fields()[2].schema(), other.coinbase);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stateRoot)) {
        this.stateRoot = data().deepCopy(fields()[3].schema(), other.stateRoot);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.txTrieRoot)) {
        this.txTrieRoot = data().deepCopy(fields()[4].schema(), other.txTrieRoot);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.receiptTrieRoot)) {
        this.receiptTrieRoot = data().deepCopy(fields()[5].schema(), other.receiptTrieRoot);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.logsBloom)) {
        this.logsBloom = data().deepCopy(fields()[6].schema(), other.logsBloom);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[7].schema(), other.difficulty);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[8].schema(), other.timestamp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.number)) {
        this.number = data().deepCopy(fields()[9].schema(), other.number);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.gasLimit)) {
        this.gasLimit = data().deepCopy(fields()[10].schema(), other.gasLimit);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.gasUsed)) {
        this.gasUsed = data().deepCopy(fields()[11].schema(), other.gasUsed);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.mixHash)) {
        this.mixHash = data().deepCopy(fields()[12].schema(), other.mixHash);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.extraData)) {
        this.extraData = data().deepCopy(fields()[13].schema(), other.extraData);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.nonce)) {
        this.nonce = data().deepCopy(fields()[14].schema(), other.nonce);
        fieldSetFlags()[14] = true;
      }
    }

    /**
      * Gets the value of the 'parentHash' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getParentHash() {
      return parentHash;
    }

    /**
      * Sets the value of the 'parentHash' field.
      * @param value The value of 'parentHash'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setParentHash(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[0], value);
      this.parentHash = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'parentHash' field has been set.
      * @return True if the 'parentHash' field has been set, false otherwise.
      */
    public boolean hasParentHash() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'parentHash' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearParentHash() {
      parentHash = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'unclesHash' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getUnclesHash() {
      return unclesHash;
    }

    /**
      * Sets the value of the 'unclesHash' field.
      * @param value The value of 'unclesHash'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setUnclesHash(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[1], value);
      this.unclesHash = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'unclesHash' field has been set.
      * @return True if the 'unclesHash' field has been set, false otherwise.
      */
    public boolean hasUnclesHash() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'unclesHash' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearUnclesHash() {
      unclesHash = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'coinbase' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes20 getCoinbase() {
      return coinbase;
    }

    /**
      * Sets the value of the 'coinbase' field.
      * @param value The value of 'coinbase'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setCoinbase(io.enkrypt.avro.Bytes20 value) {
      validate(fields()[2], value);
      this.coinbase = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'coinbase' field has been set.
      * @return True if the 'coinbase' field has been set, false otherwise.
      */
    public boolean hasCoinbase() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'coinbase' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearCoinbase() {
      coinbase = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'stateRoot' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getStateRoot() {
      return stateRoot;
    }

    /**
      * Sets the value of the 'stateRoot' field.
      * @param value The value of 'stateRoot'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setStateRoot(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[3], value);
      this.stateRoot = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'stateRoot' field has been set.
      * @return True if the 'stateRoot' field has been set, false otherwise.
      */
    public boolean hasStateRoot() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'stateRoot' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearStateRoot() {
      stateRoot = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'txTrieRoot' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getTxTrieRoot() {
      return txTrieRoot;
    }

    /**
      * Sets the value of the 'txTrieRoot' field.
      * @param value The value of 'txTrieRoot'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setTxTrieRoot(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[4], value);
      this.txTrieRoot = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'txTrieRoot' field has been set.
      * @return True if the 'txTrieRoot' field has been set, false otherwise.
      */
    public boolean hasTxTrieRoot() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'txTrieRoot' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearTxTrieRoot() {
      txTrieRoot = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'receiptTrieRoot' field.
      * @return The value.
      */
    public io.enkrypt.avro.Bytes32 getReceiptTrieRoot() {
      return receiptTrieRoot;
    }

    /**
      * Sets the value of the 'receiptTrieRoot' field.
      * @param value The value of 'receiptTrieRoot'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setReceiptTrieRoot(io.enkrypt.avro.Bytes32 value) {
      validate(fields()[5], value);
      this.receiptTrieRoot = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'receiptTrieRoot' field has been set.
      * @return True if the 'receiptTrieRoot' field has been set, false otherwise.
      */
    public boolean hasReceiptTrieRoot() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'receiptTrieRoot' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearReceiptTrieRoot() {
      receiptTrieRoot = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'logsBloom' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getLogsBloom() {
      return logsBloom;
    }

    /**
      * Sets the value of the 'logsBloom' field.
      * @param value The value of 'logsBloom'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setLogsBloom(java.nio.ByteBuffer value) {
      validate(fields()[6], value);
      this.logsBloom = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'logsBloom' field has been set.
      * @return True if the 'logsBloom' field has been set, false otherwise.
      */
    public boolean hasLogsBloom() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'logsBloom' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearLogsBloom() {
      logsBloom = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'difficulty' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getDifficulty() {
      return difficulty;
    }

    /**
      * Sets the value of the 'difficulty' field.
      * @param value The value of 'difficulty'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setDifficulty(java.nio.ByteBuffer value) {
      validate(fields()[7], value);
      this.difficulty = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'difficulty' field has been set.
      * @return True if the 'difficulty' field has been set, false otherwise.
      */
    public boolean hasDifficulty() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'difficulty' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearDifficulty() {
      difficulty = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setTimestamp(long value) {
      validate(fields()[8], value);
      this.timestamp = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearTimestamp() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'number' field.
      * @return The value.
      */
    public java.lang.Long getNumber() {
      return number;
    }

    /**
      * Sets the value of the 'number' field.
      * @param value The value of 'number'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setNumber(long value) {
      validate(fields()[9], value);
      this.number = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'number' field has been set.
      * @return True if the 'number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'number' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearNumber() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'gasLimit' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getGasLimit() {
      return gasLimit;
    }

    /**
      * Sets the value of the 'gasLimit' field.
      * @param value The value of 'gasLimit'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setGasLimit(java.nio.ByteBuffer value) {
      validate(fields()[10], value);
      this.gasLimit = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'gasLimit' field has been set.
      * @return True if the 'gasLimit' field has been set, false otherwise.
      */
    public boolean hasGasLimit() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'gasLimit' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearGasLimit() {
      gasLimit = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'gasUsed' field.
      * @return The value.
      */
    public java.lang.Long getGasUsed() {
      return gasUsed;
    }

    /**
      * Sets the value of the 'gasUsed' field.
      * @param value The value of 'gasUsed'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setGasUsed(long value) {
      validate(fields()[11], value);
      this.gasUsed = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'gasUsed' field has been set.
      * @return True if the 'gasUsed' field has been set, false otherwise.
      */
    public boolean hasGasUsed() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'gasUsed' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearGasUsed() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'mixHash' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getMixHash() {
      return mixHash;
    }

    /**
      * Sets the value of the 'mixHash' field.
      * @param value The value of 'mixHash'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setMixHash(java.nio.ByteBuffer value) {
      validate(fields()[12], value);
      this.mixHash = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'mixHash' field has been set.
      * @return True if the 'mixHash' field has been set, false otherwise.
      */
    public boolean hasMixHash() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'mixHash' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearMixHash() {
      mixHash = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'extraData' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getExtraData() {
      return extraData;
    }

    /**
      * Sets the value of the 'extraData' field.
      * @param value The value of 'extraData'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setExtraData(java.nio.ByteBuffer value) {
      validate(fields()[13], value);
      this.extraData = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'extraData' field has been set.
      * @return True if the 'extraData' field has been set, false otherwise.
      */
    public boolean hasExtraData() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'extraData' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearExtraData() {
      extraData = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'nonce' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getNonce() {
      return nonce;
    }

    /**
      * Sets the value of the 'nonce' field.
      * @param value The value of 'nonce'.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder setNonce(java.nio.ByteBuffer value) {
      validate(fields()[14], value);
      this.nonce = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
      * Checks whether the 'nonce' field has been set.
      * @return True if the 'nonce' field has been set, false otherwise.
      */
    public boolean hasNonce() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'nonce' field.
      * @return This builder.
      */
    public io.enkrypt.avro.BlockHeader.Builder clearNonce() {
      nonce = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BlockHeader build() {
      try {
        BlockHeader record = new BlockHeader();
        record.parentHash = fieldSetFlags()[0] ? this.parentHash : (io.enkrypt.avro.Bytes32) defaultValue(fields()[0]);
        record.unclesHash = fieldSetFlags()[1] ? this.unclesHash : (io.enkrypt.avro.Bytes32) defaultValue(fields()[1]);
        record.coinbase = fieldSetFlags()[2] ? this.coinbase : (io.enkrypt.avro.Bytes20) defaultValue(fields()[2]);
        record.stateRoot = fieldSetFlags()[3] ? this.stateRoot : (io.enkrypt.avro.Bytes32) defaultValue(fields()[3]);
        record.txTrieRoot = fieldSetFlags()[4] ? this.txTrieRoot : (io.enkrypt.avro.Bytes32) defaultValue(fields()[4]);
        record.receiptTrieRoot = fieldSetFlags()[5] ? this.receiptTrieRoot : (io.enkrypt.avro.Bytes32) defaultValue(fields()[5]);
        record.logsBloom = fieldSetFlags()[6] ? this.logsBloom : (java.nio.ByteBuffer) defaultValue(fields()[6]);
        record.difficulty = fieldSetFlags()[7] ? this.difficulty : (java.nio.ByteBuffer) defaultValue(fields()[7]);
        record.timestamp = fieldSetFlags()[8] ? this.timestamp : (java.lang.Long) defaultValue(fields()[8]);
        record.number = fieldSetFlags()[9] ? this.number : (java.lang.Long) defaultValue(fields()[9]);
        record.gasLimit = fieldSetFlags()[10] ? this.gasLimit : (java.nio.ByteBuffer) defaultValue(fields()[10]);
        record.gasUsed = fieldSetFlags()[11] ? this.gasUsed : (java.lang.Long) defaultValue(fields()[11]);
        record.mixHash = fieldSetFlags()[12] ? this.mixHash : (java.nio.ByteBuffer) defaultValue(fields()[12]);
        record.extraData = fieldSetFlags()[13] ? this.extraData : (java.nio.ByteBuffer) defaultValue(fields()[13]);
        record.nonce = fieldSetFlags()[14] ? this.nonce : (java.nio.ByteBuffer) defaultValue(fields()[14]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BlockHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<BlockHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BlockHeader>
    READER$ = (org.apache.avro.io.DatumReader<BlockHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}