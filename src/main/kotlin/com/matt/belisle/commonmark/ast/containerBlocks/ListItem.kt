package com.matt.belisle.commonmark.ast.containerBlocks

class ListItem(parent: Container) : Container(parent = parent) {

    override val canLazyContinue: Boolean = false

    override fun dropPrefix(line: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //TODO implement
//    override val canLazyContinue: Boolean = true
//    override val canBeConsecutive: Boolean = false
//    override val canInterruptParagraph: Boolean = true


    override fun match(line: String): Boolean {
        TODO("not implemented")
    }
}