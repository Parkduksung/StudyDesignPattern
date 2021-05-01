package com.example.studydesignpattern.category.stratege


class BronzeDuck : Duck()

interface FlyBehavior {
    fun fly(): String
}

interface QuackBehavior {
    fun quack(): String
}


abstract class Duck {

    private lateinit var flyBehavior: FlyBehavior
    private lateinit var quackBehavior: QuackBehavior

    fun display(): String {
        return flyBehavior.fly() + ", " + quackBehavior.quack()
    }

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun performQuack(): String {
        return quackBehavior.quack()
    }

    fun performFly() : String{
        return flyBehavior.fly()
    }
}
