package com.example.studydesignpattern.category.abstractfactory

import java.lang.Exception


class AbstractFactoryStub(private val type : String) : AbstractFactory {

    override fun getName(): String {
        return when(type) {
            "type1" -> ProductA1().productName() + ProductB1().productName()
            "type2" -> ProductA2().productName() + ProductB2().productName()
            else -> {throw Exception()}
        }
    }

    override fun createProductA(): AbstractProductA {
        return when(type) {
            "type1" -> ProductA1()
            "type2" -> ProductA2()
            else -> {throw Exception()}
        }
    }

    override fun createProductB(): AbstractProductB {
        return when(type) {
            "type1" -> ProductB1()
            "type2" -> ProductB2()
            else -> {throw Exception()}
        }
    }
}

interface AbstractFactory {
    fun getName() : String
    fun createProductA(): AbstractProductA
    fun createProductB(): AbstractProductB
}

class ConcreteFactory1 : AbstractFactory {
    override fun createProductA(): ProductA1 {
        return ProductA1()
    }
    override fun createProductB() : ProductB1 {
        return ProductB1()
    }

    override fun getName(): String {
        return createProductA().productName() + createProductB().productName()
    }
}

class ConcreteFactory2 : AbstractFactory {

    override fun createProductA(): ProductA2 {
        return ProductA2()
    }
    override fun createProductB() : ProductB2 {
        return ProductB2()
    }

    override fun getName(): String {
        return createProductA().productName() + createProductB().productName()
    }

}
