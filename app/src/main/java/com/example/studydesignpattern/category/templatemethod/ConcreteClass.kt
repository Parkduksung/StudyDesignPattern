package com.example.studydesignpattern.category.templatemethod


abstract class AbstractClass {

    protected abstract fun hock1(): String
    protected abstract fun hock2(): String
}


class ConcreteClass : AbstractClass() {

    public override fun hock1(): String {
        return "ABSTRACT hook1 implementation"
    }

    public override fun hock2(): String {
        return "ABSTRACT hook2 implementation"
    }

    fun templateMethod(): String =
        "${hock1()} ${hock2()}"
}
