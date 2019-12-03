package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block

// A container block contains other blocks ex: BlockQuote, List, ListItem

abstract class Container(parent: Container?): Block(parent = parent, indent = 0){

    internal val children: MutableList<Block> = mutableListOf()

    fun getLastChild(): Block? = if(children.size > 0) children.last()  else null

    fun addChild(child: Block) = children.add(child)

    private fun closeAllChildren() = children.forEach { it.close()}

    override fun close() {
        closeAllChildren()
        super.close()
    }
}