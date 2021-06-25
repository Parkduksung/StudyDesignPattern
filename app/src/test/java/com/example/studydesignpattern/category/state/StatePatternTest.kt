package com.example.studydesignpattern.category.state

import org.junit.Assert.*
import org.junit.Test

class StatePatternTest {


    @Test
    fun `LightOn 의 onButtonPushed 의 값은 stateNotChanged 이어야 한다`() {

        val lightOn = LightOn()

        assert(lightOn.onButtonPushed() == "stateNotChanged")

    }

    @Test
    fun `LightOn 의 offButtonPushed 의 값은 stateChangedOff 이어야 한다`() {

        val lightOn = LightOn()

        assert(lightOn.offButtonPushed() == "stateChangedOff")

    }

    @Test
    fun `LightOff 의 offButtonPushed 의 값은 stateNotChanged 이어야 한다`() {

        val lightOff = LightOff()

        assert(lightOff.offButtonPushed() == "stateNotChanged")

    }

    @Test
    fun `LightOff 의 onButtonPushed 의 값은 stateChangedOn 이어야 한다`() {

        val lightOff = LightOff()

        assert(lightOff.onButtonPushed() == "stateChangedOn")

    }

    @Test
    fun `Client 의 state 가 LightOn 일때 onButtonPushed 의 값은 stateNotChanged 이어야 한다`() {

        val client = Client()

        client.setState(LightOn())

        assert(client.onButtonPushed() == "stateNotChanged")

    }

    @Test
    fun `Client 의 state 가 LightOn 일때 offButtonPushed 의 값은 stateChangedOff 이어야 한다`() {

        val client = Client()

        client.setState(LightOn())

        assert(client.offButtonPushed() == "stateChangedOff")

    }

    @Test
    fun `Client 의 state 가 LightOff 일때 onButtonPushed 의 값은 stateChangedOn 이어야 한다`() {

        val client = Client()

        client.setState(LightOff())

        assert(client.onButtonPushed() == "stateChangedOn")

    }

    @Test
    fun `Client 의 state 가 LightOff 일때 offButtonPushed 의 값은 stateNotChanged 이어야 한다`() {

        val client = Client()

        client.setState(LightOff())

        assert(client.offButtonPushed() == "stateNotChanged")

    }


}