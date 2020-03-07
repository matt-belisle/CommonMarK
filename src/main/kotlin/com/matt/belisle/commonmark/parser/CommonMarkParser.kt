package com.matt.belisle.commonmark.parser

import CodeFence
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.IStaticMatchableContainer
import com.matt.belisle.commonmark.ast.IStaticMatchableLeaf
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.inlineElements.Emphasis
import com.matt.belisle.commonmark.ast.inlineElements.EmphasisAsterisk
import com.matt.belisle.commonmark.ast.inlineElements.EmphasisUnderscore
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.visitors.ParagraphMergerVisitor
import com.matt.belisle.commonmark.visitors.linkReferenceDefinitionVisitor.LinkReferenceDefinitionVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.BlankLinePropagationVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.CreateListBlockVisitor
import java.time.Duration
import java.time.Instant


// leaves are the leaves that can be parsed to, blocks in descending order of precedence,
// so put blank line last, and paragraph second last
// containers are the containers that can be parsed to
class CommonMarkParser(
    leaves: List<IStaticMatchableLeaf<out Leaf>>,
    containers: List<IStaticMatchableContainer<out Container>>,
    private val visitors: List<com.matt.belisle.commonmark.visitors.Visitor>,
    private val emphasisTypes: List<Emphasis<*>>
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
        listOf(LinkReferenceDefinitionVisitor(),BlankLinePropagationVisitor(), CreateListBlockVisitor(), ParagraphMergerVisitor()),
        listOf(EmphasisUnderscore.Companion, EmphasisAsterisk.Companion)
    )

    fun parse(data: List<String>): Document {
        // parse into blocks
//        val begin = Instant.now()
//        val doc = blockParser.parse(data)
//        val end = Instant.now()
//        println("TotalTime: ${Duration.between(begin, end)}")
//        return inlineParser.parse(doc)
        // add LRDS and emphasis here
        val linkReferenceVisitor = visitors.firstOrNull { it is LinkReferenceDefinitionVisitor }
        val linkReferences = if(linkReferenceVisitor != null){
            (linkReferenceVisitor as LinkReferenceDefinitionVisitor).linkReferences
        } else emptyMap<String, LinkReferenceDefinition>()
        return inlineParser.parse(blockParser.parse(data), emphasisTypes, linkReferences)

        //parse the inlines (can be done in parallel)

        //render the tree
    }
}