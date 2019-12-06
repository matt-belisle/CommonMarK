package com.matt.belisle.commonmark.ast
//used for a list, where the container can only hold other containers, so this allows you to create new children if matched
interface IMetaContainer {
    // returns the remainder of the string
    fun appendLine(line: String): String
}