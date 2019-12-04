package com.matt.belisle.commonmark.ast

interface ILazyMatch {
    fun lazyMatch(line: String): Boolean
}