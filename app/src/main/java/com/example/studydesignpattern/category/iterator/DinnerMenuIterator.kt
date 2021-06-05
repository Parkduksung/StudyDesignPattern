package com.example.studydesignpattern.category.iterator

import kotlin.collections.Iterator

class DinnerMenuIterator(private val dinnerArray: Array<String>) : Iterator<String> {

    private var currentIndex = 0

    override fun hasNext(): Boolean =
        dinnerArray.size > currentIndex


    override fun next(): String =
        dinnerArray[currentIndex++]

}