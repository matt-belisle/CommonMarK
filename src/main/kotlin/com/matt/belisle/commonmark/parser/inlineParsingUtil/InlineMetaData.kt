package com.matt.belisle.commonmark.parser.inlineParsingUtil

// custom elements may only add delimter types, not new inlines
enum class InlineTypes{ SOFT_BREAK,HARD_BREAK, CODE_SPAN, BACKSLASH,
    WEAK_EMPHASIS, STRONG_EMPHASIS, ENTITY, IMAGE, RAW_HTML, AUTO_LINK, LINK,NONE}
//Extra can be used for anything, but should be well defined this would be useful for things like links as links have
// a lot of processing done to determine whats what at the time of parsing, so we may as well use that
// most types wont use it but the ones that should, will
// this could be used to whitelist html tags for example...
data class InlineMetaData(val start: Int,val end: Int, val type: InlineTypes, val extra: Any = false): Comparable<InlineMetaData> {
    override fun compareTo(other: InlineMetaData): Int {
        // others will be before it if it starts earlier
        return start.compareTo(other.start)
    }
}