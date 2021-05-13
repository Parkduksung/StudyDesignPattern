package com.example.studydesignpattern.category.proxy

class ProxyPattern {
}


class Client {

    private val proxy by lazy { Proxy() }

    fun doAction(): String {
        return proxy.doAction()
    }
}

interface Subject {
    fun doAction(): String
}

class RealSubject : Subject {
    override fun doAction(): String {
        return "DoAction_RealSubject"
    }
}

class Proxy : Subject {

    private val realSubject by lazy { RealSubject() }

    override fun doAction(): String {
        return realSubject.doAction()
    }
}