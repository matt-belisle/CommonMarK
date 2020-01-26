package com.matt.belisle.commonmark.visitors.listVisitors

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.ListContainer
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.visitors.PostOrderTraversalVisitor

// the point of this is to propagate the blankLine inside of listItems if the last lines in the listItem are blank,
// as these lines actually correspond to the list it is contained in
class BlankLinePropagationVisitor : PostOrderTraversalVisitor() {
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
        return if(listItems.children.size > 1 && listItems.children.last() is BlankLine){
            val blankLine = listItems.children.last()
            listItems.children.removeAt(listItems.children.size - 1)
            listOf(listItems, blankLine)
        } else {
            listOf(listItems)
        }
    }

    override fun visit(document: Document): List<Block> {
        return listOf(document)
    }

    override fun visit(blockQuote: BlockQuote): List<Block> {
        return listOf(blockQuote)
    }

    override fun visit(listContainer: ListContainer): List<Block> {
        // should not be any at this point in processing
        throw Exception("There should not be any lists created when this visitor is running")
    }


}