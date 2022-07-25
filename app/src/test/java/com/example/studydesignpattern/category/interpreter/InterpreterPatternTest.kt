package com.example.studydesignpattern.category.interpreter

import org.junit.Assert.*
import org.junit.Test

class InterpreterPatternTest {


    @Test
    fun `TerminalExpression("Person1") 의 interpreter("Person1") 은 true 이어야 한다`() {

        val terminalExpression: Expression = TerminalExpression("Person1")

        assertTrue(terminalExpression.interpreter("Person1"))

    }

    @Test
    fun `TerminalExpression("Person1") 의 interpreter("Person") 은 false 이어야 한다`() {

        val terminalExpression: Expression = TerminalExpression("Person1")
        assertFalse(terminalExpression.interpreter("Person"))
    }


    @Test
    fun `OrExpression(TerminalExpression("Person1")) 의 interpreter("Person1") 은 true 이어야 한다`() {

        val terminalExpression1: Expression = TerminalExpression("Person1")

        val orExpression = OrExpression(terminalExpression1)

        assertTrue(orExpression.interpreter("Person1"))
    }

    @Test
    fun `OrExpression(TerminalExpression("Person1"), TerminalExpression("Person2")) 의 interpreter("Person1") 은 true 이어야 한다`() {

        val terminalExpression1: Expression = TerminalExpression("Person1")
        val terminalExpression2: Expression = TerminalExpression("Person2")

        val orExpression = OrExpression(terminalExpression1, terminalExpression2)

        assertTrue(orExpression.interpreter("Person1"))
    }


    @Test
    fun `AndExpression(TerminalExpression("Person1")) 의 interpreter("Person1") 값은 true 이어야 한다`() {

        val person1: Expression = TerminalExpression("Person1")

        val andExpression = AndExpression(person1)

        assertTrue(andExpression.interpreter("Person1"))
    }


    @Test
    fun `AndExpression(TerminalExpression("Person1"),TerminalExpression("Person")) 의 interpreter("Person1") 값은 false 이어야 한다`() {

        val person1: Expression = TerminalExpression("Person1")
        val person2: Expression = TerminalExpression("Person2")

        val andExpression = AndExpression(person1, person2)

        assertFalse(andExpression.interpreter("Person1"))
    }

    @Test
    fun `AndExpression(TerminalExpression("Person1"),TerminalExpression("Person2")) 의 interpreter("Person1,Person2") 값은 true 이어야 한다`() {

        val person1: Expression = TerminalExpression("Person1")
        val person2: Expression = TerminalExpression("Person2")

        val andExpression = AndExpression(person1, person2)

        assertTrue(andExpression.interpreter("Person1,Person2"))
    }

}