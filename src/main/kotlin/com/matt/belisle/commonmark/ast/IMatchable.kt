package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf

//used for the companion object implementation of static which needs the indentation level
interface IStaticMatchable<T> {
    fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean


    val canInterruptParagraph: Boolean

}

interface IStaticMatchableLeaf<T : Leaf> : IStaticMatchable<T> {

    fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): T

}

interface IStaticMatchableContainer<T : Container> : IStaticMatchable<T> {

    fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): Pair<T, String>

}

//used for the actual block implementations
interface IMatchable {
    fun match(line: String): Boolean
}