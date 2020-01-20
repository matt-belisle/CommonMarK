package com.matt.belisle.commonmark.parser.inlineMatchers

import com.matt.belisle.commonmark.ast.inlineElements.Inline
// custom elements may only add delimter types, not new inlines
enum class InlineTypes{ SOFTBREAK,HARDBREAK, CODESPAN,NONE}
data class InlineMetaData(val start: Int,val end: Int, val type: InlineTypes): Comparable<InlineMetaData> {
    override fun compareTo(other: InlineMetaData): Int {
        // others will be before it if it starts earlier
        return start.compareTo(other.start)
    }
}