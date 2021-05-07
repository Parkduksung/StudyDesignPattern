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


class FacadeComputer {

    private val mouse: Mouse = Mouse()
    private val keyboard = Keyboard()
    private val monitor = Monitor()

    fun mouseSwitchOn(): String = mouse.switchOn()
    fun mouseSwitchOff(): String = mouse.switchOff()

    fun keyboardSwitchOn(): String = keyboard.switchOn()
    fun keyboardSwitchOff(): String = keyboard.switchOff()

    fun monitorSwitchOn(): String = monitor.switchOn()
    fun monitorSwitchOff(): String = monitor.switchOff()

}


interface Equipment {
    fun switchOn(): String
    fun switchOff(): String
}

class Monitor : Equipment {

    override fun switchOn(): String {
        return "Red"
    }

    override fun switchOff(): String {
        return "Black"
    }
}

class Mouse : Equipment {

    override fun switchOn(): String {
        return "Red"
    }

    override fun switchOff(): String {
        return "Black"
    }

}

class Keyboard : Equipment {

    override fun switchOn(): String {
        return "Red"
    }

    override fun switchOff(): String {
        return "Black"
    }

}