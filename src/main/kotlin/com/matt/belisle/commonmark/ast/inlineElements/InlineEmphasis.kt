package com.matt.belisle.commonmark.ast.inlineElements

import java.lang.StringBuilder

abstract class InlineEmphasis(val inlines: List<Inline>): Inline() {
    abstract val tag: String
    override fun render(entities: Boolean): String {
        val builder = StringBuilder()
        with(builder){
            append("<")
            append("$tag")
            append(">")
            for(item in inlines){
                append(item.render(entities))
            }
            append("</")
            append("$tag")
            append(">")
        }
        return builder.toString()
    }
}
