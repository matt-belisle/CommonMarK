package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.Entity


class InlineEntity(private val entity: Entity): Inline() {
    override fun render(entities: Boolean): String {
        return entity.characters
    }

    override fun renderTextContentOnly(entities: Boolean): String {
        return entity.characters
    }
}