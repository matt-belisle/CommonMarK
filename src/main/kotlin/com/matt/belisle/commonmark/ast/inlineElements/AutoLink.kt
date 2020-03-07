package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement
import com.matt.belisle.commonmark.parser.inlineParsingUtil.Escaping

//The given regex from the spec does not perform well in Java, this was found @ https://emailregex.com/ and enforces the RFC 5322 standard
val EMAIL_REGEX: Regex = Regex("""[a-zA-Z0-9.!#${'$'}%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*""");

class AutoLink(private val str: String) : Inline(){
    private val type: String = if(EMAIL_REGEX.matchEntire(str) != null) "mailto:" else ""
    override fun render(entities: Boolean): String {
        val replacedEntities = EntityReplacement.inspect(str, true)
        // render the entities
        val rendered = renderEntities(replacedEntities)
        //TODO encode the link url... 599 enforces but with the way a URI is defined this is difficult
        val encoded = if(type == "") Escaping.percentEncodeUrl(rendered) else rendered
        // this will need entity replacement obviously
        return "<a href=\"$type${encoded}\">$rendered</a>"
    }

    override fun renderTextContentOnly(entities: Boolean): String {
        return InlineString(str).render(entities)
    }

}