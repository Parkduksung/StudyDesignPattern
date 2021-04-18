package com.example.studydesignpattern.category.stratege

import org.junit.Test


class StrategyPatternActivityTest {


    @Test
    fun `ABS 기능을 탑재한 브레이크 기능을 SUV 자동차에 적용할 수 있다`() {

        val suv = SUV()

        assert(suv.applyBrake() == "Brake With ABS")

    }

}

class SUV : Car() {
    override fun applyBrake(): String {
        setBrakeBehavior(BrakeWithABS())
        return getBrakeBehavior()
    }
}


abstract class Car {

    private lateinit var brakeBehavior: IBrakeBehavior

    abstract fun applyBrake() : String

    fun setBrakeBehavior(iBrakeBehavior: IBrakeBehavior) {
        this.brakeBehavior = iBrakeBehavior
    }

    fun getBrakeBehavior() : String{
        return brakeBehavior.brake()
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
