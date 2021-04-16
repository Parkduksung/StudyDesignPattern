package com.example.studydesignpattern.category.decorator

import org.junit.Test

class DecoratorExamTest {


    @Test
    fun `HouseCoffee 를 만들었을때, 가격은 2000 이어야 한다`() {

        val houseBlend = HouseCoffee()

        assert(houseBlend.cost() == 2000)

    }

    @Test
    fun `HouseCoffee 를 만들었을때, Beverage, Add HouseCoffee 가 명세되어야 한다`() {

        val houseBlend = HouseCoffee()

        assert(houseBlend.getDescription() == "Beverage, Add HouseCoffee")

    }

    @Test
    fun `HouseCoffee 에 Milk 를 추가하였을때, 2500 이어야 한다`() {

        val houseCoffeeAddMilk = Milk(HouseCoffee())

        assert(houseCoffeeAddMilk.cost() == 2500)

    }

    @Test
    fun `HouseCoffee 에 Milk 를 추가하였을때, Beverage, Add HouseCoffee, Add Milk 가 명세되어야 한다`(){

        val houseCoffeeAddMilk = Milk(HouseCoffee())

        assert(houseCoffeeAddMilk.getDescription() == "Beverage, Add HouseBlend, Add Milk")
    }

    @Test
    fun `HouseCoffee 에 Milk 를 두개 추가하였을때, Beverage, Add HouseCoffee, Add Milk, Add Milk 가 명세되어야 한다`(){

        val houseCoffeeAddMilk = Milk(Milk(HouseCoffee()))

        assert(houseCoffeeAddMilk.getDescription() == "Beverage, Add HouseBlend, Add Milk, Add Milk")
    }
}


//abstract class Beverage {
//
//    private val description: String = "Beverage"
//
//    abstract fun cost(): Int
//
//    open fun getDescription(): String {
//        return description
//    }
//
//}
//
//class HouseBlend : Beverage() {
//    override fun cost(): Int = 1000
//
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add HouseBlend"
//    }
//}
//
//class DarkRoast : Beverage() {
//    override fun cost(): Int = 1500
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add DarkRoast"
//    }
//}
//
//class Decaf : Beverage() {
//    override fun cost(): Int = 2000
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Decaf"
//    }
//}
//
//class Espresso : Beverage() {
//    override fun cost(): Int = 2500
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Espresso"
//    }
//}
//
//
//abstract class CondimentDecorator(private val beverage: Beverage) : Beverage() {
//
//    override fun cost(): Int {
//        return beverage.cost()
//    }
//
//    override fun getDescription(): String {
//        return beverage.getDescription()
//    }
//}
//
//class Milk(beverage: Beverage) : CondimentDecorator(beverage) {
//
//    override fun cost(): Int = super.cost() + 500
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Milk"
//    }
//}
//
//class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
//
//    override fun cost(): Int = super.cost() + 500
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Mocha"
//    }
//}
//
//class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
//    override fun cost(): Int = super.cost() + 300
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Soy"
//    }
//}
//
//class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
//    override fun cost(): Int = super.cost() + 100
//
//    override fun getDescription(): String {
//        return super.getDescription() + ", Add Whip"
//    }
//}