package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.InlineElements.Inline

abstract class Leaf(indentation: Int): Block(indentation){
    // a list of inline elements for the leaf node, can be text, emphasis etc
    // see InlineElements package
    val inline: MutableList<Inline> = mutableListOf()

    // will add a new line to the block, assert match to make sure the line should be appended
    abstract fun appendLine(line: String)
}