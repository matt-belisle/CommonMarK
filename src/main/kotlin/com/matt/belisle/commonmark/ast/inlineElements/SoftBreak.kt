package com.matt.belisle.commonmark.ast.inlineElements

// represents a <softBreak> HTML element will be rendered as a lineEnding

val lineEnding = "\u000A"
class SoftBreak: Inline() {
    override fun render(): String {
        return lineEnding
    }
}