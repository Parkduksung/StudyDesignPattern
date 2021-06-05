package com.example.studydesignpattern.category.iterator

class PancakeHouseMenu : Menu {

    private val pancakeMenuArray = arrayOf("pancake1", "pancake2", "pancake3", "pancake4")

    override fun createIterator(): Iterator<String> {

        return PancakeHouseMenuIterator(pancakeMenuArray)
    }
}