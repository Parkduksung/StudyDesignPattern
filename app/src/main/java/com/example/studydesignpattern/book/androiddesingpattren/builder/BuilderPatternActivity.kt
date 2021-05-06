package com.example.studydesignpattern.book.androiddesingpattren.builder

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.book.androiddesingpattren.factory.Bread
import com.example.studydesignpattern.databinding.ActivityBuilderBinding

class BuilderPatternActivity : BaseActivity<ActivityBuilderBinding>(R.layout.activity_builder) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


class Bagel : Bread {
    override fun name(): String {
        return "Bagel"
    }

    override fun calories(): Int {
        return 200
    }
}

class Bun : Bread {
    override fun name(): String {
        return "Bun"
    }

    override fun calories(): Int {
        return 250
    }
}