package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.ContainerBlocks.Container

// represents the root node of the markdown AST, will be closed when the entire document is parsed
// can never be continued or have anything after
class Document: Container() {
    override val canLazyContinue: Boolean = false
    override val canBeConsecutive: Boolean = false

    // can never make another root node, so no line can match it
    override fun match(line: String) = false
}