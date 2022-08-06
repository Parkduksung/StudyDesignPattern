package com.example.studydesignpattern.category.abstractfactory

import org.junit.Assert.assertEquals
import org.junit.Test
import javax.crypto.Mac

class ComputerExam {


    @Test
    fun `SamsungNoteBook(Component("ram1","cpu1","hdd1")) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram1" , "cpu1" , "hdd1" 이어야 한다`() {

        val samsungNoteBook = SamsungNoteBook(Component("ram1", "cpu1", "hdd1"))

        assertEquals(samsungNoteBook.getRAM(), "ram1")
        assertEquals(samsungNoteBook.getCPU(), "cpu1")
        assertEquals(samsungNoteBook.getHDD(), "hdd1")

    }

    @Test
    fun `LGNoteBook(Component("ram2","cpu2","hdd2")) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram2" , "cpu2" , "hdd2" 이어야 한다`() {

        val lgNoteBook = LGNoteBook(Component("ram2", "cpu2", "hdd2"))

        assertEquals(lgNoteBook.getRAM(), "ram2")
        assertEquals(lgNoteBook.getCPU(), "cpu2")
        assertEquals(lgNoteBook.getHDD(), "hdd2")

    }


    @Test
    fun `MacBook(Component("ram3","cpu3","hdd3")) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram3" , "cpu3" , "hdd3" 이어야 한다`() {

        val macBook = MacBook(Component("ram3", "cpu3", "hdd3"))

        assertEquals(macBook.getRAM(), "ram3")
        assertEquals(macBook.getCPU(), "cpu3")
        assertEquals(macBook.getHDD(), "hdd3")

    }

    @Test
    fun `SamsungFactory(Component("ram1","cpu1","hdd1")) createComputer 의 getRAM() , getCPU(), getHDD() 의 값은 "ram1" , "cpu1" , "hdd1" 이어야 한다`() {

        val samsungFactory = SamsungFactory(Component("ram1", "cpu1", "hdd1"))

        assertEquals(samsungFactory.createComputer().getRAM(), "ram1")
        assertEquals(samsungFactory.createComputer().getCPU(), "cpu1")
        assertEquals(samsungFactory.createComputer().getHDD(), "hdd1")
    }

    @Test
    fun `LGFactory(Component("ram2","cpu2","hdd2")) createComputer 의 getRAM() , getCPU(), getHDD() 의 값은 "ram2" , "cpu2" , "hdd2" 이어야 한다`() {

        val lgFactory = LGFactory(Component("ram2", "cpu2", "hdd2"))

        assertEquals(lgFactory.createComputer().getRAM(), "ram2")
        assertEquals(lgFactory.createComputer().getCPU(), "cpu2")
        assertEquals(lgFactory.createComputer().getHDD(), "hdd2")
    }

    @Test
    fun `APPLEFactory(Component("ram3","cpu3","hdd3")) createComputer 의 getRAM() , getCPU(), getHDD() 의 값은 "ram3" , "cpu3" , "hdd3" 이어야 한다`() {

        val appleFactory = APPLEFactory(Component("ram3", "cpu3", "hdd3"))

        assertEquals(appleFactory.createComputer().getRAM(), "ram3")
        assertEquals(appleFactory.createComputer().getCPU(), "cpu3")
        assertEquals(appleFactory.createComputer().getHDD(), "hdd3")
    }


    @Test
    fun `ComputerFactory 의 getComputer(SamsungFactory(Component("ram1", "cpu1", "hdd1"))) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram1" , "cpu1" , "hdd1" 이어야 한다`() {

        val computerFactory = ComputerFactory.getComputer(SamsungFactory(Component("ram1", "cpu1", "hdd1")))
        assertEquals(computerFactory.getRAM(), "ram1")
        assertEquals(computerFactory.getCPU(), "cpu1")
        assertEquals(computerFactory.getHDD(), "hdd1")

    }

    @Test
    fun `ComputerFactory 의 getComputer(LGFactory(Component("ram2","cpu2","hdd2"))) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram2" , "cpu2" , "hdd2" 이어야 한다`() {

        val computerFactory = ComputerFactory.getComputer(LGFactory(Component("ram2", "cpu2", "hdd2")))
        assertEquals(computerFactory.getRAM(), "ram2")
        assertEquals(computerFactory.getCPU(), "cpu2")
        assertEquals(computerFactory.getHDD(), "hdd2")

    }

    @Test
    fun `ComputerFactory 의 getComputer(APPLEFactory(Component("ram3", "cpu3", "hdd3"))) 의 getRAM() , getCPU(), getHDD() 의 값은 "ram3" , "cpu3" , "hdd3" 이어야 한다`() {

        val computerFactory = ComputerFactory.getComputer(APPLEFactory(Component("ram3", "cpu3", "hdd3")))
        assertEquals(computerFactory.getRAM(), "ram3")
        assertEquals(computerFactory.getCPU(), "cpu3")
        assertEquals(computerFactory.getHDD(), "hdd3")


    }

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