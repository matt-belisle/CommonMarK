package com.matt.belisle.commonmark.ast.ContainerBlocks

import com.matt.belisle.commonmark.ast.countLeadingSpaces

class ListItem: Container(){
    //TODO implement
    override val canLazyContinue: Boolean = true
    override val canBeConsecutive: Boolean = false

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