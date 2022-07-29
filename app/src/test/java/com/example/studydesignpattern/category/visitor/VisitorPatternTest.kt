package com.example.studydesignpattern.category.visitor

import org.junit.Assert.assertEquals
import org.junit.Test

class VisitorPatternTest {

    @Test
    fun `Wheel(1000) 의 cost 는 1000 이다`() {

        val wheel = Wheel(1000)

        assertEquals(wheel.cost, 1000)

    }

    @Test
    fun `Body(3000) 의 cost 는 3000 이다`() {

        val body = Body(3000)

        assertEquals(body.cost, 3000)

    }

    @Test
    fun `Engine(5000) 의 cost 는 1000 이다`() {

        val engine = Engine(5000)

        assertEquals(engine.cost, 5000)

    }

    @Test
    fun `CarElementVisitor 의 visit(Wheel(1000)) 의 값은 1000 이다 `() {

        val carElementVisitor = CarElementVisitor()
        assertEquals(carElementVisitor.visit(Wheel(1000)), 1000)

    }


    @Test
    fun `CarElementVisitor 의 visit(Body(3000)) 의 값은 3000 이다 `() {

        val carElementVisitor = CarElementVisitor()
        assertEquals(carElementVisitor.visit(Body(3000)), 3000)

    }


    @Test
    fun `CarElementVisitor 의 visit(Engine(5000)) 의 값은 5000 이다 `() {



        val carElementVisitor = CarElementVisitor()
        assertEquals(carElementVisitor.visit(Engine(5000)), 5000)

    }




    @Test
    fun `carElementList(Wheel(1000),Body(3000),Engine(5000)) 의 CarElementVisitor 를 이용한 합은 9000 이어야 한다`() {

        val carElementList = arrayListOf(Wheel(1000),Body(3000),Engine(5000))

        val carElementVisitor = CarElementVisitor()

        val totalCost = carElementList.sumOf { it.accept(carElementVisitor) }

        assertEquals(totalCost, 9000)

    }



    @Test
    fun `버스의 기름이 10이고 운전을 1번 했을때 값이 올바르게 나와야 한다`() {

        val bus = Bus(10).apply {
            drive()
        }
        assert(bus.getFuel() == 9)
        assert(bus.visit(CarViewVisitor()) == "현재 버스의 기름 상태 : 9")
    }

    @Test
    fun `test`() {

        val wheel = Wheel(1000)
        val engine = Engine(1000)
        val body = Body(1000)

        val carList = arrayListOf(wheel, engine, body)

        val carElementVisitor = CarElementVisitor()

        val totalCost = carList.sumOf { it.accept(carElementVisitor) }

        assertEquals(totalCost, 3000)
    }
}


interface Car {
    fun drive(): Int
    fun getFuel(): Int
    fun visit(viewVisitor: ViewVisitor): String
}


interface ICarElementVisitable {
    fun <R> accept(visitor: ICarElementVisitor<R>): R
}

interface ICarElementVisitor<out R> {
    fun visit(wheel: Wheel): R
    fun visit(engine: Engine): R
    fun visit(body: Body): R
}

class Wheel(val cost: Int) : ICarElementVisitable {
    override fun <R> accept(visitor: ICarElementVisitor<R>): R {
        return visitor.visit(this)
    }
}

class Engine(val cost: Int) : ICarElementVisitable {
    override fun <R> accept(visitor: ICarElementVisitor<R>): R {
        return visitor.visit(this)
    }
}

class Body(val cost: Int) : ICarElementVisitable {
    override fun <R> accept(visitor: ICarElementVisitor<R>): R {
        return visitor.visit(this)
    }
}

class CarElementVisitor : ICarElementVisitor<Int> {
    override fun visit(wheel: Wheel): Int {
        return wheel.cost
    }

    override fun visit(engine: Engine): Int {
        return engine.cost
    }

    override fun visit(body: Body): Int {
        return body.cost
    }
}


interface ViewVisitor {
    fun visit(bus: Bus): String
    fun visit(truck: Truck): String
}

class Bus(fuel: Int) : Car {

    private var busFuel = 0

    init {
        busFuel = fuel
    }

    override fun drive(): Int {
        return --busFuel
    }

    override fun getFuel(): Int {
        return busFuel
    }

    override fun visit(viewVisitor: ViewVisitor): String {
        return viewVisitor.visit(this)
    }
}

class Truck(fuel: Int) : Car {

    private var truckFuel = 0

    init {
        truckFuel = fuel
    }

    override fun drive(): Int {
        return --truckFuel
    }

    override fun getFuel(): Int {
        return truckFuel
    }

    override fun visit(viewVisitor: ViewVisitor): String {
        return viewVisitor.visit(this)
    }

}

class CarViewVisitor : ViewVisitor {

    private companion object {
        private const val BUS_STATUS = "현재 버스의 기름 상태 : "
        private const val TRUCK_STATUS = "현재 트럭의 기름 상태 : "
    }

    override fun visit(bus: Bus): String {
        return BUS_STATUS + bus.getFuel()

    }

    override fun visit(truck: Truck): String {
        return TRUCK_STATUS + truck.getFuel()
    }
}