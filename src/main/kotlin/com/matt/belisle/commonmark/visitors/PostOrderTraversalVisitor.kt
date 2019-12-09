package com.matt.belisle.commonmark.visitors

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.containerBlocks.Container


abstract class PostOrderTraversalVisitor() : Visitor(){
    override fun traverse(block: Block): List<Block> {
        return if(block is Container){
            val list = mutableListOf<Block>()
            block.children.forEach {
                list.addAll(traverse(it))
            }
            if(list != block.children){
                block.children.clear()
                block.children.addAll(list)
            }
            visit(block)
        } else {
            //must be a leaf
            visit(block)
        }
    }
}