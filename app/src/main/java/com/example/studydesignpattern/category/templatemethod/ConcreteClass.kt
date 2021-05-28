package com.example.studydesignpattern.category.templatemethod


abstract class AbstractClass {

    protected abstract fun hock1(): String
    protected abstract fun hock2(): String

    open fun templateMethod(): String =
        "${hock1()} ${hock2()}"
}


class ConcreteClass : AbstractClass() {

    public override fun hock1(): String {
        return "ABSTRACT hook1 implementation"
    }

    public override fun hock2(): String {
        return "ABSTRACT hook2 implementation"
    }
}


class ColdBrew : CaffeineBeverage() {

    override fun totalCaffeine(): Int = 10
    override fun temperature(): Int = 4
}

class Americano : CaffeineBeverage() {
    override fun totalCaffeine(): Int = 8
    override fun temperature(): Int = 2
}

abstract class CaffeineBeverage {

    public final fun prepareRecipe() : String  {
        return "카페인 ${totalCaffeine()} 온도 ${temperature()}"
    }

    abstract fun totalCaffeine(): Int
    abstract fun temperature(): Int
}