package com.matt.belisle.commonmark.ast.inlineElements

// Placeholder for now used in leafBlocks as their "children" a concatenation of their children will be the render
abstract class Inline {
    //TODO remove this
    open fun render(): String {
        return ""
    }
}