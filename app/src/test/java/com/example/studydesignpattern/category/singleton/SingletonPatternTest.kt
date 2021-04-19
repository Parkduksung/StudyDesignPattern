package com.example.studydesignpattern.category.singleton

import org.junit.Assert.*
import org.junit.Test

class SingletonPatternTest{


    @Test
    fun `싱글턴 구조로 만들어진 객체 A를 생성하여 message 값을 저장하고 새롭게 객체 B를 생성하였을때, 객체 A 와 객체 B 의 message 값이 동일해야 한다`(){

        val objectA = SingletonObject()

        val objectB = SingletonObject()

        objectA.setMessage("saveMessage")

        assert(objectA.message == objectB.message)

    }

}