package com.example.studydesignpattern.book.androiddesingpattren.builder

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityBuilderBinding

class BuilderPatternActivity : BaseActivity<ActivityBuilderBinding>(R.layout.activity_builder) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


class SandwichBuilder {
    fun build(sandwich: Sandwich, ingredient: Ingredient): Sandwich {
        sandwich.addIngredient(ingredient)
        return sandwich
    }
}


class Sandwich {

    private val ingredientList = mutableListOf<Ingredient>()

    private val description = "Description"

    fun addIngredient(ingredient: Ingredient) {
        ingredientList.add(ingredient)
    }

    fun getCalories(): Int =
        ingredientList.map { it.calories() }.sum()


    fun getSandwich(): String {
        return description + ingredientList.joinToString("") { " Add " + it.name() }
    }

}


interface Ingredient {
    fun name(): String
    fun calories(): Int
}

abstract class Bread : Ingredient {

    abstract override fun name(): String
    abstract override fun calories(): Int
}


class Bagel : Bread() {
    override fun name(): String {
        return "Bagel"
    }

    override fun calories(): Int {
        return 200
    }
}

class Bun : Bread() {
    override fun name(): String {
        return "Bun"
    }

    override fun calories(): Int {
        return 250
    }
}

abstract class Filling : Ingredient {
    abstract override fun name(): String
    abstract override fun calories(): Int
}

class CreamCheese : Filling() {
    override fun name(): String {
        return "CreamCheese"
    }

    override fun calories(): Int {
        return 300
    }
}

class SmokedSalmon : Filling() {
    override fun name(): String {
        return "SmokedSalmon"
    }

    override fun calories(): Int {
        return 400
    }
}