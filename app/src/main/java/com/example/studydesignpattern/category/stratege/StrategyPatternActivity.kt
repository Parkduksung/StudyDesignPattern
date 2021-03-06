package com.example.studydesignpattern.category.stratege

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityStrategyBinding

class StrategyPatternActivity : BaseActivity<ActivityStrategyBinding>(R.layout.activity_strategy) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

interface FlyBehavior {
    fun fly()
}

interface QuackBehavior {
    fun quack()
}

abstract class Duck : FlyBehavior, QuackBehavior {

    abstract fun display()
}


class BlueDuck : Duck(){
    override fun display() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }

}

class RedDuck : Duck(){
    override fun display() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

class ToyRubberDuck : Duck(){
    override fun display() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

class ToyWoodDuck : Duck(){
    override fun display() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

