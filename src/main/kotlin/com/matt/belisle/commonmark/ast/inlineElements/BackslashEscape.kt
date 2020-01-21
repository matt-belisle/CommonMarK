package com.matt.belisle.commonmark.ast.inlineElements

// all escapable characters
val ESCAPABLE = listOf('!' , '"' , '#' , '$' , '%' , '&' , '\'' , '(' , ')' , '*' , '+' , ',' , '-' , '.' , '/' , ':' ,
    ';' , '<' , '=' , '>' , '?' , '@' , '[' , '\\' , ']' , '^' , '_' , '`' , '{' , '|' , '}' , '~')

// Represents a backslash escaped character
class BackslashEscape(private val char: Char) : Inline(){
    override fun render(): String {
        return char.toString()
    }
}