package com.example.studydesignpattern.category.abstractfactory


interface Keyboard

interface Mouse

interface ComputerFactory {
    fun createKeyboard()
    fun createMouse()
}

class SamsungComputer : ComputerFactory {

    private lateinit var keyboard: Keyboard
    private lateinit var mouse: Mouse

    override fun createKeyboard() {
        keyboard = SamsungKeyboard()
    }

    override fun createMouse() {
        mouse = SamsungMouse()
    }

}

class LGComputer : ComputerFactory {

    private lateinit var keyboard: Keyboard
    private lateinit var mouse: Mouse

    override fun createKeyboard() {
        keyboard = LGKeyboard()
    }

    override fun createMouse() {
        mouse = LGMouse()
    }
}

class Computer {

    private lateinit var computerFactory: ComputerFactory

    fun createComputer(type : ComputerType){

        when(type) {

            ComputerType.LG -> {
                computerFactory = LGComputer()
            }

            ComputerType.SAMSUNG -> {
                computerFactory = SamsungComputer()
            }

        }

        computerFactory.apply {
            createKeyboard()
            createMouse()
        }

    }
}

enum class ComputerType {
    LG, SAMSUNG
}

class LGKeyboard : Keyboard {

    init {
        print("LGKeyboard 생성")
    }
}

class SamsungKeyboard : Keyboard {
    init {
        print("SamsungKeyboard 생성")
    }
}

class LGMouse : Mouse {
    init {
        print("LGMouse 생성")
    }
}

class SamsungMouse : Mouse {
    init {
        print("SamsungMouse 생성")
    }
}