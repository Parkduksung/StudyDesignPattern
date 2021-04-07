package com.example.studydesignpattern.category.factorymethod

import android.util.Log
import kotlin.Exception

class FactoryMethodPattern

interface Product {
    fun operation()
}

abstract class Creator {

    private lateinit var product: Product

    fun operation() {

        if (!::product.isInitialized) {
            product = factoryMethod()
        }
        product.operation()
    }

    protected abstract fun factoryMethod(): Product
}

class CreatorFactory(private val type: String) : Creator() {
    override fun factoryMethod(): Product =
        when (type) {
            "product1" -> {
                Product1()
            }
            else -> {
                throw Exception()
            }
        }
}

class Product1 : Product {
    override fun operation() {
        Log.d("결과", "CreateProduct1")
        print("CreateProduct1")
    }
}

