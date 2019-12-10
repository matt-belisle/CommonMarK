package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.visitors.Visitor


abstract class Block(var parent: Container?, val indent: Int) : IMatchable {
    private object SerialNumberObj{
        private var value = 0
        fun incrementAndGet() = value++
    }
    val serialNumber: Int = SerialNumberObj.incrementAndGet()

    //if this is closed then nothing new can happen to it
    private var isOpen: Boolean = true


    open fun close() {
        isOpen = false
    }

    fun accept(visitor: Visitor){
        visitor.visit(this)
    }

    fun isOpen(): Boolean {
        return isOpen
    }

    override fun match(line: String): Boolean {
        return isOpen
    }

    // TODO Remove default implementation
    open fun render(): String {
        return ""
    }


}