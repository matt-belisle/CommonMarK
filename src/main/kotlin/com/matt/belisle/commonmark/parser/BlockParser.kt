package com.matt.belisle.commonmark.parser

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.visitors.Visitor
import com.matt.belisle.commonmark.visitors.linkReferenceDefinitionVisitor.LinkReferenceDefinitionVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.BlankLinePropagationVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.CreateListBlockVisitor


// leaves are the leaves that can be parsed to, blocks in descending order of precedence,
// so put blank line last, and paragraph second last
// containers are the containers that can be parsed to
class BlockParser(
    leaves: List<IStaticMatchableLeaf<out Leaf>>,
    containers: List<IStaticMatchableContainer<out Container>>,
    private val visitors: List<Visitor>
) {

    constructor() : this(
        listOf(
            HTMLBlock.Companion,
            IndentedCodeBlock.Companion,
            ThematicBreak.Companion,
            ATXHeading.Companion,
            CodeFence.Companion,
            Paragraph.Companion,
            BlankLine.Companion
        ),
        listOf(BlockQuote.Companion, ListItem.Companion),
        listOf(LinkReferenceDefinitionVisitor(), BlankLinePropagationVisitor(), CreateListBlockVisitor())
    )

    private val allBlocks: List<IStaticMatchable<out Block>> = containers.plus(leaves)
    private val canInterruptParagraph = allBlocks.filter { it.canInterruptParagraph }

    init {
        Paragraph.canInterrupt = canInterruptParagraph
    }

    fun parse(data: List<String>): Document {
        val document = Document()
        for (line in data) {
            // See if last child of document is open, if so see if we can match it
            // skip matching to document as that is always true...
            // you may only add to a container, if documents last child not matched this will be the document
            var currentOpenBlock: Block? = document
            var currentLine = line

            var unMatchedBlock: Block? = null
            // make sure the last block is open as to continue it
            if (currentOpenBlock != null && currentOpenBlock.isOpen()) {
                if (currentOpenBlock is Container) {

                    //matching logic then consume line, note this matching logic INCLUDES lazy continuation
                    while (currentOpenBlock is Container && currentOpenBlock.isOpen()) {
                        if (currentOpenBlock.match(currentLine)) {
                            currentLine = currentOpenBlock.dropPrefix(currentLine)
                            // make sure that there is a following last block ( this will only happen if the container is empty )
                            val nextChild = currentOpenBlock.getLastChild() ?: break
                            currentOpenBlock = nextChild

                        } else {
                            // close the tree including the currently checked block as it is no longer matching
                            unMatchedBlock = currentOpenBlock
                            // use the last matched block for the parent
                            currentOpenBlock = currentOpenBlock.parent
                            break
                        }
                    }
                }
            }
            // final check for leaves not being matched
                if(currentOpenBlock is Leaf && (!currentOpenBlock.isOpen() || !currentOpenBlock.match(currentLine))){
                    currentOpenBlock.close()
                    currentOpenBlock = currentOpenBlock.parent
                }

                //consume line as correct block to add to is found
                // if it is a leaf we need to just add to it
                if(currentOpenBlock is Leaf){
                    parseIntoOpenLeaf(currentLine, currentOpenBlock)
                } else {
                    // we will be making a new block on the end of the container, could match to a container or leaf
                    // note that parseIntoOpenBlock will have the side effect of consuming line
                    val lazyMatched = parseIntoNewBlock(currentLine, currentOpenBlock as Container)
                    if( !lazyMatched && unMatchedBlock != null) {
                        unMatchedBlock.close()
                    }
                }
            }
        document.close()
        var visited: Block = document
        visitors.forEach { visited = it.simplify(visited) }
        return visited as Document
    }

    private fun parseIntoNewBlock(line: String, parentBlock: Container): Boolean{
        for(blockType in allBlocks){
            if(blockType.match(line, parentBlock, parentBlock.indent))
            {
                when (blockType) {
                    is IStaticMatchableContainer -> {
                        val (containerBlock, restOfLine) = blockType.parse(
                            line,
                            parentBlock,
                            parentBlock.indent,
                            parentBlock
                        )
                        parentBlock.addChild(containerBlock)
                        //finish parsing the line with the new container
                        return parseIntoNewBlock(restOfLine, containerBlock as Container)
                    }
                    is Paragraph.Companion -> {
                        // check if we can match lazily
                        val lazyContinue = parentBlock.lazyContinue(line)
                        if(lazyContinue.first){
                            if(lazyContinue.second is Leaf) {
                                (lazyContinue.second as Leaf).appendLine(line)
                                return true
                            }
                        } else {
                            parentBlock.addChild((blockType as IStaticMatchableLeaf).parse(line, parentBlock, parentBlock.indent, parentBlock))
                        }
                    }
                    else -> {
                        // must be a leaf
                        parentBlock.addChild((blockType as IStaticMatchableLeaf).parse(line, parentBlock, parentBlock.indent, parentBlock))
                    }
                }
                return false
            }

        }
        throw ParsingException("This line could not be parse $line")
    }

    private fun parseIntoOpenLeaf(line: String, leaf: Leaf) {

        // various blocks may interrupt paragraphs then we may have to continue parsing if a container interrupted it
        if (leaf is Paragraph) {

            for (blockType in canInterruptParagraph) {
                if (blockType.match(line, leaf, leaf.parent!!.indent)) {
                    //paragraph was interrupted, so close it
                    leaf.close()
                    val parent = leaf.parent
                    if (blockType is IStaticMatchableLeaf) {
                        parent!!.addChild(blockType.parse(line, leaf, leaf.indent, parent))
                    } else {
                        val (containerBlock, restOfLine) = (blockType as IStaticMatchableContainer).parse(
                            line,
                            leaf,
                            leaf.indent,
                            parent!!
                        )
                        // if the parentBlock is literally a dummy container (like a list)
                        //it may have built an internal child block already
                        val lastChild = (containerBlock as Container).getLastChild()
                        if(lastChild != null && lastChild.isOpen()) {
                            if (lastChild is Leaf) {
                                parseIntoOpenLeaf(restOfLine, lastChild)
                            } else {
                                parseIntoNewBlock(restOfLine, lastChild as Container)
                            }
                        } else{
                            parseIntoNewBlock(restOfLine, containerBlock)
                        }
                        parent.addChild(containerBlock)
                        return
                    }
                    // we must be done as we matched and consumed the rest of it
                    return
                }
            }
            leaf.appendLine(line)
        } else {
            leaf.appendLine(line)
        }
    }
}