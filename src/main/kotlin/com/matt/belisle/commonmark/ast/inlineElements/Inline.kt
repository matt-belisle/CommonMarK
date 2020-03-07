package com.matt.belisle.commonmark.ast.inlineElements

import java.lang.StringBuilder

// Placeholder for now used in leafBlocks as their "children" a concatenation of their children will be the render
abstract class Inline {
    //TODO remove this
    open fun render(entities: Boolean = true): String {
        return ""
    }

    internal fun renderEntities(entities: List<Inline>): String {
        val builder = StringBuilder()

        with(builder) {
            entities.forEach { inline ->
                // no more entities
                append(inline.render(false))
            }
        }
        return builder.toString()
    }
    //this is used exclusively for images
    internal open fun renderTextContentOnly(entities: Boolean): String {
        return ""
    }
}