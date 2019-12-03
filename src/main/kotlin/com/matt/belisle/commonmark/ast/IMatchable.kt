package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.containerBlocks.Container

//used for the companion object implementation of static which needs the indentation level
interface IStaticMatchable<Leaf> {
    fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean

    fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): Leaf

    //Block Quote provides a good meaning for these booleans
    // https://spec.commonmark.org/0.29/#block-quotes
    val canLazyContinue: Boolean
    // basically can a new block (of the same type) be opened without an empty line between
    val canBeConsecutive: Boolean

    val canInterruptParagraph: Boolean

}

//used for the actual block implementations
interface IMatchable {
    fun match(line: String): Boolean
}