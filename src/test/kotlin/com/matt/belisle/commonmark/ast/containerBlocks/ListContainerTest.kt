package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.TestCase
import com.matt.belisle.commonmark.ast.BasicBlockTest
import com.matt.belisle.commonmark.ast.leafBlocks.Paragraph
import org.junit.Assert
import org.junit.Test

class ListContainerTest : BasicBlockTest() {
    @Test
    fun basicTest(){
        // match empty lines

        Assert.assertTrue(ListContainer.match("*", document, 0))
        Assert.assertTrue(ListContainer.match("-", document, 0))
        Assert.assertTrue(ListContainer.match("+", document, 0))


        Assert.assertTrue(ListContainer.match("* ", document, 0))
        Assert.assertTrue(ListContainer.match("- ", document, 0))
        Assert.assertTrue(ListContainer.match("+ ", document, 0))

        val paragraph = Paragraph.parse("hi", document, 0, document)

        // cannot start a list when an open paragraph could be matched to with a blank line

        Assert.assertFalse(ListContainer.match("*", paragraph, 0))
        Assert.assertFalse(ListContainer.match("-", paragraph, 0))
        Assert.assertFalse(ListContainer.match("+", paragraph, 0))


        Assert.assertFalse(ListContainer.match("* ", paragraph, 0))
        Assert.assertFalse(ListContainer.match("- ", paragraph, 0))
        Assert.assertFalse(ListContainer.match("+ ", paragraph, 0))

        // can match if it is a paragraph but not a blank line
        Assert.assertTrue(ListContainer.match("+ hi", paragraph, 0))

        // shouldn't match if it could be interpreted as a thematic break

        Assert.assertFalse(ListContainer.match("* **", document, 0))
        Assert.assertFalse(ListContainer.match("- - - -", document, 0))
        Assert.assertTrue(ListContainer.match("+ +", document, 0))


        //numeric matching tests
        Assert.assertTrue(ListContainer.match("1. ", document, 0))
        Assert.assertTrue(ListContainer.match("1) ", document, 0))
        Assert.assertTrue(ListContainer.match("0123) ", document, 0))

        Assert.assertTrue(ListContainer.match("1.", document, 0))
        Assert.assertTrue(ListContainer.match("1)", document, 0))
        Assert.assertTrue(ListContainer.match("0123.", document, 0))
        // too large of number
        Assert.assertFalse(ListContainer.match("1234567890. ", document, 0))
        // no marker
        Assert.assertFalse(ListContainer.match("1 ", document, 0))
        Assert.assertFalse(ListContainer.match("1", document, 0))


        Assert.assertFalse(ListContainer.match("1.", paragraph, 0))
        Assert.assertFalse(ListContainer.match("1)", paragraph, 0))


        Assert.assertFalse(ListContainer.match("1) ", paragraph, 0))
        Assert.assertFalse(ListContainer.match("1. ", paragraph, 0))

        // can match if it is a paragraph but not a blank line
        Assert.assertTrue(ListContainer.match("1) hi", paragraph, 0))
        this.specTest(TestCase("   > > 1.  one\n>>\n>>     two\n", "",0,0,0,""))

    }
    @Test
    fun specTest(){
//        specTest(295)
        specTest("List items")
//        specTest("Lists")
    }

}