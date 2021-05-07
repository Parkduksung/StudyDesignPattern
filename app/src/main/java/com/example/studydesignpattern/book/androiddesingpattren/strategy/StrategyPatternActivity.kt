package com.example.studydesignpattern.book.androiddesingpattren.strategy

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityStrategyPatternBinding

class StrategyPatternActivity :
    BaseActivity<ActivityStrategyPatternBinding>(R.layout.activity_strategy_pattern) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

interface Drink {
    fun alcohol(): Int
    fun price(): Int
}

class Soju : Drink {
    override fun alcohol(): Int {
        return 18
    }

    override fun price(): Int {
        return 3000
    }
}

class Bear : Drink {
    override fun alcohol(): Int {
        return 5
    }

    override fun price(): Int {
        return 2500
    }
}

class Whiskey : Drink {
    override fun alcohol(): Int {
        return 40
    }

    override fun price(): Int {
        return 30000
    }
}