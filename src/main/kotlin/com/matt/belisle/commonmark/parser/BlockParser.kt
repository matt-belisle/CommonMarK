package com.matt.belisle.commonmark.parser

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.IStaticMatchable
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.leafBlocks.*
import kotlin.reflect.KClass


// leaves are the leaves that can be parsed to, blocks in descending order of precedence,
// so put blank line last, and paragraph second last
// containers are the containers that can be parsed to
class BlockParser(private val leaves: List<IStaticMatchable<out Leaf>>, private val containers: List<KClass<out Container>>) {

    constructor(): this(listOf(IndentedCodeBlock.Companion, ThematicBreak.Companion, ATXHeading.Companion, CodeFence.Companion, Paragraph.Companion, BlankLine.Companion), emptyList())
    fun parse(data: List<String> ): Document{
        val canInterruptParagraph = leaves.filter { it.canInterruptParagraph }
        val document = Document()
        for(line in data){
            // See if last child of document is open, if so see if we can match it
            val lastBlock = document.getLastChild()
            if(lastBlock != null && lastBlock.isOpen()){

                // check if the line interrupts the paragraph being built
                if(lastBlock is Paragraph){
                    var matched = false
                    for(blockType in canInterruptParagraph){
                        if(blockType.match(line, lastBlock, lastBlock.indent)){
                            //paragraph was interrupted, so close it
                            lastBlock.close()
                            val parent = lastBlock.parent ?: document
                            parent.addChild(blockType.parse(line, lastBlock, lastBlock.indent, parent))
                            matched = true
                            break
                        }
                    }
                    // done with this line
                    if(matched) continue
                }

                // if we can continue the block being built
                if(lastBlock.match(line)){
                    if(lastBlock is Leaf){
                        lastBlock.appendLine(line)
                    }
                    // this line is done we have added it to a leaf block
                    continue

                    //this line could not be matched, so close the block and will be appending new block
                } else {
                    lastBlock.close()
                }

            }

            val lastOpenBlock: Block = if(lastBlock?.isOpen() == true)  lastBlock else document.getLastOpenBlock()
            for(blockType in leaves) {
                if(blockType.match(line, lastOpenBlock, lastOpenBlock.indent)){
                    if(lastOpenBlock is Container) {
                        lastOpenBlock.addChild(blockType.parse(line, lastOpenBlock, lastOpenBlock.indent, lastOpenBlock.parent ?: document))
                    }
                    break
                }
            }
        }
        document.close()
        return document
    }
}