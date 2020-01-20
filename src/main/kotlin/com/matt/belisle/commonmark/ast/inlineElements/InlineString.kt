package com.matt.belisle.commonmark.ast.inlineElements

// just a string, either no inlines parsed or the text contained needs no special rendering
class InlineString(val line: String) : Inline() {
    override fun render(): String {
        return render(false)
    }
    fun render(trimEnd: Boolean): String{
        return if(trimEnd){
            line.dropLastWhile { it.isWhitespace() }
        } else line
    }
}