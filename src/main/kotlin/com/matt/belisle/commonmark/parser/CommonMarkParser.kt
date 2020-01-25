package com.matt.belisle.commonmark.parser

import CodeFence
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.IStaticMatchableContainer
import com.matt.belisle.commonmark.ast.IStaticMatchableLeaf
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.visitors.listVisitors.BlankLinePropagationVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.CreateListBlockVisitor
import java.time.Duration
import java.time.Instant


// leaves are the leaves that can be parsed to, blocks in descending order of precedence,
// so put blank line last, and paragraph second last
// containers are the containers that can be parsed to
class CommonMarkParser(
    private val leaves: List<IStaticMatchableLeaf<out Leaf>>,
    private val containers: List<IStaticMatchableContainer<out Container>>,
    private val visitors: List<com.matt.belisle.commonmark.visitors.Visitor>
) {
    private val blockParser: BlockParser = BlockParser(leaves, containers, visitors)
    private val inlineParser = InlineParser()
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
        listOf(BlankLinePropagationVisitor(), CreateListBlockVisitor())
    )

    fun parse(data: List<String>): Document {
        // parse into blocks
//        val begin = Instant.now()
//        val doc = blockParser.parse(data)
//        val end = Instant.now()
//        println("TotalTime: ${Duration.between(begin, end)}")
//        return inlineParser.parse(doc)
        return inlineParser.parse(blockParser.parse(data))

        //parse the inlines (can be done in parallel)

        //render the tree
    }
}