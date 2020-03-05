package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IStaticMatchableLeaf
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.Emphasis
import com.matt.belisle.commonmark.parser.InlineParser
import java.lang.Exception

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class BlankLine private constructor(parent: Container, indent: Int) : Leaf(parent = parent, indent = indent) {
    var numberOfLines: Int = 1

    private constructor(parent: Container) : this(parent = parent, indent = 0) {
        // no content in a blank line
    }

    override fun appendLine(line: String) {
        if(line.isNotBlank()){
            throw Exception("Tried to put a non empty line in a blank line block")
        }
        numberOfLines++
    }

    override fun match(line: String): Boolean {
        return line.isBlank()
    }

    override fun analyzeInlines(
        inlineParser: InlineParser,
        delimiters: List<Emphasis<*>>,
        linkReferences: Map<String, LinkReferenceDefinition>
    ) {
        //noop as no data
    }

    fun dropLastBlankLine(): BlankLine {
        assert(numberOfLines > 1)
        numberOfLines--
        return BlankLine(parent!!)
    }

    companion object : IStaticMatchableLeaf<BlankLine> {

        override val canInterruptParagraph: Boolean = true

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): BlankLine {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return BlankLine(parent)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int) = line.isBlank()

    }
}