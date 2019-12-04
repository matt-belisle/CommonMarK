package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.Inline

abstract class Leaf(parent: Container, indent: Int) : Block(parent = parent, indent = indent) {
    // a list of inline elements for the leaf node, can be text, emphasis etc
    // see InlineElements package
    val inline: MutableList<Inline> = mutableListOf()

    // will add a new line to the block, assert match to make sure the line should be appended
    abstract fun appendLine(line: String)

    // leaf block consumes lines so if we consume return an empty string -- this should not ever be used
    internal fun returnLineIfFalse(boolean: Boolean, line: String) =
        if (boolean) Pair(boolean, "") else Pair(boolean, line)
}