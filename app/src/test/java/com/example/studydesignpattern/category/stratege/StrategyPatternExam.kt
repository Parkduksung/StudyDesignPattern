package com.example.studydesignpattern.category.stratege

import org.junit.Test

class StrategyPatternExam {

    // 청동오리 - 날수 있다. 우는소리는 Squeak 운다.

    @Test
    fun `청동오리는 날 수 있다`() {

        val bronzeDuck = BronzeDuck()
        bronzeDuck.setFlyBehavior(FlyWithWings())

        assert(bronzeDuck.performFly() == "CanFly")

    }

    @Test
    fun `청동오리의 우는소리는 Squeak 이다`() {

        val bronzeDuck = BronzeDuck()
        bronzeDuck.setQuackBehavior(Squeak())

        assert(bronzeDuck.performQuack() == "Squeak")
    }


    @Test
    fun `청동오리를 display 했을때, 결과값이 CanFly, Squeak 이어야 한다`() {
        val bronzeDuck = BronzeDuck().apply {
            setFlyBehavior(FlyWithWings())
            setQuackBehavior(Squeak())
        }

        assert(bronzeDuck.display() == "CanFly, Squeak")

    }

    @Test
    fun `FlyWithWings 의 fly 값은 CanFly 이어야 한다`() {

        val flyWithWings = FlyWithWings()

        assert(flyWithWings.fly() == "CanFly")

    }

    @Test
    fun `FlyNoWay 의 fly 값은 CanNotFly 이어야 한다`() {

        val flyNoWay = FlyNoWay()

        assert(flyNoWay.fly() == "CanNotFly")

    }

    @Test
    fun `Quack 의 quack 값은 Quack 이어야 한다`() {

        val quack = Quack()

        assert(quack.quack() == "Quack")

    }

    @Test
    fun `Squeak 의 quack 값은 Squeak 이어야 한다`() {
        val squeak = Squeak()

        assert(squeak.quack() == "Squeak")

    }

    @Test
    fun `MuteQuack 의 quack 값은 MuteQuack 이어야 한다`() {
        val muteQuack = MuteQuack()

        assert(muteQuack.quack() == "MuteQuack")

    }


    @Test
    fun `청동오리는 날수있고 우는소리가 Quack 인데 Runtime 시 날수 없고 우는소리가 Squeak 으로 알고리즘이 변경될수 있다` (){

        val bronzeDuck = BronzeDuck().apply {
            setQuackBehavior(Quack())
            setFlyBehavior(FlyWithWings())
        }

        assert(bronzeDuck.display() == "CanFly, Quack")

        with(bronzeDuck){
            setQuackBehavior(Squeak())
            setFlyBehavior(FlyNoWay())
        }
        assert(bronzeDuck.display() == "CanNotFly, Squeak")

    }
}
