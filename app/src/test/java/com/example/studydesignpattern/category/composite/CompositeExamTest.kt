package com.example.studydesignpattern.category.composite

import org.junit.Test
import org.testng.Assert.assertEquals

class CompositeExamTest {


    @Test
    fun `BergerMenu 의 print 값은 ChamBerger,VegetarianBerger,BeafBerger 이어야 한다`() {


        val bergerMenu = BergerMenu()

        bergerMenu.apply {
            add(ChamBerger())
            add(VegetarianBerger())
            add(BeafBerger())
        }

        print(bergerMenu.print())

        assertEquals(bergerMenu.print() , "BergerMenu : ChamBerger,VegetarianBerger,BeafBerger")

    }

    @Test
    fun `ChamBerger 의 print 값은 ChamBerger 이어야 한다`(){

        val chamBerger = ChamBerger()

        assert(chamBerger.print() == "ChamBerger")
    }

    @Test
    fun `VegetarianBerger 의 print 값은 VegetarianBerger 이어야 한다`(){

        val vegetarianBerger = VegetarianBerger()

        assert(vegetarianBerger.print() == "VegetarianBerger")
    }

    @Test
    fun `BeafBerger 의 print 값은 BeafBerger 이어야 한다`(){

        val beafBerger = BeafBerger()

        assert(beafBerger.print() == "BeafBerger")

    }

    @Test
    fun `MainMenu 에 BergerMenu 와 Noodle 이 있을때, print 값은 BergerMenu,Noodle 이어야 한다`(){

        val mainMenu = MainMenu().apply{
            add(BergerMenu())
            add(Noodle())
        }

        assertEquals(mainMenu.print() , "MainMenu : BergerMenu,Noodle")

    }

    @Test
    fun `MainMenu 에 BergerMenu 와 Noodle 이 있 BergerMenu 에 BeafBerger 가 있을때고, print 값은 BergerMenu  BeafBerger,Noodle 이어야 한다`(){

        val mainMenu = MainMenu().apply{
            add(
                BergerMenu().apply {
                    add(BeafBerger())
                }
            )
            add(Noodle())
        }

        assertEquals(mainMenu.print() , "MainMenu : BergerMenu : BeafBerger,Noodle")

    }


}