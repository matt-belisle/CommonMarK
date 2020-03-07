package com.matt.belisle.commonmark.ast.inlineElements

import java.lang.StringBuilder

abstract class InlineEmphasis(val inlines: List<Inline>, val strong: Boolean, val delimiterChar: String): Inline() {
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

    override fun renderTextContentOnly(entities: Boolean): String {
        val builder = StringBuilder()
        with(builder){
            for(item in inlines){
                append(item.renderTextContentOnly(entities))
            }
        }
        return builder.toString()
    }
}
