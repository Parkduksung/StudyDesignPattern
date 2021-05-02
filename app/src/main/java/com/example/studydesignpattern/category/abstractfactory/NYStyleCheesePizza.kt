package com.example.studydesignpattern.category.abstractfactory


abstract class Pizza(private val dough: Dough, private val cheese: Cheese) {

    open fun prepare(): String = "${dough.name()}And${cheese.name()}"

}

class NYStyleCheesePizza(ingredientFactory: PizzaIngredientFactory) :
    Pizza(ingredientFactory.createDough(), ingredientFactory.createCheese())
