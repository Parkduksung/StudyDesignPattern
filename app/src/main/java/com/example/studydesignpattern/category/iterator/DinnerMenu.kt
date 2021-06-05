package com.example.studydesignpattern.category.iterator

import kotlin.collections.Iterator


interface Menu {
    fun createIterator(): Iterator<String>
}

class DinnerMenu : Menu {

    private val dinnerMenuArray = arrayOf("Diner1", "Diner2")
    override fun createIterator(): Iterator<String> {
        return DinnerMenuIterator(dinnerMenuArray)
    }
}
