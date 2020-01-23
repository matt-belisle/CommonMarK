package com.matt.belisle.commonmark.ast.inlineElements

class RawHTML(val line: String) : Inline(){
    override fun render(entities: Boolean): String {
        return line
    }
}