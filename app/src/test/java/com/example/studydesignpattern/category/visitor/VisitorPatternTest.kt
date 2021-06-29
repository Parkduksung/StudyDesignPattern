package com.example.studydesignpattern.category.visitor

import org.junit.Test

class VisitorPatternTest {

    @Test
    fun `버스의 기름이 10이고 운전을 1번 했을때 값이 올바르게 나와야 한다`(){

        val bus = Bus(10).apply {
            drive()
        }

        assert(bus.getFuel() == 9)
        assert(bus.visit(CarViewVisitor()) == "현재 버스의 기름 상태 : 9")
    }
}


interface Car {
    fun drive(): Int
    fun getFuel(): Int

    fun visit(viewVisitor: ViewVisitor): String
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