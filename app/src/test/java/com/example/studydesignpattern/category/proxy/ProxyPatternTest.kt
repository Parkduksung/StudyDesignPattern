package com.example.studydesignpattern.category.proxy

import org.junit.Assert.*
import org.junit.Test

class ProxyPatternTest {

    @Test
    fun `RealSubject 의 doAction 값이 DoAction_RealSubject 이어야 한다`() {
        val realSubject = RealSubject()
        assert(realSubject.doAction() == "DoAction_RealSubject")
    }

    @Test
    fun `Proxy 의 doAction 값이 DoAction_RealSubject 이어야 한다`() {
        val proxy = Proxy()
        assert(proxy.doAction == "DoAction_RealSubject")
    }

    @Test
    fun `Client 의 doAction 값이 DoAction_RealSubject 이어야 한다`() {
        val client = Client()
        assert(client.doAction() == "DoAction_RealSubject")
    }

}