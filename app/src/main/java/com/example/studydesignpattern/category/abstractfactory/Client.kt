package com.example.studydesignpattern.category.abstractfactory

class Client(private val abstractFactoryStub: AbstractFactoryStub) {

    fun create(): String {
        return abstractFactoryStub.getName()
    }
}
