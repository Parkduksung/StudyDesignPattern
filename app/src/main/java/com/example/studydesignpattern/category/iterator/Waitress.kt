package com.example.studydesignpattern.category.iterator

import android.annotation.SuppressLint


class Waitress(private val menu: Menu) {

    @SuppressLint("NewApi")
    fun printMenu(): String {

        val menuIterator = menu.createIterator()

        var result = ""

        while (menuIterator.hasNext()) {
            result += menuIterator.next() + ","
        }

        return result.substring(0, result.length-1)
    }

}
