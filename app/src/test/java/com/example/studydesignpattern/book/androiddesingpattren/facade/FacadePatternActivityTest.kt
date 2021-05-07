package com.example.studydesignpattern.book.androiddesingpattren.facade

import org.junit.Test


class FacadePatternActivityTest {

    @Test
    fun `Mouse 의 switchOn 값은 Red 이어야 한다`() {

        val mouse = Mouse()

        assert(mouse.switchOn() == "Red")
    }

    @Test
    fun `Mouse 의 switchOff 값은 Black 이어야 한다`() {

        val mouse = Mouse()

        assert(mouse.switchOff() == "Black")
    }

    @Test
    fun `Keyboard 의 switchOn 값은 Red 이어야 한다`() {

        val keyboard = Keyboard()

        assert(keyboard.switchOn() == "Red")
    }

    @Test
    fun `Keyboard 의 switchOff 값은 Black 이어야 한다`() {

        val keyboard = Keyboard()

        assert(keyboard.switchOff() == "Black")
    }

    @Test
    fun `Monitor 의 switchOn 값은 Red 이어야 한다`() {

        val monitor = Monitor()

        assert(monitor.switchOn() == "Red")
    }

    @Test
    fun `Monitor 의 switchOff 값은 Black 이어야 한다`() {

        val monitor = Monitor()

        assert(monitor.switchOff() == "Black")
    }

    @Test
    fun `FacadeComputer 의 monitorSwitchOn 일때 값은 Red 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.monitorSwitchOn() == "Red")

    }


    @Test
    fun `FacadeComputer 의 monitorSwitchOff 일때 값은 Black 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.monitorSwitchOff() == "Black")
    }

    @Test
    fun `FacadeComputer 의 keyboardSwitchOn 일때 값은 Red 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.keyboardSwitchOn() == "Red")

    }


    @Test
    fun `FacadeComputer 의 keyboardSwitchOff 일때 값은 Black 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.keyboardSwitchOff() == "Black")
    }

    @Test
    fun `FacadeComputer 의 mouseSwitchOn 일때 값은 Red 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.mouseSwitchOn() == "Red")

    }


    @Test
    fun `FacadeComputer 의 mouseSwitchOff 일때 값은 Black 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.mouseSwitchOff() == "Black")
    }



}

