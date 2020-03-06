package com.matt.belisle.commonmark.parser.inlineParsingUtil

import com.matt.belisle.commonmark.ast.inlineElements.ESCAPABLE
import com.matt.belisle.commonmark.ast.inlineElements.Link
import com.matt.belisle.commonmark.ast.leafBlocks.LinkReferenceDefinition
import java.lang.StringBuilder
import java.util.*
enum class typeOfLink{
    INLINE_LINK, FULL, COLLAPSED, SHORTCUT
}
data class MatchedLink(val matched: Boolean, val endOfLinkIndex: Int, val link: Link, val typeOfLink: typeOfLink)
//This matcher will not be concerned with link references that are valid references, only whether the syntax is correct
//For inline links only concerned with post br
class LinkMatcher(line: String, private val linkReferences: Map<String, LinkReferenceDefinition>) {
    private val lexer = InlineLexer(line)
    //either an inline link or a reference link
    // note link Text will be used as the first label in collapsed and shortcut, and ignored otherwise
    fun link(linkText: String): MatchedLink {
        // in precedence order resetting the lexer for each
        val inlineLink = inlineLink()
        if(inlineLink.matched) return inlineLink
        lexer.goTo(0)
        val fullReferenceLink = fullReferenceLink()
        if(fullReferenceLink.matched) return fullReferenceLink
        lexer.goTo(0)
        val collapsedReferenceLink = collapsedReferenceLink(linkText)
        if(collapsedReferenceLink.matched) return collapsedReferenceLink
        lexer.goTo(0)
        return shortcutReferenceLink(linkText)
    }

    private fun inlineLink(): MatchedLink{
        /*
        An inline link consists of a link text followed immediately by a left parenthesis (, optional whitespace,
        an optional link destination, an optional link title separated from the link destination by whitespace,
        optional whitespace, and a right parenthesis ). The link’s text consists of the inlines contained in the link
         text (excluding the enclosing square brackets). The link’s URI consists of the link destination, excluding
          enclosing <...> if present, with backslash-escapes in effect as described above.
          The link’s title consists of the link title, excluding its enclosing delimiters,
          with backslash-escapes in effect as described above.
         */
        val startingBracket = lexer.saveIndex()
        if (!lexer.inspect('(')) {
            return falseReturn
        }
        lexer.advanceCharacter()

        lexer.skipSpaces()
        val (hasDestination, destination) = linkDestination(true, this.lexer)
        //test 506 specifies any amount of whitespace
        lexer.skipSpacesMaximumNewLines(-1)
        val (hasTitle, title) = linkTitle(lexer)
        lexer.skipSpaces()
        // if you have no dest or title you must be just ()
        if(!hasDestination && !hasTitle) {
            return if(lexer.saveIndex() == startingBracket + 1) {
                MatchedLink(true, lexer.saveIndex(), Link(destination, title), typeOfLink.INLINE_LINK)
            } else {
                falseReturn
            }
        }
        //may be EOD

        if (lexer.inspect { it == ')' }) {
            return MatchedLink(true, lexer.saveIndex(), Link(destination, title), typeOfLink.INLINE_LINK)
        }
        return falseReturn
    }

    //A full reference link consists of a link text immediately followed by a
    // link label that matches a link reference definition elsewhere in the document.
    private fun fullReferenceLink(): MatchedLink{
        val (matched, label) = linkLabel(lexer)
        val normalizedLabel = Escaping.normalizeLabelContent(label)
        if(!matched || !linkReferences.containsKey(normalizedLabel)) return falseReturn
        val reference = linkReferences[normalizedLabel]!!
        // linkLabel consumes the ']'
        return MatchedLink(true, lexer.saveIndex(), Link(reference.link, reference.title), typeOfLink.FULL)
    }

    private fun collapsedReferenceLink(firstLabel: String): MatchedLink {
        // first make sure the original lexer is just an empty pair of brackets
        if(!lexer.inspect('['))
            return falseReturn
        lexer.advanceCharacter()
        if(!lexer.inspect { it == ']' })
            return falseReturn
        // at this point it is just a shortcut label
        val (matched, label) = linkLabel(InlineLexer(firstLabel))
        val normalizedLabel = Escaping.normalizeLabelContent(label)
        if(!matched || !linkReferences.containsKey(normalizedLabel)) return falseReturn
        val reference = linkReferences[normalizedLabel]!!
        return MatchedLink(true, lexer.saveIndex(), Link(reference.link, reference.title), typeOfLink.COLLAPSED)
    }

    private fun shortcutReferenceLink(firstLabel: String): MatchedLink {
        val matchedPostLabel = linkLabel(lexer)
        // cannot have any valid label after this to be a shortcut testcase 567
        if(matchedPostLabel.first) return falseReturn

        val (matched, label) = linkLabel(InlineLexer(firstLabel))
        val normalizedLabel = Escaping.normalizeLabelContent(label)
        if(!matched || !linkReferences.containsKey(normalizedLabel)) return falseReturn
        val reference = linkReferences[normalizedLabel]!!
        return MatchedLink(true, lexer.saveIndex(), Link(reference.link, reference.title), typeOfLink.SHORTCUT)
    }

    private fun backslashEscaped(): Boolean {
        if (!lexer.isEndOfData()) {
            lexer.advanceCharacter()
            if (lexer.inspect { it in ESCAPABLE }) {
                return true
            }
        }
        // we shouldnt change lexer state as nothing of interest happened
        lexer.goBackOne()
        return false
    }

    // will return whether it contains a valid link label, as well as the corresponding label
    private fun linkLabel(lexer: InlineLexer): Pair<Boolean, String> {
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
                if (!Escaping.escapedBracket(lexer)) {
                    return falseReturn
                } else {
                    builder.append('[')
                }
            } else if (char == ']') {
                if (!Escaping.escapedBracket(lexer)) {
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
        // check for trailing ]
        if(lexer.inspect { it == ']' } && !Escaping.escapedBracket(lexer)){
            return Pair(true, builder.toString())
        }
        return falseReturn
    }

    private fun linkDestination(inline: Boolean, lexer : InlineLexer): Pair<Boolean, String> {
        return if (lexer.inspect('<')) bracketedDestination(lexer) else rawDestination(inline, lexer)
    }

    /*
    a sequence of zero or more characters between an opening < and a closing >
    that contains no line breaks or unescaped < or > characters, or
     */
    private fun bracketedDestination(lexer: InlineLexer): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        // skip the bracket, will be checked in linkDestination
        lexer.advanceCharacter()
        while (!lexer.isEndOfData()) {
            // first check whether it was escaped or not
            var char = lexer.getChar()
            if (char == '<') {
                if (!Escaping.escapedBracket(lexer)) {
                    return falseReturn
                }
            } else if (char == '>') {
                lexer.advanceCharacter()
                if (!Escaping.escapedBracket(lexer)) {
                    return Pair(true, builder.toString())
                }
            } else if (char == '\n') {
                return falseReturn
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    char = lexer.getChar()
                }
            } else if (char == '\n') {
                //undo the advance
                lexer.goBackOne()
                return falseReturn
            }
            builder.append(char)
            lexer.advanceCharacter()
        }
        // trailing '>' to end the paragraph, but it cannot be scaped
        if (lexer.inspect { it == '>' }) {
            lexer.goBackOne()
            if(!backslashEscaped()) {
                lexer.advanceCharacter()
                return Pair(true, builder.toString())
            }
            lexer.advanceCharacter()
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
    private fun rawDestination(inline: Boolean, lexer: InlineLexer): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        //inline allows this to successfullly end successfully upon getting a closing brace that is unmatched
        // ( will add to stack, ) will pop, if when ending the destination this is not empty
        // then we return false
        // or if when ) it is empty we return false
        val brackets = Stack<Char>()
        while (!lexer.isEndOfData()) {
            var char = lexer.getChar()
            if (char == ' ') {
                return if (brackets.isEmpty()) {
                    Pair(true, builder.toString())
                } else {
                    falseReturn
                }
            } else if (char == '(') {
                if (!Escaping.escapedBracket(lexer)) {
                    brackets.push(char)
                }
            } else if (char == ')') {
                if (!Escaping.escapedBracket(lexer)) {
                    if (brackets.isEmpty()) {
                        // this will be fine, as it just ends in a bracket
                        return if(inline){
                            Pair(true, builder.toString())
                        } else {
                            falseReturn
                        }
                    } else {
                        brackets.pop()
                    }
                }
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    char = lexer.getChar()
                }
            } else if (char == '\n') {
                return Pair(true, builder.toString())
            }
            builder.append(char)
            lexer.advanceCharacter()

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
    private fun linkTitle(lexer: InlineLexer): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        val closer = when (lexer.getChar()) {
            '"' -> '"'
            '\'' -> '\''
            '(' -> ')'
            else -> return falseReturn
        }
        // skip opening delimiter
        lexer.advanceCharacter()
        while (!lexer.isEndOfData()) {
            var char = lexer.getChar()
            if (char == closer) {
                lexer.advanceCharacter()
                return Pair(true, builder.toString())
            } else if (char == '(' && closer == ')') {
                if (!Escaping.escapedBracket(lexer)) {
                    return falseReturn
                }
            } else if (char == '\\') {
                if (backslashEscaped()) {
                    // just skip the backslash as its escaping something
                    char = lexer.getChar()
                }
            }
            builder.append(char)
            lexer.advanceCharacter()
        }


        if (lexer.inspect { it == closer }) {
            return Pair(true, builder.toString())
        }
        return falseReturn
    }



    companion object {
        // just a single instantiation for a false return then
        private val falseReturn = MatchedLink(false, 0, Link("", ""), typeOfLink.FULL)
    }
}