package com.matt.belisle.commonmark.ast

//Any *companion* object implementing this will cause a new block to be returned
interface IParsable<T> {
    fun parse(line: String, indentation: Int): T
}