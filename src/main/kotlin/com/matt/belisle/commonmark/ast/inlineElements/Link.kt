package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.Escaping

class Link (destination: String, title: String, textEnd: Int = 0) : InlineLinks(destination, title, textEnd) {
    /*
    <a href="/uri" title="title">link</a> -- both title and dest
    <a title="title">link</a> -- just title
    <a href="dest">link</a> -- just dest
     */
    override fun render(entities: Boolean): String {

       val (renderedTitle, renderedDest, renderedText) = prepRender(entities)
        return "<a href=\"${Escaping.percentEncodeUrl(renderedDest)}\"$renderedTitle>$renderedText</a>"
    }
}
