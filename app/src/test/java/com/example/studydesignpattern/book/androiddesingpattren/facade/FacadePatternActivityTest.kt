package com.example.studydesignpattern.book.androiddesingpattren.facade

import org.junit.Test

class FacadePatternActivityTest {

    @Test
    fun `Mouse 의 switchOn 값은 SWITCH_ON 이어야 한다`() {

        val mouse = Mouse()

        assert(mouse.switchOn() == EquipmentSwitch.SWITCH_ON)
    }

    @Test
    fun `Mouse 의 switchOff 값은 SWITCH_OFF 이어야 한다`() {

        val mouse = Mouse()

        assert(mouse.switchOff() == EquipmentSwitch.SWITCH_OFF)
    }

    @Test
    fun `Keyboard 의 switchOn 값은 SWITCH_ON 이어야 한다`() {

        val keyboard = Keyboard()

        assert(keyboard.switchOn() == EquipmentSwitch.SWITCH_ON)
    }

    @Test
    fun `Keyboard 의 switchOff 값은 SWITCH_OFF 이어야 한다`() {

        val keyboard = Keyboard()

        assert(keyboard.switchOff() == EquipmentSwitch.SWITCH_OFF)
    }

    @Test
    fun `Monitor 의 switchOn 값은 SWITCH_ON 이어야 한다`() {

        val monitor = Monitor()

        assert(monitor.switchOn() == EquipmentSwitch.SWITCH_ON)
    }

    @Test
    fun `Monitor 의 switchOff 값은 SWITCH_OFF 이어야 한다`() {

        val monitor = Monitor()

        assert(monitor.switchOff() == EquipmentSwitch.SWITCH_OFF)
    }

    @Test
    fun `FacadeComputer 의 monitorSwitchOn 일때 값은 SWITCH_ON 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.monitorSwitchOn() == EquipmentSwitch.SWITCH_ON)

    }


    @Test
    fun `FacadeComputer 의 monitorSwitchOff 일때 값은 SWITCH_OFF 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.monitorSwitchOff() == EquipmentSwitch.SWITCH_OFF)
    }

    @Test
    fun `FacadeComputer 의 keyboardSwitchOn 일때 값은 SWITCH_ON 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.keyboardSwitchOn() == EquipmentSwitch.SWITCH_ON)

    }


    @Test
    fun `FacadeComputer 의 keyboardSwitchOff 일때 값은 SWITCH_OFF 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.keyboardSwitchOff() == EquipmentSwitch.SWITCH_OFF)
    }

    @Test
    fun `FacadeComputer 의 mouseSwitchOn 일때 값은 SWITCH_ON 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.mouseSwitchOn() == EquipmentSwitch.SWITCH_ON)

    }


    @Test
    fun `FacadeComputer 의 mouseSwitchOff 일때 값은 SWITCH_OFF 이어야 한다`() {

        val facadeComputer = FacadeComputer()

        assert(facadeComputer.mouseSwitchOff() == EquipmentSwitch.SWITCH_OFF)
    }


}

