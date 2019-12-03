package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.containerBlocks.Container


abstract class Block(public val parent: Container?, public val indent: Int): IMatchable {
    //if this is closed then nothing new can happen to it
    private var isOpen: Boolean = true


    open fun close(){
        isOpen = false
    }

    fun isOpen(): Boolean{
        return isOpen
    }

    override fun match(line: String): Boolean {
        return isOpen
    }
    // TODO Remove default implementation
    open fun render() : String{
        return ""
    }



}