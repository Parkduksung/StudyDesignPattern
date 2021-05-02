package com.example.studydesignpattern.category.abstractfactory


interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createCheese(): Cheese
    fun create(): String = "${createDough().name()}And${createCheese().name()}"
}

class NYPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough {
        return ThickCrushDough()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }
}

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough {
        return ThinCrushDough()
    }

    override fun createCheese(): Cheese {
        return RicottaCheese()
    }
}
