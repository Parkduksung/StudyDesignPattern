package com.example.studydesignpattern.category.singleton

object SingletonObject {

    private var message = ""

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage(): String = message

}