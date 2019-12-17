package com.matt.belisle.commonmark.visitors.listVisitors

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.containerBlocks.ListContainer
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.visitors.PostOrderTraversalVisitor

class CreateListBlockVisitor : PostOrderTraversalVisitor() {
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
        return listOf(visitContainer(listItems))
    }

    override fun visit(document: Document): List<Block> {
        return listOf(visitContainer(document))
    }

    override fun visit(blockQuote: BlockQuote): List<Block> {
        return listOf(visitContainer(blockQuote))
    }

    override fun visit(listContainer: ListContainer): List<Block> {
        // this will just make a duplicate list...
        return listOf(listContainer)
    }



    private fun visitContainer(container: Container): Container{
        val newChildren = mutableListOf<Block>()
        var list : ListContainer? = null
        for(block in container.children){
            if(block is ListItem){
                if(list != null){
                    if(block.markerType == list.markerType){
                        list.addChild(block)
                        block.parent = list
                    } else {
                        closeAndAddList(newChildren, list)
                        list = ListContainer(container, container.indent, block.markerType, block.startingNumber)
                        list.addChild(block)
                        block.parent = list
                    }
                }  else{
                    list = ListContainer(container, container.indent, block.markerType, block.startingNumber)
                    list.addChild(block)
                    block.parent = list
                }
            } else if(block is BlankLine){
                if(list != null) {
                    list.addChild(block)
                } else {
                    newChildren.add(block)
                }
            } else {
                if(list != null){
                    closeAndAddList(newChildren, list)
                    list = null
                }
                newChildren.add(block)
            }
        }
        if(list != null){
            closeAndAddList(newChildren, list)
        }
        if (newChildren != container.children) {
            container.children.clear()
            container.children.addAll(newChildren)
        }
        return container
    }
    private fun closeAndAddList(to: MutableList<Block>, from: ListContainer) {
        // make sure that last item isn't the only blank line for final loose check
        val lastItem = from.children.last()
        if(lastItem is BlankLine){
            from.children.removeAt(from.children.size - 1)
            if(from.children.any { it is BlankLine }){
                from.setLoose(true)
            }
        }
        from.close()
        to.add(from)
        if(lastItem is BlankLine){
            to.add(lastItem)
        }
    }
}