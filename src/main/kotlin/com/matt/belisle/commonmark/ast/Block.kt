package com.matt.belisle.commonmark.ast



abstract class Block(public val indent: Int): IMatchable {
    //if this is closed then nothing new can happen to it
    private var isOpen: Boolean = true

    //Block Quote provides a good meaning for these booleans
    // https://spec.commonmark.org/0.29/#block-quotes
    abstract val canLazyContinue: Boolean
    // basically can a new block (of the same type) be opened without an empty line between
    abstract val canBeConsecutive: Boolean

    fun close(){
        assert(isOpen)
        isOpen = false
    }

    fun isOpen(): Boolean{
        return isOpen
    }

    override fun match(line: String): Boolean {
        return isOpen
    }



}