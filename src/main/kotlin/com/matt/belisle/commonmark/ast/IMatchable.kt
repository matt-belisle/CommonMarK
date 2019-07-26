package com.matt.belisle.commonmark.ast

//used for the companion object implementation of static which needs the indentation level
interface IStaticMatchable {
    fun match(line: String, indentation: Int): Boolean
}

//used for the actual block implementations
interface IMatchable {
    fun match(line: String): Boolean
}