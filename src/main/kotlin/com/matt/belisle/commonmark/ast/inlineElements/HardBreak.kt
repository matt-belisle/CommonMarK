package com.matt.belisle.commonmark.ast.inlineElements

class HardBreak : Inline(){
    override fun render(entities: Boolean): String {
        return "<br />\n"
    }
}