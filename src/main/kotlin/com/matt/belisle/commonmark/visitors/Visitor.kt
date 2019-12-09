package com.matt.belisle.commonmark.visitors

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.containerBlocks.ListContainer
import com.matt.belisle.commonmark.ast.leafBlocks.*

abstract class Visitor {
    fun simplify(block: Block): Block{
        var current: Block
        var simplified = block
        do{
            current = simplified
            simplified = traverse(current).first()
        }while(simplified != current)
        
        return simplified
    }
    // will rewrite to a new tree
    abstract fun traverse(block: Block): List<Block>

    fun visit(block: Block): List<Block> {
        return when(block){
            is ATXHeading -> visit(block)
            is BlankLine -> visit(block)
            is CodeFence -> visit(block)
            is IndentedCodeBlock -> visit(block)
            is Paragraph -> visit(block)
            is ThematicBreak -> visit(block)
            is ListItem -> visit(block)
            is Document -> visit(block)
            is BlockQuote -> visit(block)
            is ListContainer -> visit(block)

            else -> throw Exception("This blocktype is not implemented for the visitor ${block::class}")
        }

    }

    abstract fun visit(atxHeading: ATXHeading): List<Block>
    abstract fun visit(blankLine: BlankLine): List<Block>
    abstract fun visit(codeFence: CodeFence): List<Block>
    abstract fun visit(indentedCodeBlock: IndentedCodeBlock): List<Block>
    abstract fun visit(paragraph: Paragraph): List<Block>
    abstract fun visit(thematicBreak: ThematicBreak): List<Block>

    abstract fun visit(listItems: ListItem): List<Block>
    abstract fun visit(document: Document): List<Block>
    abstract fun visit(blockQuote: BlockQuote): List<Block>
    abstract fun visit(listContainer: ListContainer): List<Block>
}