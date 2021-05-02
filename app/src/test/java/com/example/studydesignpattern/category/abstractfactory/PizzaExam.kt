package com.example.studydesignpattern.category.abstractfactory

import org.junit.Test

class PizzaExam {


    @Test
    fun `ThickCrushDough 의 name 은 ThickCrushDough 이어야 한다`() {

        val thickCrushDough = ThickCrushDough()

        assert(thickCrushDough.name() == "ThickCrushDough")
    }

    @Test
    fun `ThinCrushDough 의 name 은 ThinCrushDough 이어야 한다`() {

        val thinCrushDough = ThinCrushDough()

        assert(thinCrushDough.name() == "ThinCrushDough")
    }


    @Test
    fun `MozzarellaCheese 의 이름은 MozzarellaCheese 이어야 한다`() {

        val mozzarellaCheese = MozzarellaCheese()

        assert(mozzarellaCheese.name() == "MozzarellaCheese")
    }


    @Test
    fun `RicottaCheese 의 이름은 RicottaCheese 이어야 한다`() {

        val ricottaCheese = RicottaCheese()

        assert(ricottaCheese.name() == "RicottaCheese")
    }

    @Test
    fun `NYPizzaIngredientFactory create 값은 ThickCrushDoughAndMozzarellaCheese 이어야 한다`() {

        val nyPizzaIngredientFactory = NYPizzaIngredientFactory()


        assert(nyPizzaIngredientFactory.create() == "ThickCrushDoughAndMozzarellaCheese")

    }

    @Test
    fun `ChicagoPizzaIngredientFactory create 값은 ThinCrushDoughAndRicottaCheese 이어야 한다`() {
        val chicagoPizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        assert(chicagoPizzaIngredientFactory.create() == "ThinCrushDoughAndRicottaCheese")
    }

    @Test
    fun `NYStyleCheesePizza prepare 값은 ThickCrushDoughAndMozzarellaCheese 이어야 한다`() {

        val nyStyleCheesePizza = NYStyleCheesePizza(NYPizzaIngredientFactory())

        assert(nyStyleCheesePizza.prepare() == "ThickCrushDoughAndMozzarellaCheese")

    }

}