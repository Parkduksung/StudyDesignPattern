package com.example.studydesignpattern.category.decorator

import org.junit.Test

class DecoratorExamTest {


}


abstract class Beverage {

    private val description: String = "Beverage"

    abstract fun cost(): Int

    open fun getDescription(): String {
        return description
    }

}

class HouseBlend : Beverage() {
    override fun cost(): Int = 1000


    override fun getDescription(): String {
        return super.getDescription() + ", Add HouseBlend"
    }
}

class DarkRoast : Beverage() {
    override fun cost(): Int = 1500

    override fun getDescription(): String {
        return super.getDescription() + ", Add DarkRoast"
    }
}

class Decaf : Beverage() {
    override fun cost(): Int = 2000

    override fun getDescription(): String {
        return super.getDescription() + ", Add Decaf"
    }
}

class Espresso : Beverage() {
    override fun cost(): Int = 2500

    override fun getDescription(): String {
        return super.getDescription() + ", Add Espresso"
    }
}


abstract class CondimentDecorator(private val beverage: Beverage) : Beverage() {

    override fun cost(): Int {
        return beverage.cost()
    }

    override fun getDescription(): String {
        return beverage.getDescription()
    }
}

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Int = super.cost() + 500

    override fun getDescription(): String {
        return super.getDescription() + ", Add Milk"
    }
}

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Int = super.cost() + 500

    override fun getDescription(): String {
        return super.getDescription() + ", Add Mocha"
    }
}

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Int = super.cost() + 300

    override fun getDescription(): String {
        return super.getDescription() + ", Add Soy"
    }
}

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Int = super.cost() + 100

    override fun getDescription(): String {
        return super.getDescription() + ", Add Whip"
    }
}