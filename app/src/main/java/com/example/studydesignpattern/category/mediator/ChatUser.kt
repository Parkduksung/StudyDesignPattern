package com.example.studydesignpattern.category.mediator

class ChatUser(private val mediator: ChatMediator, val name: String) {
    fun send(msg: String) {
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String): String {
        return "$name: Message received: $msg"
    }
}

class ChatMediator {

    private val users: MutableList<ChatUser> = ArrayList()

    fun sendMessage(msg: String, user: ChatUser) {
        users
            .filter { it != user }
            .forEach {
                it.receive(msg)
            }
    }

    fun addUser(user: ChatUser): ChatMediator =
        apply { users.add(user) }

}