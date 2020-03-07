package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement
import com.matt.belisle.commonmark.parser.inlineParsingUtil.Escaping
import java.lang.StringBuilder

class Link (destination: String, title: String, textEnd: Int = 0) : InlineLinks(destination, title, textEnd) {
    private val title = InlineString(title)
    val text: MutableList<Inline> = mutableListOf()

    /*
    <a href="/uri" title="title">link</a> -- both title and dest
    <a title="title">link</a> -- just title
    <a href="dest">link</a> -- just dest
     */
    override fun render(entities: Boolean): String {

        val titleRendered = if(title.strBuilder.isNotBlank()) " title=\"${title.render(entities = true)}\"" else ""
        val entitiesDest = EntityReplacement.inspect(destination, false)
        val destinationWithEntitiesRemoved = renderEntities(entitiesDest)
        val textB = StringBuilder()
        with(textB){
            text.forEach { append(it.render(entities)) }
        }
        return "<a href=\"${Escaping.percentEncodeUrl(destinationWithEntitiesRemoved)}\"$titleRendered>$textB</a>"
    }
}
