package com.example.studydesignpattern.category.flyweight

import org.junit.Test

class FlyWeightPatternTest {


    @Test
    fun `FlyWeight 를 사용했을때의 결과`() {

        val flyWeightPattern = FlyWeightPattern()

        flyWeightPattern.startUseFlyWeight()

    }

    @Test
    fun `FlyWeight 를 사용 안했을때의 결과`() {

        val flyWeightPattern = FlyWeightPattern()

        flyWeightPattern.startNotUseFlyWeight()

    }


}