# CommonMarK 
This library provides the parsing functionality for a CommonMark compliant parser that is null safe, fast, extendable, and highly modular

:construction: **Work in progress!** - the core interface for parsing and rendering is unlikely to change, but some breaking changes may be made in future releases.

## How To Use

To use simply import the CommonMark parser class and instantiate it, the default constructor shipped is CommonMark compliant:

```
import com.matt.belisle.commonmark.parser.CommonMarkParser

fun main(){
    // default constructor
    val parser = CommonMarkParser()
    val data = "*hi*"
    // returns a parse tree with blocks and inlines created
    val parsed = parser.parse(listOf(data))
    // renders to HTML
    val rendered = parsed.render()
    //<p><em>hi</em></p>
    println(rendered)
}
```

If for example you did not want code blocks and * delimited emphasis runs the following would accomplish that:

```
package com.matt.belisle.commonmark.ast

import CodeFence
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.inlineElements.EmphasisUnderscore
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.parser.CommonMarkParser
import com.matt.belisle.commonmark.visitors.ParagraphMergerVisitor
import com.matt.belisle.commonmark.visitors.linkReferenceDefinitionVisitor.LinkReferenceDefinitionVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.BlankLinePropagationVisitor
import com.matt.belisle.commonmark.visitors.listVisitors.CreateListBlockVisitor

fun main(){
    // in order, the list of available leaf block types, container block types (note List is implicit with
    // listItem but to actually parse a list BlankLinePropVisitor and CreateListBlockVisitor must be included
    // then visitors, these are for blocks that are much easier to discern after all of the data has been parsed
    // and finally the emphasis types allowed for inlines
    val parser = CommonMarkParser(listOf(
        HTMLBlock.Companion,
        CodeFence.Companion,
        ThematicBreak.Companion,
        ATXHeading.Companion,
        Paragraph.Companion,
        BlankLine.Companion
    ),
        listOf(BlockQuote.Companion, ListItem.Companion),
        listOf(
            LinkReferenceDefinitionVisitor(),
            BlankLinePropagationVisitor(), CreateListBlockVisitor(), ParagraphMergerVisitor()
        ),
        listOf(EmphasisUnderscore.Companion))
    val data = """
    *hi*\
            I am not Code
    """.trimMargin()
    // returns a parse tree with blocks and inlines created
    val parsed = parser.parse(listOf(data))
    // renders to HTML
    val rendered = parsed.render()
    //<p>*hi*<br />
    //            I am not Code</p>
    println(rendered)

}
```

### Design Notes

As seen in the second example, the non-default constructor takes 4 things, a list of leaf blocks, container blocks,
 visitors, and finally emphasis types
 
 If desired you can pick and choose which blocks are allowed, but you cannot remove blank lines and paragraphs.
 
 Blocks are implemented using companion objects in Kotlin, this is where the initial matching and parse logic is held
 for each block type, the companion object creates instances of each object and is in general the only way to create a
 block. 
 
 Emphasis runs are similar except their companion object defines only the tags for strong and weak of each type, and the
 delimiter itself. 
 
 
 Each block is allowed to selectively choose which inlines it will use through the use of flags when rendering,
 for example the code block sets all the inlines to false except it allows entity replacements.
 
### Adding Functionality

To implement a new block type simply follow the example laid out in any of the blocks already created 
(Paragraph is a good starting spot).

There is only one inline allowed to be extended as of now, and that is emphasis, so for new inlines define a new delimiter
and its tag, note it will follow the rules laid out in the CommonMark spec for emphasis.  
 
##Performance

Performance wise, CommonMarK is fast, being as fast as Flexmark in most tests, and only slightly higher 
in the ones FlexMark is faster at, and comparable with Commonmark-Java for smaller documents.

* CommonMarK

    | Test        |  Runtime (ms)        | 
    |:-----------:|:--------------------:| 
    | hello15     |  0.25874125874125875 | 
    | hello500    |  0.7002997002997003  | 
    | hello1000   |  0.8981018981018981  | 
    | hello5000   |  3.861138861138861   | 
    | hello10000  |  7.755244755244755   | 
    | hello50000  |  37.53446553446553   | 
    | hello100000 |  109.1968031968032   | 
    | test        |  34.02497502497503   | 
    | code        |  8.780219780219781   | 


* Flexmark 

    | Test        |  Runtime (ms)     | 
    |:-----------:|:-----------------:| 
    | hello15     | 0.613386613386613 | 
    | hello500    | 0.691308691308691 | 
    | hello1000   | 1.01098901098901  | 
    | hello5000   | 4.50849150849151  | 
    | hello10000  | 8.67032967032967  | 
    | hello50000  | 40.4995004995005  | 
    | hello100000 | 81.5454545454545  | 
    | test        | 28.1248751248751  | 
    | code        | 11.8291708291708  | 

* Commonmark-java

    | Test        | Runtime (ms)      | 
    |:-----------:|:-----------------:| 
    | hello15     | 0.14985014985015  | 
    | hello500    | 0.411588411588412 | 
    | hello1000   | 0.436563436563437 | 
    | hello5000   | 1.37962037962038  | 
    | hello10000  | 2.45054945054945  | 
    | hello50000  | 12.2247752247752  | 
    | hello100000 | 25.3996003996004  | 
    | test        | 8.998001998002    | 
    | code        | 3.03596403596404  | 
    
\* the tests are as follows, hello# is a simple file with test written on # amount of lines,
test is a concatenation of 10 large open-source projects ReadMes concatenated five times and then that file duplicated 
until it was ~10000 lines long, [ReadMes found here](https://github.com/fitzgen/common-mark-benchmarks/tree/master/github-explore-frontend-js).
Code is similar to hello except contains 10000 lines worth of single line fenced code blocks. The closest to a real 
world use case is the test called test, as it contains real world examples of MarkDown.

As can be seen through the various hello# tests, the parser performs linearly with simple inputs.


## RoadMap

(No particular order currently)

* Extensions to support GFM

* Examples of custom Blocks and Inlines (follows from GFM)

* Performance improvements

* Source positions for blocks and inlines 

* Publish to Maven for gradle access

* remove mandatory use of default inlines