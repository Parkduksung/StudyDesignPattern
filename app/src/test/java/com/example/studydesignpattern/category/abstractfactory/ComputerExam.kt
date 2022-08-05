package com.example.studydesignpattern.category.abstractfactory

class ComputerExam {


}

abstract class Computer {
    abstract fun getRAM(): String
    abstract fun getCPU(): String
    abstract fun getHDD(): String
}


data class Component(
    val ram: String,
    val cpu: String,
    val hdd: String
)


class PC(private val component: Component) : Computer() {
    override fun getRAM(): String = component.ram
    override fun getCPU(): String = component.cpu
    override fun getHDD(): String = component.hdd
}

class Server(private val component: Component) : Computer() {
    override fun getRAM(): String = component.ram
    override fun getCPU(): String = component.cpu
    override fun getHDD(): String = component.hdd
}

interface ComputerAbstractFactory {
    fun createComputer(): Computer
}

class PCFactory(private val component: Component) : ComputerAbstractFactory {
    override fun createComputer(): Computer = PC(component)
}

class ServerFactory(private val component: Component) : ComputerAbstractFactory {
    override fun createComputer(): Computer = Server(component)
}

class ComputerFactory {
    companion object {
        fun getComputer(factory: ComputerAbstractFactory): Computer = factory.createComputer()
    }
}