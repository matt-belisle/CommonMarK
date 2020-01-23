package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.ast.countLeadingChar
import com.matt.belisle.commonmark.ast.countTrailingChar
import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement
import java.lang.StringBuilder

// Represents a codespan
class CodeSpan(str: String) : Inline(){
    private val code: String
    private val leadingRun: Int = str.countLeadingChar('`')
    private val closingRun: Int = str.countTrailingChar('`')
    private val preNormalizedString: String = str.drop(leadingRun).dropLast(closingRun)
    init {
        var normalized = preNormalizedString

        // lineEndings are replaced with spaces
        normalized = normalized.replace(lineEnding, ' ')

        //some proccessing needs to be done on the string
        // remove leading and trailing space if it is not entirely blank
        //TODO: the test 333 will not pass because unicode whitespace doesn't come through the json<->kotlin
        // parse correctly
        if(normalized.isNotBlank() && normalized.startsWith('\u0020') && normalized.endsWith('\u0020')){
           normalized = normalized.drop(1).dropLast(1)
        }
        this.code = normalized
    }
    override fun render(entity: Boolean): String {
        val code = if(entity){
            val entities = EntityReplacement.inspect(code, true)
            val builder = StringBuilder()
            with(builder){
                entities.forEach {
                    append(it.render())
                }
            }
            builder.toString()
        } else {
            code
        }
        return "<code>$code</code>"
    }
}