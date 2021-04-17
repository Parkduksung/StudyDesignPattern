package com.example.studydesignpattern.category.decorator

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Int {
        return super.cost() + 500
    }

    override fun getDescription(): String {
        return super.getDescription() + ", Add Milk"
    }
}


abstract class CondimentDecorator(private val beverage: Beverage) : Beverage() {

    override fun getDescription(): String {
        return beverage.getDescription()
    }

    override fun cost(): Int {
        return beverage.cost()
    }
}