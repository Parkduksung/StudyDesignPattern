package com.example.studydesignpattern.category.state


interface State {
    fun onButtonPushed(): String
    fun offButtonPushed(): String
}

class LightOn : State {

    override fun onButtonPushed(): String =
        "stateNotChanged"

    override fun offButtonPushed(): String =
        "stateChangedOff"
}

class LightOff : State {

    override fun onButtonPushed(): String =
        "stateChangedOn"

    override fun offButtonPushed(): String =
        "stateNotChanged"
}


class Client {

    private lateinit var state: State

    fun setState(state: State) {
        this.state = state
    }

    fun onButtonPushed(): String =
        state.onButtonPushed()

    fun offButtonPushed(): String =
        state.offButtonPushed()

}