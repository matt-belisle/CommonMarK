package com.matt.belisle.commonmark.parser.inlineParsingUtil

// custom elements may only add delimter types, not new inlines
enum class InlineTypes{ SOFTBREAK,HARDBREAK, CODESPAN, BACKSLASH,
    WEAK_EMPHASIS, STRONG_EMPHASIS, ENTITY, IMAGE, RAW_HTML, AUTOLINK, LINK,NONE}
data class InlineMetaData(val start: Int,val end: Int, val type: InlineTypes): Comparable<InlineMetaData> {
    override fun compareTo(other: InlineMetaData): Int {
        // others will be before it if it starts earlier
        return start.compareTo(other.start)
    }
}