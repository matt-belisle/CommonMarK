package com.matt.belisle.commonmark.ast

interface IMatchable {
    fun match(line: String): Boolean
}