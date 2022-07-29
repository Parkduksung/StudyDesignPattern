package com.example.studydesignpattern.category.memento

class MementoPattern {

}


data class Memento(val state: String)

class Originator(var state: String) {

    fun createMemento(): Memento {
        return Memento(state)
    }

    fun restore(memento: Memento) {
        state = memento.state
    }
}


class CareTaker {

    private val mementoList = ArrayList<Memento>()

    fun saveState(state: Memento) {
        mementoList.add(state)
    }

    fun restore(index: Int): Memento {
        return mementoList[index]
    }

}

data class LogMemento(val log: String)

class User(var log: String) {

    fun createLogMemento(): LogMemento = LogMemento(log)

    fun restore(logMemento: LogMemento) {
        log = logMemento.log
    }
}

class LogCollect {

    private val logMementoList = ArrayList<LogMemento>()

    fun saveLog(logMemento: LogMemento) {
        logMementoList.add(logMemento)
    }

    fun restore(index: Int): LogMemento {
        return logMementoList[index]
    }

}