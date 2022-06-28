package com.example.studydesignpattern.category.chainofresponsibility

import com.example.studydesignpattern.category.chinofresponsibility.*
import org.junit.Test

class ChainOfResponsibilityPatternTest {


    @Test
    fun `동전테스트`() {


        val c1: DispenseChain = Won100Dispense()
        val c2: DispenseChain = Won10Dispense()
        val c3: DispenseChain = Won1Dispense()

        c1.setNextChain(c2)
        c2.setNextChain(c3)

        println(c1.dispense(Currency(378)))

    }


    @Test
    fun `Won100Dispense 의 Currency amount 값이 200 일때 dispense 의 값은 "100원 동전 갯수 - 2 " 이어야 한다`() {


        val c1: DispenseChain = Won100Dispense()

        assert(c1.dispense(Currency(200)) == "100원 동전 갯수 - 2 ")

    }

    @Test
    fun `Won10Dispense 의 Currency amount 값이 20 일때 dispense 의 값은 "10원 동전 갯수 - 2 " 이어야 한다`() {


        val c1: DispenseChain = Won10Dispense()

        assert(c1.dispense(Currency(20)) == "10원 동전 갯수 - 2 ")

    }

    @Test
    fun `Won1Dispense 의 Currency amount 값이 2 일때 dispense 의 값은 "1원 동전 갯수 - 2 " 이어야 한다`() {


        val c1: DispenseChain = Won1Dispense()

        assert(c1.dispense(Currency(2)) == "1원 동전 갯수 - 2 ")

    }
}