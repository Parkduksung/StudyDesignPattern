package com.example.studydesignpattern.book.androiddesingpattren.facade

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityFactoryBinding

class FacadePatternActivity : BaseActivity<ActivityFactoryBinding>(R.layout.activity_facade) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


enum class EquipmentSwitch {
    SWITCH_ON, SWITCH_OFF
}


class FacadeComputer {

    private val mouse: Mouse = Mouse()
    private val keyboard = Keyboard()
    private val monitor = Monitor()

    fun mouseSwitchOn(): EquipmentSwitch = mouse.switchOn()
    fun mouseSwitchOff(): EquipmentSwitch = mouse.switchOff()

    fun keyboardSwitchOn(): EquipmentSwitch = keyboard.switchOn()
    fun keyboardSwitchOff(): EquipmentSwitch = keyboard.switchOff()

    fun monitorSwitchOn(): EquipmentSwitch = monitor.switchOn()
    fun monitorSwitchOff(): EquipmentSwitch = monitor.switchOff()

}


interface Equipment {
    fun switchOn(): EquipmentSwitch
    fun switchOff(): EquipmentSwitch
}

class Monitor : Equipment {

    override fun switchOn(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_ON
    }

    override fun switchOff(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_OFF
    }
}

class Mouse : Equipment {

    override fun switchOn(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_ON
    }

    override fun switchOff(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_OFF
    }

}

class Keyboard : Equipment {

    override fun switchOn(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_ON
    }

    override fun switchOff(): EquipmentSwitch {
        return EquipmentSwitch.SWITCH_OFF
    }

}