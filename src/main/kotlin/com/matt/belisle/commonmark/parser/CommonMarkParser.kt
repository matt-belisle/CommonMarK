package com.matt.belisle.commonmark.parser

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.IStaticMatchable
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.leafBlocks.*
import kotlin.reflect.KClass


// leaves are the leaves that can be parsed to, blocks in descending order of precedence,
// so put blank line last, and paragraph second last
// containers are the containers that can be parsed to
class CommonMarkParser(private val leaves: List<IStaticMatchable<out Leaf>>, private val containers: List<KClass<out Container>>) {
    val blockParser: BlockParser = BlockParser(leaves, containers)

    constructor(): this(listOf(ThematicBreak.Companion, ATXHeading.Companion, CodeFence.Companion, Paragraph.Companion, BlankLine.Companion), emptyList())
    fun parse(data: List<String> ): Document{
        // parse into blocks
        return blockParser.parse(data)

        //parse the inlines (can be done in parallel)

        //render the tree
    }
}