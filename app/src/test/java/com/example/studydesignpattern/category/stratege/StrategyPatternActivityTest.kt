package com.example.studydesignpattern.category.stratege

import org.junit.Test


class StrategyPatternActivityTest {


    @Test
    fun `ABS 기능을 탑재한 브레이크 기능을 SUV 자동차에 적용할 수 있다`() {

        val suv = SUV()

        assert(suv.applyBrake == "Brake With ABS")

    }

}
