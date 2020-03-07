package com.matt.belisle.commonmark.visitors

//Some visitors (eg linkReferenceVisitor) may edit the tree to a state where two paragraphs are next to each other
// with no blank line in between, this will merge them
// To see an example of why this is necessary see spec test 185

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.containerBlocks.ListContainer
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.leafBlocks.*

class ParagraphMergerVisitor : PostOrderTraversalVisitor() {
    override fun visit(atxHeading: ATXHeading): List<Block> {
        return listOf(atxHeading)
    }

    override fun visit(blankLine: BlankLine): List<Block> {
        return listOf(blankLine)
    }

    override fun visit(indentedCodeBlock: IndentedCodeBlock): List<Block> {
        return listOf(indentedCodeBlock)
    }

    override fun visit(paragraph: Paragraph): List<Block> {
        return listOf(paragraph)
    }

    override fun visit(thematicBreak: ThematicBreak): List<Block> {
        return listOf(thematicBreak)
    }

    override fun visit(htmlBlock: HTMLBlock): List<Block> {
        return listOf(htmlBlock)
    }

    override fun visit(codeFence: CodeFence): List<Block> {
        return listOf(codeFence)
    }

    override fun visit(listItems: ListItem): List<Block> {
        return mergeParagraphs(listItems)
    }
    private fun mergeParagraphs(container: Container): List<Block> {
        if(container.children.size == 1)
            return listOf(container)
        var mergedChildren: List<Block> = container.children
        var nextMerge = mergedChildren
        do {
            mergedChildren = nextMerge
            nextMerge = mergeChildren(nextMerge)
        } while(nextMerge != mergedChildren)
        container.children.clear()
        container.children.addAll(nextMerge)
        return listOf(container)
    }

    private fun mergeChildren(preChildren: List<Block>): List<Block>{
        if(preChildren.size < 2){
            return preChildren
        }
        val children = mutableListOf<Block>()

        var index = 0
        var lastBlockMerged = false
        while(index < preChildren.size - 1){
            val block = preChildren[index]
            val next = preChildren[index + 1]
            if(block is Paragraph && next is Paragraph && !block.isSetext){
                // new paragraph block with the inlines from the other
                // combine the inlines
                children.add(block.merge(next))
                //skip this block when checking
                if(index + 1 == preChildren.size - 1){
                    lastBlockMerged = true
                }
                index++
            } else {
                children.add(block)
            }
            index++
        }
        if(!lastBlockMerged){
            children.add(preChildren.last())
        }
        return children
    }

    override fun visit(document: Document): List<Block> {
        return mergeParagraphs(document)
    }

    override fun visit(blockQuote: BlockQuote): List<Block> {
        return mergeParagraphs(blockQuote)
    }

    override fun visit(listContainer: ListContainer): List<Block> {
        // these should only contain listItems so no need to call this
        return listOf(listContainer)
    }


}