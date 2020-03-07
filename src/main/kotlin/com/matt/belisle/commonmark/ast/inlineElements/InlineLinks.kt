package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement

abstract class InlineLinks(val destination: String, title: String, var textEnd: Int = 0) : Inline() {
    private val title = InlineString(title)
    val text: MutableList<Inline> = mutableListOf()
    // note that both link and image share the same output but with different locations for their items
    internal fun prepRender(entities: Boolean, normalizeAltTag: Boolean = false): Triple<String, String, String> {
        val titleRendered = if(title.strBuilder.isNotBlank()) " title=\"${title.render(entities = true)}\"" else ""
        val entitiesDest = EntityReplacement.inspect(destination, false)
        val destinationWithEntitiesRemoved = renderEntities(entitiesDest)
        val textB = StringBuilder()
        with(textB){
            if(normalizeAltTag){
                text.forEach { append(it.renderTextContentOnly(entities)) }
            }else {
                text.forEach { append(it.render(entities)) }
            }
        }
        return Triple(titleRendered, destinationWithEntitiesRemoved, textB.toString())
    }

    fun getTitle() = title.strBuilder.toString()

    override fun renderTextContentOnly(entities: Boolean): String {
        val builder = StringBuilder()
        with(builder){
            text.forEach { append(it.renderTextContentOnly(entities)) }
        }
        return builder.toString()
    }
}