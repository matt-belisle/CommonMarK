package com.matt.belisle.commonmark.parser.inlineParsingUtil

import java.lang.StringBuilder

fun isAsciiChar(char: Char): Boolean = char in 'a'..'z' || char in 'A'..'Z'
// TODO see if can merge with HTML lexer, I believe i should be able to
class InlineLexer(val line: String){
    private var index = 0

    fun isEndOfData(): Boolean {
        return index >= line.length - 1
    }

    fun inspect(char: Char): Boolean {
        return !isEndOfData() && line[index] == char
    }
    fun inspect(str:String): Boolean {
        return if(index + str.length > line.length){
            false
        } else {
            line.substring(index, index + str.length) == str
        }

    }

    fun subString(start: Int, end: Int) = line.substring(start, end)
    fun subString(start: Int) = line.substring(start)
    // space for now as this should ONLY be used for Empahsis which is fine with this
    fun getChar(ind: Int = this.index) = if(ind >= line.length || ind < 0) {' '} else { line[ind] }


    fun inspect(f: (Char) -> Boolean) = f(line[index])

    fun isAsciiChar(): Boolean = isAsciiChar(line[index])

    fun advanceCharacter(amount: Int = 1){
        index += amount
    }
    fun inspectWhitespace(): Boolean = line[index].isWhitespace()
    fun skipSpaces() = advanceWhile { it.isWhitespace() || it == '\n'}

    // takes a predicate and continues until the predicate is false or end of line
    fun advanceWhile(f: (Char) -> Boolean): Int {
        var advanced = 0
        while(!isEndOfData() && f(line[index])){
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
            while (!isEndOfData() && f(line[index])) {
                append(line[index])
                index++
            }
        }
        return stringBuilder.toString()
    }

    fun restOfLineIsEmpty(): Boolean = isEndOfData() || line.trimEnd().length == index
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

    // will skip spaces including up to a specified number of newlines
    //if maxNewLines is -1 just skip as many as possible
    fun skipSpacesMaximumNewLines(maximumNewlines:Int): Int {
        // optional whitespace, this uses unicode whitespace, new line not going to advance through
        advanceWhile { it != '\n' && it.isWhitespace() }
        //up to one line ending
        var i = 0
        // -1 means infinite new lines
        while(maximumNewlines == -1 || i < maximumNewlines) {
            if (inspect('\n')) {
                i++
                advanceCharacter()
            } else {
                break
            }
            advanceWhile { it != '\n' && it.isWhitespace() }
        }
        return i
    }
}