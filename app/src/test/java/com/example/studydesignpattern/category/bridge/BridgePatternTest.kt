package com.example.studydesignpattern.category.bridge

import org.junit.Assert.*
import org.junit.Test

class BridgePatternTest{

    @Test
    fun `Produce 의 work 의 값은 Produced 이어야 한다` (){

        val produce = Produce()

        assert(produce.work() == "Produced")

    }

    @Test
    fun `Assemble 의 work 의 값은 Assembled 이어야 한다` () {
        val assemble = Assemble()

        assert(assemble.work() == "Assembled")
    }

    @Test
    fun `Bike 의 manufacture 의 값은 BikeProducedAssembled 이어야 한다`(){

        val bike = Bike()

        assert(bike.manufacture() == "BikeProducedAssembled")

    }

    @Test
    fun `Car 의 manufacture 의 값은 CarProducedAssembled 이어야 한다`(){

        val car = Car()

        assert(car.manufacture() == "CarProducedAssembled")

    }


}