package com.matt.belisle.commonmark.ast.inlineElements

class EmphasisUnderscore(inlines: List<Inline>, strong: Boolean): InlineEmphasis(inlines) {
    override  val tag = if(strong) "strong" else "em"

    companion object: Emphasis<EmphasisUnderscore>() {
        override val delimiter = '_'
        override fun makeRun(length: Int, before: Char, after: Char, startingIndex: Int): Run {
            val leftFlanking = leftFlanking(after, before)
            val rightFlanking = rightFlanking(after, before)
            val opener = leftFlanking && (!rightFlanking || (rightFlanking && isPunctuation(before)))
            val closer = rightFlanking && (!leftFlanking || (leftFlanking && isPunctuation(after)))
            return Run(getRunType(opener, closer), delimiter, length, startingIndex)
        }

        override fun createEmphasis(inlines: List<Inline>, strong: Boolean): EmphasisUnderscore {
            return EmphasisUnderscore(inlines, strong)
        }
    }
}