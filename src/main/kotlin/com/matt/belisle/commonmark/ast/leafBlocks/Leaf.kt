package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.Inline
import java.lang.StringBuilder

abstract class Leaf(parent: Container, indent: Int) : Block(parent = parent, indent = indent) {
    // a list of inline elements for the leaf node, can be text, emphasis etc
    // see InlineElements package
    val inline: MutableList<Inline> = mutableListOf()

    fun renderInline(): String{
        val builder = StringBuilder()
        with(builder) {
            for (inlineString in inline) {
                append(inlineString.render())
                if (inlineString != inline.last()) append('\n')
            }
        }
        return builder.toString()
    }

    // will add a new line to the block, assert match to make sure the line should be appended
    abstract fun appendLine(line: String)


    override fun equals(other: Any?): Boolean {
        return if(other is Leaf) serialNumber == other.serialNumber && inline == other.inline else false
    }
}