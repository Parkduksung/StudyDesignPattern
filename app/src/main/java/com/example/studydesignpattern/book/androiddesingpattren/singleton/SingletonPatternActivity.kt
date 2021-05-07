package com.example.studydesignpattern.book.androiddesingpattren.singleton

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivitySingletonBinding

class SingletonPatternActivity :
    BaseActivity<ActivitySingletonBinding>(R.layout.activity_singleton) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


object SingletonPerson {

    private var name = "Parkduksung"

    fun getName(): String = name

    fun setName(name: String) {
        this.name = name
    }
}