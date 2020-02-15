package com.matt.belisle.commonmark.parser.inlineParsingUtil

import com.matt.belisle.commonmark.ast.inlineElements.ESCAPABLE
import com.matt.belisle.commonmark.ast.inlineElements.Link
import java.lang.StringBuilder
import java.util.*

//This matcher will not be concerned with link references that are valid references, only whether the syntax is correct
//For inline links only concerned with post br
class LinkMatcher(line: String) {
    private val lexer = InlineLexer(line)
    //either an inline link or a reference link
    fun link(): Triple<Boolean, Int, Link> {
        return inlineLink()
    }

    private fun inlineLink(): Triple<Boolean, Int, Link> {
        /*
        An inline link consists of a link text followed immediately by a left parenthesis (, optional whitespace,
        an optional link destination, an optional link title separated from the link destination by whitespace,
        optional whitespace, and a right parenthesis ). The link’s text consists of the inlines contained in the link
         text (excluding the enclosing square brackets). The link’s URI consists of the link destination, excluding
          enclosing <...> if present, with backslash-escapes in effect as described above.
          The link’s title consists of the link title, excluding its enclosing delimiters,
          with backslash-escapes in effect as described above.
         */
        if (!lexer.inspect('(')) {
            return falseReturn
        }
        lexer.advanceCharacter()

        lexer.skipSpaces()
        val (hasDestination, destination) = linkDestination(true)
        lexer.skipSpaces()
        val (hasTitle, title) = linkTitle()
        lexer.skipSpaces()
        //may be EOD
        if (lexer.inspect { it == ')' }) {
            return Triple(true, lexer.saveIndex(), Link(destination, title))
        }
        return falseReturn
    }

    private fun backslashEscaped(): Boolean {
        if (!lexer.isEndOfData()) {
            if (lexer.inspect { it in ESCAPABLE }) {
                return true
            }
        }
        return false
    }

    // will return whether it contains a valid link label, as well as the corresponding label
    private fun linkLabel(): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        if (!lexer.inspect('[')) {
            return falseReturn
        }
        lexer.advanceCharacter()
        while (!lexer.isEndOfData()) {
            builder.append(lexer.returnMatchedWhile { it != ']' && it != '[' })
            // first check whether it was escaped or not
            val char = lexer.getChar()
            if (char == '[') {
                if (!escapedBracket(lexer)) {
                    return falseReturn
                } else {
                    builder.append('[')
                }
            } else if (char == ']') {
                if (!escapedBracket(lexer)) {
                    lexer.advanceCharacter()
                    val label = builder.toString()
                    if (label.length > 999) {
                        return falseReturn
                    }
                    return Pair(true, label)
                } else {
                    builder.append(']')
                }
            }
            lexer.advanceCharacter()
        }
        return falseReturn
    }

    private fun linkDestination(inline: Boolean): Pair<Boolean, String> {
        return if (lexer.inspect('<')) bracketedDestination() else rawDestination(inline)
    }

    /*
    a sequence of zero or more characters between an opening < and a closing >
    that contains no line breaks or unescaped < or > characters, or
     */
    private fun bracketedDestination(): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        // skip the bracket, will be checked in linkDestination
        lexer.advanceCharacter()
        while (!lexer.isEndOfData()) {
            var addCharacter = true
            // first check whether it was escaped or not
            val char = lexer.getChar()
            lexer.advanceCharacter()
            if (char == '<') {
                if (!escapedBracket(lexer)) {
                    return falseReturn
                }
            } else if (char == '>') {
                if (!escapedBracket(lexer)) {
                    return Pair(true, builder.toString())
                }
            } else if (char == '\n') {
                return falseReturn
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    addCharacter = false
                }
            } else if (char == '\n') {
                //undo the advance
                lexer.goBackOne()
                return falseReturn
            }
            if (addCharacter) {
                builder.append(char)
            }
        }
        // trailing '>' to end the paragraph
        if (lexer.inspect { it == '>' }) {
            return Pair(true, builder.toString())
        }
        // reached EOI without matching the bracket
        return falseReturn
    }

    /*
    a nonempty sequence of characters that does not start with <, does not include ASCII space or control characters,
    and includes parentheses only if (a) they are backslash-escaped or (b) they are part of a balanced pair of
    unescaped parentheses.
    (Implementations may impose limits on parentheses nesting to avoid performance issues,
    but at least three levels of nesting should be supported.)
     */
    private fun rawDestination(inline: Boolean): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        //inline allows this to successfullly end successfully upon getting a closing brace that is unmatched
        // ( will add to stack, ) will pop, if when ending the destination this is not empty
        // then we return false
        // or if when ) it is empty we return false
        val brackets = Stack<Char>()
        while (!lexer.isEndOfData()) {
            var addCharacter = true
            val char = lexer.getChar()
            lexer.advanceCharacter()
            if (char == ' ') {
                return if (brackets.isEmpty()) {
                    lexer.goBackOne()
                    Pair(true, builder.toString())
                } else {
                    falseReturn
                }
            } else if (char == '(') {
                if (!escapedBracket(lexer)) {
                    brackets.push(char)
                }
            } else if (char == ')') {
                if (!escapedBracket(lexer)) {
                    if (brackets.isEmpty()) {
                        return falseReturn
                    } else {
                        brackets.pop()
                    }
                }
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    addCharacter = false
                }
            } else if (char == '\n') {
                //undo the advance
                lexer.goBackOne()
                return falseReturn
            }
            if (addCharacter) {
                builder.append(char)
            }
        }
        //EOL may need to add final character if not whitespace
        // or the inline end of link bracket
        if (!lexer.inspect { it.isWhitespace() || (inline && it == ')') }) builder.append(lexer.getChar())
        // this can end the line
        return Pair(true, builder.toString())
    }

    /*
    a sequence of zero or more characters between straight double-quote characters ("), including a " character only if it is backslash-escaped, or

    a sequence of zero or more characters between straight single-quote characters ('), including a ' character only if it is backslash-escaped, or

    a sequence of zero or more characters between matching parentheses ((...)), including a ( or ) character only if it is backslash-escaped.
     */
    private fun linkTitle(): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        val closer = when (lexer.getChar()) {
            '"' -> '"'
            '\'' -> '\''
            '(' -> ')'
            else -> return falseReturn
        }
        lexer.advanceCharacter()
        while (!lexer.isEndOfData()) {
            var addCharacter = true
            val char = lexer.getChar()
            lexer.advanceCharacter()
            if (char == closer) {
                if (!escapedBracket(lexer)) {
                    return Pair(true, builder.toString())
                }
            } else if (char == '(' && closer == ')') {
                if (!escapedBracket(lexer)) {
                    return falseReturn
                }
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    addCharacter = false
                }
            }
            if (addCharacter) {
                builder.append(char)
            }
        }


        if (lexer.inspect { it == closer }) {
            return Pair(true, builder.toString())
        }
        return falseReturn
    }

    // assumes that the following text is a square bracket
    private fun escapedBracket(lexer: InlineLexer): Boolean {
        lexer.goBackOne()
        val ret = lexer.inspect('\\')
        lexer.advanceCharacter()
        return ret
    }

    companion object {
        // just a single instantiation for a false return then
        private val falseReturn = Triple(false, 0, Link("", ""))
    }
}