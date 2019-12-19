package com.matt.belisle.commonmark.ast.leafBlocks.util

import java.lang.StringBuilder

fun isAsciiChar(char: Char): Boolean = char in 'a'..'z' || char in 'A'..'Z'
class Lexer(val line: String){
    private var index = 0

    fun isEndOfLine(): Boolean {
        return index == line.length
    }

    fun inspect(char: Char): Boolean {
        return !isEndOfLine() && line[index] == char
    }

    // This is not an LL1 parser so we may need to go back one
    fun goBackOne() = index--
    fun inspect(f: (Char) -> Boolean) = f(line[index])

    fun isAsciiChar(): Boolean = isAsciiChar(line[index])

    fun advanceCharacter(amount: Int = 1){
        index += amount
    }
    fun inspectWhitespace(): Boolean = line[index].isWhitespace()
    fun skipSpaces() = advanceWhile { it.isWhitespace() }

    // takes a predicate and continues until the predicate is false or end of line
    fun advanceWhile(f: (Char) -> Boolean) {
        while(!isEndOfLine() && f(line[index])){
            index++
        }
    }

    fun returnMatchedWhile(f: (Char) -> Boolean): String {
        val stringBuilder = StringBuilder()
        with(stringBuilder) {
            while (!isEndOfLine() && f(line[index])) {
                append(line[index])
                index++
            }
        }
        return stringBuilder.toString()
    }

    fun restOfLineIsEmpty(): Boolean = line.trimEnd().length == index
    //reusable, note not thread safe
    fun reset(){
        index = 0
    }
}