package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.ILazyMatch
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf

// A container block contains other blocks ex: BlockQuote, List, ListItem

abstract class Container(parent: Container?, indent: Int) : Block(parent = parent, indent = indent) {

    val children: MutableList<Block> = mutableListOf()

    fun getLastChild(): Block? = if (children.size > 0) children.last() else null

    open fun addChild(child: Block) = children.add(child)

    abstract fun dropPrefix(line: String): String

    internal fun lazyContinue(line: String): Pair<Boolean, Block> {
        val lastChild = getLastChild()
        if (lastChild != null && lastChild.isOpen()) {
            if (lastChild is Leaf && lastChild is ILazyMatch) {
                return Pair(lastChild.lazyMatch(line), lastChild)
            } else if (lastChild is Container) {
                //recursive call will dig down to final open block in chain and see whether it can continue
                return lastChild.lazyContinue(line)
            }

        }
        return Pair(false, this)
    }

    private fun closeAllChildren() = children.forEach { it.close() }

    override fun close() {
        closeAllChildren()
        super.close()
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Container) serialNumber == other.serialNumber && children == other.children else false
    }
}