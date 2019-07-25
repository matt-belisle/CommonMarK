package com.matt.belisle.commonmark.ast

fun String.countLeadingSpaces(): Int {
    return countLeadingChar(' ')
}
fun String.countTrailingSpaces(): Int {
    return this.countTrailingChar(' ')
}

fun String.countLeadingChar(char: Char): Int {
    var count = 0
    while(count < this.length && this[count] == char){
        count++
    }
    return count
}

fun String.countTrailingChar(char: Char): Int {
    var count = 0
    while(count < this.length && this[length - 1 - count] == char){
        count++
    }
    return count
}