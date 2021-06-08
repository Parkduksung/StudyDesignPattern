package com.example.studydesignpattern.category.interpreter

import org.junit.Assert.*
import org.junit.Test

class InterpreterPatternTest {

    @Test
    fun `OrExpression(TerminalExpression("Person1"),TerminalExpression("Person1")) 의 interpreter("Person1") 값은 true 이어야 한다`() {

        val person1 : Expression = TerminalExpression("Person1")
        val person2 : Expression = TerminalExpression("Person2")

        val orExpression = OrExpression(person1,person2)

        assertTrue(orExpression.interpreter("Person1"))
    }

    @Test
    fun `AndExpression(TerminalExpression("Person1"),TerminalExpression("Person1")) 의 interpreter("Person1,Person2") 값은 true 이어야 한다`() {

        val person1 : Expression = TerminalExpression("Person1")
        val person2 : Expression = TerminalExpression("Person2")

        val andExpression = AndExpression(person1,person2)

        assertTrue(andExpression.interpreter("Person1,Person2"))
    }


}