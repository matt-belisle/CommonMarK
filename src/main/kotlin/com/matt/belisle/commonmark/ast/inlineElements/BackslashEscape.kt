package com.matt.belisle.commonmark.ast.inlineElements

// Represents a backslash escaped character
class BackslashEscape(private val char: Char) : Inline(){
    override fun render(): String {
        return char.toString()
    }
}