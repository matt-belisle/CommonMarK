package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.countLeadingSpaces

class BlockQuote(parent: Container): Container(parent = parent){
//    override val canLazyContinue: Boolean = true
//    override val canBeConsecutive: Boolean = false
//    override val canInterruptParagraph: Boolean = true


    override fun match(line: String): Boolean {
        if(!super.match(line)){
            // open check
            return false
        }

        val leadingSpaces = line.countLeadingSpaces()
        if(leadingSpaces < 4){
            val stripped = line.drop(leadingSpaces)
            //see if last open block is open
            return children.last().match(stripped)
        }

        return false
    }
}