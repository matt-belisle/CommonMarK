package com.matt.belisle.commonmark.parser.inlineParsingUtil

import java.nio.charset.Charset
import java.util.*
import java.util.regex.Pattern
import kotlin.experimental.and

// This is taken from Atlassian's implementation for commonmark-java as I was unable to find a better way to do
// these operations
object Escaping {
    const val ESCAPABLE = "[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"
    const val ENTITY = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});"
    private val BACKSLASH_OR_AMP = Pattern.compile("[\\\\]")
    private val ESCAPED_CHAR = Pattern.compile(
        "\\\\$ESCAPABLE",
        Pattern.CASE_INSENSITIVE
    )
    // From RFC 3986 (see "reserved", "unreserved") except don't escape '[' or ']' to be compatible with JS encodeURI
    private val ESCAPE_IN_URI =
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])")
    public val HEX_DIGITS =
        charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    private val WHITESPACE = Pattern.compile("[ \t\r\n]+")

    private val URI_REPLACER: Replacer = object : Replacer {
        override fun replace(input: String, sb: StringBuilder) {
            if (input.startsWith("%")) {
                if (input.length == 3) { // Already percent-encoded, preserve
                    sb.append(input)
                } else { // %25 is the percent-encoding for %
                    sb.append("%25")
                    sb.append(input, 1, input.length)
                }
            } else {
                val bytes = input.toByteArray(Charset.forName("UTF-8"))
                for (b in bytes) {
                    sb.append('%')
                    sb.append(HEX_DIGITS[(b.toInt() shr 4) and 0xF])
                    sb.append(HEX_DIGITS[(b and 0xF).toInt()])
                }
            }
        }
    }
    private val UNESCAPE_REPLACER: Replacer = object : Replacer {
        override fun replace(input: String, sb: java.lang.StringBuilder) {
            if (input[0] == '\\') {
                sb.append(input, 1, input.length)
            }
        }
    }


    fun percentEncodeUrl(s: String): String {
        return replaceAll(ESCAPE_IN_URI, s, URI_REPLACER)
    }


    fun normalizeLabelContent(input: String): String {
        val trimmed = input.trim { it <= ' ' }
        val lowercase = trimmed.toLowerCase(Locale.ROOT)
        return WHITESPACE.matcher(lowercase).replaceAll(" ")
    }

    private fun replaceAll(p: Pattern, s: String, replacer: Replacer): String {
        val matcher = p.matcher(s)
        if (!matcher.find()) {
            return s
        }
        val sb = StringBuilder(s.length + 16)
        var lastEnd = 0
        do {
            sb.append(s, lastEnd, matcher.start())
            replacer.replace(matcher.group(), sb)
            lastEnd = matcher.end()
        } while (matcher.find())
        if (lastEnd != s.length) {
            sb.append(s, lastEnd, s.length)
        }
        return sb.toString()
    }

    // assumes that the following text is a square bracket
    fun escapedBracket(lexer: InlineLexer): Boolean {
        var backslashes = 0
        do{
            lexer.goBackOne()
            if(lexer.inspect('\\')) backslashes++
        } while (lexer.inspect('\\'))
        val ret = backslashes % 2 == 1
        lexer.advanceCharacter(backslashes + 1)
        return ret
    }
    fun unescapeString(s: String): String {
        return if (BACKSLASH_OR_AMP.matcher(s).find()) {
            replaceAll(ESCAPED_CHAR, s, UNESCAPE_REPLACER)
        } else {
            s
        }
    }
    private interface Replacer {
        fun replace(input: String, sb: StringBuilder)
    }


}