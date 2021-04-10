package com.example.studydesignpattern.practice

import android.util.Log
import java.lang.Exception


interface Item {
    fun operation()
}

abstract class ItemMaker : Item {

    private lateinit var item: Item

    override fun operation() {

        if (!::item.isInitialized) {
            item = factoryMethod()
        }

        item.operation()
    }

    protected abstract fun factoryMethod(): Item
}

class ItemFactory(private val type: String) : ItemMaker() {

    override fun factoryMethod(): Item {
        when (type) {
            "itemA" -> {
                return ItemA()
            }
            else -> {
                throw Exception()
            }
        }
    }
}

class ItemA : Item {
    override fun operation() {
        Log.d("결과", "operationItemA")
    }
}
