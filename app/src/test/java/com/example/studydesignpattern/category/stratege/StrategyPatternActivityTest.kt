package com.example.studydesignpattern.category.stratege

import org.junit.Test


class StrategyPatternActivityTest {


    @Test
    fun `ABS 기능을 탑재한 브레이크 기능을 SUV 자동차에 적용할 수 있다`() {

        val suv = SUV()

        assert(suv.applyBrake() == "Brake With ABS")

    }

}

class SUV : Car(BrakeWithABS())


abstract class Car(private val behavior: IBrakeBehavior) {

    open fun applyBrake(): String {
        return behavior.brake()
    }

}

interface IBrakeBehavior {
    fun brake(): String
}

class BrakeWithABS : IBrakeBehavior {
    override fun brake(): String {
        return "Brake With ABS"
    }
}

class Brake : IBrakeBehavior {
    override fun brake(): String {
        return "Brake Only"
    }
}
