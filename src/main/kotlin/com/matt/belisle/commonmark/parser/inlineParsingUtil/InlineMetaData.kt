package com.matt.belisle.commonmark.parser.inlineParsingUtil

// custom elements may only add delimter types, not new inlines
enum class InlineTypes{ SOFT_BREAK,HARD_BREAK, CODE_SPAN, BACKSLASH,
    WEAK_EMPHASIS, STRONG_EMPHASIS, ENTITY, IMAGE, RAW_HTML, AUTO_LINK, LINK,NONE}
//Extra can be used for anything, but should be well defined this would be useful for things like links as links have
// a lot of processing done to determine whats what at the time of parsing, so we may as well use that
// most types wont use it but the ones that should, will
// this could be used to whitelist html tags for example...
data class InlineMetaData(var start: Int, var end: Int, val type: InlineTypes, var extra: Any = false): Comparable<InlineMetaData> {
    override fun compareTo(other: InlineMetaData): Int {
        // basically these will be put into a priority queue
        // if they are the same start (emphasis) we would like to see the longer one first
        return if(start == other.start){
            other.end.compareTo(end)
        } else {
            start.compareTo(other.start)
        }
    }
}