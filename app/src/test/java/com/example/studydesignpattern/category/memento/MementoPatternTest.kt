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

        careTaker.saveState(originator.createMemento())

        originator.state = "State 2"

        assertEquals(originator.state, "State 2")

        originator.restore(careTaker.restore(1))

        assertEquals(originator.state, "State 1")

        originator.restore(careTaker.restore(0))

        assertEquals(originator.state, "initial state")

    }

    @Test
    fun `RawMementoTest`() {

        val rawMemento = RawMemento("initial state")

        rawMemento.saveState(rawMemento.createMemento())

        rawMemento.state = "State 1"

        rawMemento.saveState(rawMemento.createMemento())

        rawMemento.state = "State 2"

        assertEquals(rawMemento.state, "State 2")

        rawMemento.restore(rawMemento.restore(1))

        assertEquals(rawMemento.state, "State 1")

        rawMemento.restore(rawMemento.restore(0))

        assertEquals(rawMemento.state, "initial state")

    }
}