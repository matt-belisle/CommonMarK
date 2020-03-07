package com.matt.belisle.commonmark.ast.inlineElements

class RawHTML(val line: String) : Inline(){
    override fun render(entities: Boolean): String {
        return line
    }

    override fun renderTextContentOnly(entities: Boolean): String {
        return line
    }
}