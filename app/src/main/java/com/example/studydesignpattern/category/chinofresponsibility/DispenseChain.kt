package com.example.studydesignpattern.category.chinofresponsibility

interface DispenseChain {
    fun setNextChain(nextChain: DispenseChain)
    fun dispense(currency: Currency): String
}

class Currency(val amount: Int)

class Won100Dispense : DispenseChain {

    private lateinit var nextChain: DispenseChain

    override fun setNextChain(nextChain: DispenseChain) {
        this.nextChain = nextChain
    }

    override fun dispense(currency: Currency): String {
        return if (currency.amount >= 100) {
            val divideNum = currency.amount / 100
            val remainNum = currency.amount % 100
            if (remainNum != 0) {
                "100원 동전 갯수 - $divideNum " + this.nextChain.dispense(
                    Currency(
                        remainNum
                    )
                )
            } else {
                "100원 동전 갯수 - $divideNum "
            }
        } else {
            this.nextChain.dispense(currency)
        }
    }
}

class Won10Dispense : DispenseChain {

    private lateinit var nextChain: DispenseChain

    override fun setNextChain(nextChain: DispenseChain) {
        this.nextChain = nextChain
    }

    override fun dispense(currency: Currency): String {
        return if (currency.amount >= 10) {
            val divideNum = currency.amount / 10

            val remainNum = currency.amount % 10

            if (remainNum != 0) {
                "10원 동전 갯수 - $divideNum " + this.nextChain.dispense(
                    Currency(
                        remainNum
                    )
                )
            } else {
                "10원 동전 갯수 - $divideNum "
            }
        } else {
            this.nextChain.dispense(currency)
        }
    }
}

class Won1Dispense : DispenseChain {

    private lateinit var nextChain: DispenseChain

    override fun setNextChain(nextChain: DispenseChain) {
        this.nextChain = nextChain
    }

    override fun dispense(currency: Currency): String {

        return if (currency.amount != 0) {
            val divideNum = currency.amount / 1
            "1원 동전 갯수 - $divideNum "
        } else {
            ""
        }
    }
}