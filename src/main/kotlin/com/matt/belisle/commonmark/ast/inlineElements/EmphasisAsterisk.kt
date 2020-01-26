package com.matt.belisle.commonmark.ast.inlineElements

class EmphasisAsterisk(inlines: List<Inline>, strong: Boolean): InlineEmphasis(inlines) {
   override  val tag = if(strong) "strong" else "em"

    companion object: Emphasis<EmphasisAsterisk>() {
        override val delimiter = '*'
        override fun makeRun(length: Int, before: Char, after: Char, startingIndex: Int): Run {
            val leftFlanking = leftFlanking(after, before)
            val rightFlanking = rightFlanking(after, before)
            return Run(getRunType(leftFlanking, rightFlanking), delimiter, length, startingIndex)
        }

        override fun createEmphasis(inlines: List<Inline>, strong: Boolean): EmphasisAsterisk {
            return EmphasisAsterisk(inlines, strong)
        }
    }
}