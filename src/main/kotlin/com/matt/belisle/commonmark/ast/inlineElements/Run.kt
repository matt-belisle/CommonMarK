package com.matt.belisle.commonmark.ast.inlineElements

//NONE will mean ignore the run
//This also includes data for links
enum class RunType {OPENER, CLOSER, BOTH, NONE}

//represents a run  of a delimiter for emphasis parsing
class Run(val runType: RunType, val delimiter: Char, var length: Int, val startingIndex: Int, var active: Boolean = true){
    val endingIndex = startingIndex + length - 1
    // may be needed if the length is changed
    val indexAfterRun = startingIndex + length - 1
    fun canOpen() = runType == RunType.OPENER || runType == RunType.BOTH
    fun canClose() = runType == RunType.CLOSER || runType == RunType.BOTH
}