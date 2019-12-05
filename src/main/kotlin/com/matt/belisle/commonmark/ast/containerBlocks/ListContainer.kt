package com.matt.belisle.commonmark.ast.containerBlocks

class ListContainer(parent: Container) : Container(parent = parent) {
    override fun dropPrefix(line: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //TODO Implement this is placeholder for various matching logic
//    override val canLazyContinue: Boolean = true
//    override val canBeConsecutive: Boolean = false
//    override val canInterruptParagraph: Boolean = true


    override fun match(line: String): Boolean {
        TODO("not implemented")
    }
}