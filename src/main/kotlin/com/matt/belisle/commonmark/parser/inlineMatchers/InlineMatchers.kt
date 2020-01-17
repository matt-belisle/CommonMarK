package com.matt.belisle.commonmark.parser.inlineMatchers

import com.matt.belisle.commonmark.ast.inlineElements.Inline

abstract class InlineMatchers {
    // returns the new inlines
    abstract fun match(inlines: List<Inline>): List<Inline>
}
