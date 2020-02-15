package com.matt.belisle.commonmark.ast.inlineElements

import java.lang.StringBuilder
import java.net.URI
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.Charset

class Link (val destination: String, title: String, var textEnd: Int = 0) : Inline() {
    private val title = InlineString(title)
    val text: MutableList<Inline> = mutableListOf()

    /*
    <a href="/uri" title="title">link</a> -- both title and dest
    <a title="title">link</a> -- just title
    <a href="dest">link</a> -- just dest
     */
    override fun render(entities: Boolean): String {

        val titleRendered = if(title.strBuilder.isNotBlank()) " title=\"${title.render(entities = true)}\"" else ""
        val destinationRendered = if (destination != "") "href=\"${destination}\"" else ""
        val textB = StringBuilder()
        with(textB){
            text.forEach { append(it.render(entities)) }
        }
        return "<a href=\"$destination\"$titleRendered>$textB</a>"
    }
}
