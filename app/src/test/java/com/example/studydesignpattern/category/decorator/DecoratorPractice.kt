package com.example.studydesignpattern.category.decorator

import org.junit.Test

class DecoratorPractice {


    @Test
    fun `빵의 종류를 베이글로 하였을때, 명세서에 Description Add Bagel 이라고 명세되어야 한다`() {

        val bagel = Bagel()

        assert(bagel.getDescription() == "Description Add Bagel")
    }

    @Test
    fun `빵의 종류를 베이글로 하였을때, 칼로리는 250 이 추가되어야 한다`(){

        val bagel = Bagel()

        assert(bagel.getKcal() >= 260)

    }

}