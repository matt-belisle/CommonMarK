package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement

// all escapable characters
val ESCAPABLE = listOf('!' , '"' , '#' , '$' , '%' , '&' , '\'' , '(' , ')' , '*' , '+' , ',' , '-' , '.' , '/' , ':' ,
    ';' , '<' , '=' , '>' , '?' , '@' , '[' , '\\' , ']' , '^' , '_' , '`' , '{' , '|' , '}' , '~')

// Represents a backslash escaped character
class BackslashEscape(private val char: Char) : Inline(){
    override fun render(entities:Boolean): String {
        if(entities){
            val entity = EntityReplacement.inspect(char.toString(), true)[0]
            return entity.render()
        }
        return char.toString()
    }
}