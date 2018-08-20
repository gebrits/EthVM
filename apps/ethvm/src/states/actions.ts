import defaultRooms from '@app/configs/defaultRooms.json'
import sEvents from '@app/configs/socketEvents.json'
import { Block, Tx } from '@app/libs'
import { BlockLayout, TxLayout } from '@app/typeLayouts'

const socket_newBlock = ({ commit }, block: BlockLayout | BlockLayout[]) => {
  commit(sEvents.newBlock, block)
  this._vm.$eventHub.$emit(sEvents.newBlock, Array.isArray(block) ? new Block(block[0]) : new Block(block))
}

const socket_newTx = function({ commit }, tx: TxLayout | TxLayout[]) {
  commit(sEvents.newTx, tx)
  this._vm.$eventHub.$emit(sEvents.newTx, Array.isArray(tx) ? new Tx(tx[0]) : new Tx(tx))
}

const socket_connect = ({}, tx: TxLayout) => {
  this._vm.$socket.emit(sEvents.join, { rooms: defaultRooms })
}

export default {
  socket_newBlock,
  socket_newTx,
  socket_connect
}
