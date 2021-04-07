package com.example.studydesignpattern.category.observer

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class ObserverPatternActivityTest : BaseTest() {


    private val sampleObserver1: Observer = SampleObserver1()
    private val sampleObserver2: Observer = SampleObserver2()


    @Test
    fun `빈 옵저버 일 경우, 아무것도 찍히지 않아야 한다`() {

        val concreteSubject = ConcreteSubject()
        concreteSubject.notifyObserver()

        assertEquals("", outputStreamCaptor.toString())
    }


    @Test
    fun `옵저버에 추가되어 notify 시 , update 가 불려야 한다`() {

        val concreteSubject = ConcreteSubject()
        concreteSubject.registerObserver(sampleObserver1)
        concreteSubject.notifyObserver()

        assertEquals("SampleObserver1", outputStreamCaptor.toString())
    }

    @Test
    fun `옵저버에 추가된 것을 제거하여 빈 옵저버 상태에서 notify시, 아무것도 찍히지 않아야 한다`() {
        val concreteSubject = ConcreteSubject()
        concreteSubject.registerObserver(sampleObserver1)
        concreteSubject.removeObserver(sampleObserver1)
        concreteSubject.notifyObserver()

        assertEquals("", outputStreamCaptor.toString())
    }
}