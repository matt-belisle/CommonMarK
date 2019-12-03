package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.ast.containerBlocks.Container

// represents the root node of the markdown AST, will be closed when the entire document is parsed
// can never be continued or have anything after
class Document : Container(parent = null) {

    // can never make another root node, so no line can match it
    override fun match(line: String) = false

    override fun render(): String {
        val builder = StringBuilder()

        with(builder){
            for (child in children) {
                append(child.render())
            }
        }

        return builder.toString()
    }

    fun getLastOpenBlock(): Block {
        var block: Block = this
        while(block.isOpen()){
            if(block is Container && block.getLastChild() != null && block.getLastChild()!!.isOpen()){
                block = block.getLastChild()!!
            } else if(block.isOpen()){
                return block
            }
        }
        return this
    }
}