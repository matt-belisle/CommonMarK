package com.matt.belisle.commonmark.ast.inlineElements

import java.util.regex.Pattern

//The given regex from the spec does not perform well in Java, this was found @ https://emailregex.com/ and enforces the RFC 5322 standard
val EMAIL_REGEX: Regex = Regex("""[a-zA-Z0-9.!#${'$'}%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*""");

class AutoLink(private val str: String) : Inline(){
    private val type: String = if(EMAIL_REGEX.matchEntire(str) != null) "mailto:" else ""
    override fun render(): String {
        // this will need entity replacement obviously
        return "<a href=\"$type${str}\">$str</a>"
    }
}