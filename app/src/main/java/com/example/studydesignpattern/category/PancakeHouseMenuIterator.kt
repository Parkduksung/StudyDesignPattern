package com.example.studydesignpattern.category


class PancakeHouseMenuIterator(private val pancakeHouseArray: Array<String>) : Iterator<String> {


    private var currentPosition = 0
    override fun hasNext(): Boolean =
        pancakeHouseArray.size > currentPosition


    override fun next(): String =
        pancakeHouseArray[currentPosition++]
}
