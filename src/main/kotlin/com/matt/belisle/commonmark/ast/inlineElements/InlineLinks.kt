package com.matt.belisle.commonmark.ast.inlineElements

abstract class InlineLinks(val destination: String, title: String, var textEnd: Int = 0) : Inline()