package com.matt.belisle.commonmark.ast.inlineElements

class HardBreak : Inline(){
    override fun render(): String {
        return "<br />"
    }
}