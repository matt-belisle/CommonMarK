package com.matt.belisle.commonmark.parser

import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.HardBreak
import com.matt.belisle.commonmark.ast.inlineElements.Inline
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.ast.inlineElements.SoftBreak
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf
import com.matt.belisle.commonmark.parser.inlineMatchers.InlineLexer
import com.matt.belisle.commonmark.parser.inlineMatchers.InlineMatchers
import com.matt.belisle.commonmark.parser.inlineMatchers.InlineMetaData
import com.matt.belisle.commonmark.parser.inlineMatchers.InlineTypes
import kotlinx.coroutines.*
import java.util.*
import kotlin.random.Random
// This is the basic Inline parsing logic, give it a list of inline tasks to do in order, and it will do them to all leaves
// As spec says this can be done asynchronously so thats what we will do using coroutines
class InlineParser() {
    fun parse(document: Document): Document {

       runBlocking { parseLeaves(allLeaves(document)) }

        return document
    }

    private suspend fun parseLeaves(leaves: List<Leaf>){
        coroutineScope {
            // launches all leaves into seperate coroutines to be dealt with as they can
            leaves.forEach { launch { analyzeBlock(it) } }
        }
    }

    private fun analyzeBlock(leaf: Leaf){

        // this will use double dispatch for the line, this allows the block to decide what fields will be analyzed
        // this is useful for code fence, which wants its info string to be analyzed but NOT its body or tables
        // for github flavored as each cell could be analyzed
        leaf.analyzeInlines(this)
    }

    private fun allLeaves(container: Container): List<Leaf>{
        val ret = mutableListOf<Leaf>()
        container.children.forEach {
            if(it is Leaf){
                ret.add(it)
            } else {
                ret.addAll(allLeaves((it as Container)))
            }
        }
        return ret
    }

    private fun elaborateInlines(inlines: List<Inline>): String{
        return inlines.fold("", {acc, it -> "$acc${it.render()}\n"})
    }

    /* TODO: allow leaf to decide which inlines can be run on it, codeblocks and such still need
    *  TODO: their HTML reserved characters to be replaced this could be done in a variety of ways through input
    *  TODO: such as default inputs to functions that can be turned off
    *  TODO: or a list of types that can be done
    *   IM leaning towards first as custom blocks can easily use it then
    */

    /*
        The intent of this way of analyzing is to limit the passes through of the line, this will parse once to the end
        and that will be enough
        This is not only going to read once though as whenever an opener (i.e. < for autolinks) the parser will scan ahead
        to decide whether it is an autolink or not, the runtime is dependent on how many potential openers it has for html
        and autolinks
        otherwise one pass through should be sufficient
     */
    fun analyzeLine(inlines: List<Inline>,
                    softBreak: Boolean = true,
                    hardBreak: Boolean = true): List<Inline> {
        // this will keep inlines in order of index on the string, this will require some fancy work to create the inlines successfully
        // I'm thinking a subString matcher on beginning and end then remaking all internal metadata with indexes shifted by start of outer container
        val inlineLocations: PriorityQueue<InlineMetaData> = PriorityQueue()

        // remove final \n
        val toParse = elaborateInlines(inlines).dropLast(1)
        val lexer = InlineLexer(toParse)

        while(!lexer.isEndOfLine()){
            //softBreak and hardBreak
            if(lexer.inspect('\n')){
                val savedIndex = lexer.saveIndex()
                // try to match a lineBreak
                val matched = lineBreaks(lexer, savedIndex, hardBreak, softBreak)
                if(matched.type != InlineTypes.NONE){
                    inlineLocations.add(matched)
                }
                // reset state to where we were
                lexer.goTo(savedIndex)
            }
            // next character
            lexer.advanceCharacter()
        }

        //TODO Obviously remove this... this just makes this function a noop
        // makes a copy it is fine to have original references to parsed lines as they will be thrown out
        return createInlines(inlineLocations, toParse)
    }

    private fun createInlines(inlineMetaData: PriorityQueue<InlineMetaData>, line: String): List<Inline>{
        // so we can do some inspection on it without losing when we pop
        val list = inlineMetaData.toList()
        val inlines = mutableListOf<Inline>()
        // for simplicity until ones with internal inlines can be created none of these will have internals

        // an Inline String will need to be created if the current ending is less than the next start
        var currentEnd = 0
        list.forEach {
            if(currentEnd < it.start){
                inlines.add(InlineString(line.substring(currentEnd, it.start)))
            }
            // make the next inline
            inlines.add(createInline(it, line))
            currentEnd = it.end + 1
        }
        if(currentEnd != line.length){
            // add the final inlineString
            inlines.add(InlineString(line.substring(currentEnd)))
        }
        return inlines
    }

    private fun createInline(inlineMetaData: InlineMetaData, line: String): Inline{
        return when(inlineMetaData.type){
            InlineTypes.HARDBREAK -> HardBreak()
            InlineTypes.SOFTBREAK -> SoftBreak()
            else -> throw ParsingException("Unknown inline type ${inlineMetaData.type}")
        }
    }

    private fun lineBreaks(lexer: InlineLexer, savedIndex: Int, hardBreak: Boolean, softBreak: Boolean): InlineMetaData {
        if(hardBreak){
            // type one two or more spaces before \n
            val spaces = lexer.reverseWhile { it -> it.isWhitespace() }
            if(spaces > 1){
                // we have a hard line break from current index until savedIndex
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARDBREAK)
            }
            lexer.goTo(savedIndex)
            // type two a \ immediately before the \n
            lexer.goBackOne()
            if(lexer.inspect('\\')){
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARDBREAK)
            }
        }
        if(softBreak){
            // if it wasn't a hardbreak and we can do a softbreak than it must be a softbreak
            return InlineMetaData(savedIndex, savedIndex, InlineTypes.SOFTBREAK)
        }
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }
}