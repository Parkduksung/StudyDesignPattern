package com.example.studydesignpattern.category.memento

import org.junit.Assert.*
import org.junit.Test

class MementoPatternTest {


    @Test
    fun `MementoTest`() {

        val originator = Originator("initial state")
        val careTaker = CareTaker()

        careTaker.saveState(originator.createMemento())

        originator.state = "State 1"
        originator.state = "State 2"

        careTaker.saveState(originator.createMemento())

        originator.state = "State 3"

        assertEquals(originator.state, "State 3")

        originator.restore(careTaker.restore(1))

        assertEquals(originator.state, "State 2")

        originator.restore(careTaker.restore(0))

        assertEquals(originator.state, "initial state")

    }
}