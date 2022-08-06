package com.example.studydesignpattern.category.abstractfactory

import org.junit.Assert.assertEquals
import org.junit.Test
import javax.crypto.Mac

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


class SamsungNoteBook(private val component: Component) : Computer() {
    override fun getRAM(): String = component.ram
    override fun getCPU(): String = component.cpu
    override fun getHDD(): String = component.hdd
}

class LGNoteBook(private val component: Component) : Computer() {
    override fun getRAM(): String = component.ram
    override fun getCPU(): String = component.cpu
    override fun getHDD(): String = component.hdd
}

class MacBook(private val component: Component) : Computer() {
    override fun getRAM(): String = component.ram
    override fun getCPU(): String = component.cpu
    override fun getHDD(): String = component.hdd
}

interface ComputerAbstractFactory {
    fun createComputer(): Computer
}

class SamsungFactory(private val component: Component) : ComputerAbstractFactory {
    override fun createComputer(): Computer = SamsungNoteBook(component)
}

class LGFactory(private val component: Component) : ComputerAbstractFactory {
    override fun createComputer(): Computer = LGNoteBook(component)
}

class APPLEFactory(private val component: Component) : ComputerAbstractFactory {
    override fun createComputer(): Computer = MacBook(component)
}


class ComputerFactory {
    companion object {
        fun getComputer(factory: ComputerAbstractFactory): Computer = factory.createComputer()
    }
}