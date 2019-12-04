package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.ILazyMatch
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf

// A container block contains other blocks ex: BlockQuote, List, ListItem

abstract class Container(parent: Container?) : Block(parent = parent, indent = 0) {

    internal val children: MutableList<Block> = mutableListOf()

    fun getLastChild(): Block? = if (children.size > 0) children.last() else null

    fun addChild(child: Block) = children.add(child)

    abstract fun dropPrefix(line: String): String

    internal fun lazyContinue(line: String): Boolean {
        val lastChild = getLastChild()
        if (lastChild != null && lastChild.isOpen()) {
            if (lastChild is Leaf && lastChild is ILazyMatch) {
                return lastChild.lazyMatch(line)
            } else if (lastChild is Container) {
                //recursive call will dig down to final open block in chain and see whether it can continue
                return lastChild.lazyContinue(line)
            }

        }
        return false
    }

    private fun closeAllChildren() = children.forEach { it.close() }

    override fun close() {
        closeAllChildren()
        super.close()
    }
}