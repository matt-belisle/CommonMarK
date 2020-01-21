package com.matt.belisle.commonmark.parser.inlineParsingUtil

import java.lang.StringBuilder

fun isAsciiChar(char: Char): Boolean = char in 'a'..'z' || char in 'A'..'Z'
// TODO see if can merge with HTML lexer, I believe i should be able to
class InlineLexer(val line: String){
    private var index = 0

    fun isEndOfLine(): Boolean {
        return index >= line.length - 1
    }

    fun inspect(char: Char): Boolean {
        return !isEndOfLine() && line[index] == char
    }

    fun subString(start: Int, end: Int) = line.substring(start, end)


    fun inspect(f: (Char) -> Boolean) = f(line[index])

    fun isAsciiChar(): Boolean = isAsciiChar(line[index])

    fun advanceCharacter(amount: Int = 1){
        index += amount
    }
    fun inspectWhitespace(): Boolean = line[index].isWhitespace()
    fun skipSpaces() = advanceWhile { it.isWhitespace() }

    // takes a predicate and continues until the predicate is false or end of line
    fun advanceWhile(f: (Char) -> Boolean): Int {
        var advanced = 0
        while(!isEndOfLine() && f(line[index])){
            index++
            advanced++
        }
        return advanced
    }

    fun reverseWhile(f: (Char) -> Boolean): Int {
        var reversed = 0
        while(index > 0 && f(line[index])){
            index--
            reversed++
        }
        return reversed
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

    fun restOfLineIsEmpty(): Boolean = isEndOfLine() || line.trimEnd().length == index
    //reusable, note not thread safe
    fun reset(){
        index = 0
    }

    // for forward checking, the parser needs to control this state
    fun goTo(index: Int) {
        this.index = index
    }
    fun saveIndex() = index

    // This is not an LL1 parser so we may need to go back one
    fun goBackOne() = goBackX(1)

    fun goBackX(x: Int){
        index -= x
        if(index < 0){
            index = 0
        }
    }
}