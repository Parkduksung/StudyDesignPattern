package com.example.studydesignpattern.category.singleton

import org.junit.Test

class SingletonPatternTest {


    @Test
    fun `싱글턴 구조로 만들어진 객체 A를 생성하여 message 값을 저장하고 새롭게 객체 B를 생성하였을때, 객체 A 와 객체 B 의 message 값이 동일해야 한다`() {

        val objectA = SingletonObject

        val objectB = SingletonObject

        objectA.setMessage("saveMessage")

        assert(objectA.getMessage() == objectB.getMessage())
    }

    @Test
    fun `싱글턴 구조로 만들어진 SingletonObject 의 객체 A의 message 값을 변경하였을 때, 객체 B의 message 값도 변경되어야 한다`() {

        val objectA = SingletonObject.apply {
            setMessage("objectA")
        }

        assert(objectA.getMessage() == "objectA")

        val objectB = SingletonObject.apply {
            setMessage("objectB")
        }

        assert(objectA.getMessage() == "objectB")

    }

}

object SingletonObject {

    private var message = ""

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage(): String = message

}
