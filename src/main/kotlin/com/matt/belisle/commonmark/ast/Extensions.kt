package com.matt.belisle.commonmark.ast

import java.lang.StringBuilder

//This includes tabs expanded to a tab stop of 4
fun String.countLeadingSpaces(): Pair<Int,Int> {
    var count = 0
    var index = 0
    for(i in this){
        when(i){
            ' ' -> count++
            '\t' -> count += 4 - count % 4
            else -> return Pair(count,index)
        }
        index++
    }
    return Pair(count, index)
}

fun String.countTrailingSpaces(): Int {
    return this.countTrailingChar(' ')
}

fun String.countLeadingChar(char: Char): Int {
    var count = 0
    while (count < this.length && this[count] == char) {
        count++
    }
    return count
}

fun String.countTrailingChar(char: Char): Int {
    var count = 0
    while (count < this.length && this[length - 1 - count] == char) {
        count++
    }
    return count
}

//removes up to amount of the character
fun String.removeLeadingChar(char: Char, amount: Int): String {
    var am = amount
    return this.dropWhile {
        it == char && am-- > 0
    }
}

// correctly removes the indent including tabs expanded to four tab stop
fun String.removeIndent(indent: Int): String{
    val builder = StringBuilder()
    var index = 0
    var count = 0
    for(i in this) {
        when(i){
            ' ' -> count++
            '\t' -> count += 4 - count % 4
            else -> return substring(index)
        }

        index++
        if(count == indent){
            return substring(index)
        } else if(count > indent){
            builder.append(" ".repeat(count - indent))
            builder.append(substring(index))
            return builder.toString()
        }
    }
    // empty line with not enough indent to remove
    return ""
}
fun indentCheck(indent: Int) = 4 + indent

