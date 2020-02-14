package com.matt.belisle.commonmark.parser.inlineParsingUtil

// performs a check for the URI Autolink


/*
A URI autolink consists of <, followed by an absolute URI followed by >.
It is parsed as a link to the URI, with the URI as the link’s label.

An absolute URI, for these purposes, consists of a scheme followed by a colon (:)
 followed by zero or more characters other than ASCII whitespace and control characters,
 <, and >. If the URI includes these characters, they must be percent-encoded (e.g. %20 for a space).

For purposes of this spec, a scheme is any sequence of 2–32 characters beginning with an ASCII letter and followed by
 any combination of ASCII letters, digits, or the symbols plus (”+”), period (”.”), or hyphen (”-”).


 */

// this assumes the linkToTest has leading and trailing '<''>' taken off
class AutoLinkURIMatcher(linkToTest: String){
    private val lexer = InlineLexer(linkToTest)
    fun match(): Boolean {
        return absoluteURI()
    }

    private fun absoluteURI(): Boolean {
        if(!scheme()){
            return false
        }
        if(!lexer.inspect(':')){
            return false
        }
        lexer.advanceCharacter()

        lexer.advanceWhile { it !='<' && it!='>' && !it.isWhitespace() }
        return lexer.isEndOfData()
    }

    private fun scheme(): Boolean {
        if(!lexer.isAsciiChar()){
            return false
        }
        lexer.advanceCharacter(1)
        val lengthOfScheme = lexer.advanceWhile { it.isLetterOrDigit() || it == '+' || it == '.' || it == '-' }
        // note the length shifted left by one as we advanced one ahead
        return lengthOfScheme in 1..31
    }

}