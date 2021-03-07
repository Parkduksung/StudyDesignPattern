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

class FlyWithWings : FlyBehavior {
    override fun fly() {
        TODO("Not yet implemented")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        TODO("Not yet implemented")
    }
}


interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        TODO("Not yet implemented")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        TODO("Not yet implemented")
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        TODO("Not yet implemented")
    }
}

abstract class Duck : FlyBehavior, QuackBehavior {

    fun display() {

    }

    fun swim() {

    }

    fun performQuack() {

    }

    fun performFly() {

    }

    fun setFlyBehavior() {

    }

    fun setQuackBehavior() {

    }

}


class BlueDuck : Duck() {

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }

}

class RedDuck : Duck() {

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

class ToyRubberDuck : Duck() {

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

class ToyWoodDuck : Duck() {

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun quack() {
        TODO("Not yet implemented")
    }
}

