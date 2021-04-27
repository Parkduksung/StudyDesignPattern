package com.example.studydesignpattern.category.bridge


abstract class Vehicle(workshop1: Workshop, workshop2: Workshop) {

    protected val _workshop1: Workshop = workshop1
    protected val _workshop2: Workshop = workshop2

    abstract fun manufacture(): String

}

class Bike : Vehicle(Produce(), Assemble()) {
    override fun manufacture(): String = "Bike" + _workshop1.work() + _workshop2.work()
}
