package com.example.studydesignpattern.category.abstractfactory

import org.junit.Test
import com.example.studydesignpattern.category.abstractfactory.AbstractProductA as AbstractProductA1

class AbstractFactoryPattern {


    @Test
    fun `ProductA1 를 만든다`(){
        val productA1 = ProductA1()

        assert(productA1.productName() == "ProductA1")
    }

    @Test
    fun `ProductB1 를 만든다`(){

        val productB1 = ProductB1()

        assert(productB1.productName() == "ProductB1")
    }


    @Test
    fun `ConcreteFactory1 의 createProductA 를 했을때 productA1 이 만들어져야 한다`(){

        val concreteFactory1 = ConcreteFactory1()

        assert(concreteFactory1.createProductA().productName() == "ProductA1")

    }

    @Test
    fun `ConcreteFactory1 의 createProductB 를 했을때 productB1 이 만들어져야 한다`(){

        val concreteFactory1 = ConcreteFactory1()

        assert(concreteFactory1.createProductB().productName() == "ProductB1")

    }

    @Test
    fun `ProductA2 를 만든다`(){
        val productA2 = ProductA2()

        assert(productA2.productName() == "ProductA2")
    }

    @Test
    fun `ProductB2 를 만든다`(){

        val productB2 = ProductB2()

        assert(productB2.productName() == "ProductB2")
    }


    @Test
    fun `ConcreteFactory2 의 createProductA 를 했을때 productA2 이 만들어져야 한다`(){

        val concreteFactory2 = ConcreteFactory2()

        assert(concreteFactory2.createProductA().productName() == "ProductA2")

    }

    @Test
    fun `ConcreteFactory2 의 createProductB 를 했을때 productB2 이 만들어져야 한다`(){

        val concreteFactory2 = ConcreteFactory2()

        assert(concreteFactory2.createProductB().productName()=="ProductB2")

    }

    @Test
    fun `Client AbstractFactoryStub type1 일때 create 값이 ProductA1ProductB1 이어야 한다`(){

        val client = Client(AbstractFactoryStub("type1"))

        assert(client.create() == "ProductA1ProductB1")

    }

    @Test
    fun `Client AbstractFactoryStub type2 일때 create 값이 ProductA2ProductB2 이어야 한다`(){

        val client = Client(AbstractFactoryStub("type2"))

        assert(client.create() == "ProductA2ProductB2")

    }
}