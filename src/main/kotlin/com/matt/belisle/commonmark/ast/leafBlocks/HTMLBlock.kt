package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.Emphasis
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.parser.InlineParser
import com.matt.belisle.commonmark.parser.inlineParsingUtil.HTMLMatcher


//private as to only allow the parse function in companion to construct a block
private enum class HTMLBlockType {TYPE1, TYPE2, TYPE3, TYPE4, TYPE5, TYPE6, TYPE7}
val type1OpenRegex = """<(script|pre|style)(\w|>?)""".toRegex()
val type1CloseRegex = """</(script|pre|style)(\w|>?)""".toRegex()
val type6Regex = """</?(address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(\s|/>|>)""".toRegex(RegexOption.IGNORE_CASE)
val type3Regex = """\?>""".toRegex()
val type4Regex = """<![A-Z]""".toRegex()
class HTMLBlock private constructor(parent: Container, indent: Int, private val htmlBlockType: HTMLBlockType, line: String) : Leaf(parent = parent, indent = indent) {

    init {
        appendLine(line)
        closeHTMLBasedOnType(line)
    }

    // this is the match to continue a paragraph block
    override fun match(line: String): Boolean {
        return true
    }

    override fun appendLine(line: String) {
        assert(match(line))
        if(closeHTMLBasedOnType(line) && line.isBlank()){
            // do not include trailing blank line
            return
        }
        if(inline.size == 0){
            inline.add(InlineString(line))

        } else {
            (inline[0] as InlineString).append(line)
        }
    }

    override fun render(): String {
        val builder = StringBuilder()
        with(builder){
            inline.forEach {
                append(it.render(false))
                builder.append('\n')
            }
        }

        return builder.toString()
    }

    override fun analyzeInlines(inlineParser: InlineParser,
                                delimiters: List<Emphasis<*>>,
                                linkReferences: Map<String, LinkReferenceDefinition>) {
        //noop these need to be formatted correctly by writer
    }

    private fun closeHTMLBasedOnType(line: String): Boolean{
        if(when(htmlBlockType){
                HTMLBlockType.TYPE1 -> closeType1(line)
                HTMLBlockType.TYPE2 -> closeType2(line)
                HTMLBlockType.TYPE3 -> closeType3(line)
                HTMLBlockType.TYPE4 -> closeType4(line)
                HTMLBlockType.TYPE5 -> closeType5(line)
                HTMLBlockType.TYPE6 -> closeType6or7(line)
                HTMLBlockType.TYPE7 -> closeType6or7(line)
            }){
            close()
            return true
        }
        return false
    }

    private fun closeType1(line: String): Boolean{
        return regexContains(line, type1CloseRegex)
    }

    private fun closeType2(line:String): Boolean {
        return line.contains("-->")
    }

    private fun closeType3(line:String): Boolean {
        return regexContains(line, type3Regex )
    }

    private fun closeType4(line:String): Boolean {
        return line.contains('>')
    }

    private fun closeType5(line:String): Boolean {
        return line.contains("]]>")
    }

    private fun closeType6or7(line:String): Boolean {
        return line.isBlank()
    }

    private fun regexContains(line: String, regex: Regex): Boolean{
        return(regex.find(line) != null)
    }


    companion object : IStaticMatchableLeaf<HTMLBlock> {

        override val canInterruptParagraph: Boolean = true

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): HTMLBlock {
            // must be able to match to parse the line
            val trimmed = line.removeLeadingChar(' ', indentation)
            return HTMLBlock(parent, indentation, matchWithType(line.trimStart(), currentOpenBlock).second, trimmed)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            return line.countLeadingSpaces().first < indentCheck(indentation) && matchWithType(line.trimStart(), currentOpenBlock).first
        }
        private fun matchWithType(line: String, currentOpenBlock: Block): Pair<Boolean, HTMLBlockType> {
            if(!line.startsWith('<')){
                return Pair(false, HTMLBlockType.TYPE1)
            }
            return when {
                type1Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE1)
                }
                type2Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE2)
                }
                type3Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE3)
                }
                type4Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE4)
                }
                type5Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE5)
                }
                type6Match(line) -> {
                    Pair(true, HTMLBlockType.TYPE6)
                }
                type7Match(line, currentOpenBlock) -> {
                    Pair(true, HTMLBlockType.TYPE7)
                }
                else -> {
                    Pair(false, HTMLBlockType.TYPE1)
                }
            }
        }

        private fun type1Match(line: String): Boolean {
            //regex match this

            //TODO make into java patterns so it is only compiled once at startup
            return startsWithRegex(line.toLowerCase(), type1OpenRegex )
        }

        private fun type2Match(line: String): Boolean {
            return line.startsWith("<!--")
        }

        private fun type3Match(line: String): Boolean {
            return line.startsWith("<?")
        }
        private fun type4Match(line: String): Boolean {
            return startsWithRegex(line, type4Regex)
        }
        private fun type5Match(line: String): Boolean {
            return line.startsWith("<![CDATA[")
        }
        private fun type6Match(line: String): Boolean {
            // case insensitive
            return startsWithRegex(line.toLowerCase(), type6Regex )
        }
        private fun type7Match(line: String, currentOpenBlock: Block): Boolean {
            return currentOpenBlock !is Paragraph && HTMLMatcher(line).type7Matcher()
        }
        private fun startsWithRegex(line:String, regex: Regex): Boolean{
            val found = regex.find(line)
            return if(found != null){
                found.range.first == 0
            } else{
                false
            }
        }

    }
}



