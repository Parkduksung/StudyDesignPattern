package com.example.studydesignpattern.mediator

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class MediatorPatternTest : BaseTest() {


    @Test
    fun `ChatUserA 의 send("Hello") 값은 "ChatUserA, Sending Message= Hello" 이어야 한다`() {

        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")

        chatUserA.send("Hello")

        assertEquals("ChatUserA, Sending Message= Hello\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ChatUserB 의 send("Hello") 값은 "ChatUserB, Sending Message= Hello" 이어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserB = ChatUser(chatMediator, "ChatUserB")

        chatUserB.send("Hello")

        assertEquals("ChatUserB, Sending Message= Hello\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ChatUserC 의 send("Hello") 값은 "ChatUserC, Sending Message= Hello" 이어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatUserC.send("Hello")

        assertEquals("ChatUserC, Sending Message= Hello\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ChatUserA 의 receive("Hello") 값은 "ChatUserA, Message received= Hello" 이어야 한다`() {

        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")

        chatUserA.receive("Hello")

        assertEquals("ChatUserA, Message Receive= Hello\n", outputStreamCaptor.toString())

    }


    @Test
    fun `ChatUserB 의 receive("Hello") 값은 "ChatUserA, Message received= Hello" 이어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserB = ChatUser(chatMediator, "ChatUserB")

        chatUserB.receive("Hello")

        assertEquals("ChatUserB, Message Receive= Hello\n", outputStreamCaptor.toString())

    }

    @Test
    fun `ChatUserC 의 receive("Hello") 값은 "ChatUserA, Message received= Hello" 이어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatUserC.receive("Hello")

        assertEquals("ChatUserC, Message Receive= Hello\n", outputStreamCaptor.toString())
    }


    @Test
    fun `ChatMediator 에 addUser 에 ChatUserA , ChatUserB을 등록후 sendMessage(msg, ChatUserB) 일때 "ChatUserA, Message Receive= Hi" 가 호출되어야 한다`() {


        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")
        val chatUserB = ChatUser(chatMediator, "ChatUserB")

        chatMediator.addUser(chatUserA)
        chatMediator.addUser(chatUserB)

        chatMediator.sendMessage("Hi", chatUserB)

        assertEquals("ChatUserA, Message Receive= Hi\n", outputStreamCaptor.toString())

    }

    @Test
    fun `ChatMediator 에 addUser 에 ChatUserA , ChatUserB, ChatUserC 을 등록후 sendMessage(msg, ChatUserB) 일때 "ChatUserA, Message Receive= Hi" 와 줄바꿈되어 "ChatUserC, Message Receive= Hi" 가 호출되어야 한다`() {

        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")
        val chatUserB = ChatUser(chatMediator, "ChatUserB")
        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatMediator.addUser(chatUserA)
        chatMediator.addUser(chatUserB)
        chatMediator.addUser(chatUserC)

        chatMediator.sendMessage("Hi", chatUserB)

        assertEquals(
            "ChatUserA, Message Receive= Hi\nChatUserC, Message Receive= Hi\n",
            outputStreamCaptor.toString()
        )
    }


    @Test
    fun `ChatMediator 에 addUser 에 ChatUserA , ChatUserB, ChatUserC 을 등록후 chatUserB 가 send("Hi")  호출할 때, "ChatUserB, Sending Message= Hi" 줄바꿈 "ChatUserA, Message Receive= Hi" 와 줄바꿈 "ChatUserC, Message Receive= Hi" 가 호출되어야 한다`() {

        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")
        val chatUserB = ChatUser(chatMediator, "ChatUserB")
        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatMediator.addUser(chatUserA)
        chatMediator.addUser(chatUserB)
        chatMediator.addUser(chatUserC)

        chatUserB.send("Hi")


        assertEquals(
            "ChatUserB, Sending Message= Hi\nChatUserA, Message Receive= Hi\nChatUserC, Message Receive= Hi\n",
            outputStreamCaptor.toString()
        )
    }

    @Test
    fun `ChatMediator 에 addUser 에 ChatUserA , ChatUserB, ChatUserC 을 등록후 chatUserA 가 send("Hi")  호출할 때, "ChatUserA, Sending Message= Hi" 줄바꿈 "ChatUserB, Message Receive= Hi" 와 줄바꿈 "ChatUserC, Message Receive= Hi" 가 호출되어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")
        val chatUserB = ChatUser(chatMediator, "ChatUserB")
        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatMediator.addUser(chatUserA)
        chatMediator.addUser(chatUserB)
        chatMediator.addUser(chatUserC)

        chatUserA.send("Hi")


        assertEquals(
            "ChatUserA, Sending Message= Hi\nChatUserB, Message Receive= Hi\nChatUserC, Message Receive= Hi\n",
            outputStreamCaptor.toString()
        )

    }


    //해도되고 안해도 되고.
    @Test
    fun `ChatMediator 에 addUser 에 ChatUserA , ChatUserB, ChatUserC 을 등록후 chatUserA 의 name 을 chatUserD로 바꾸고 send("Hi")  호출할 때, "ChatUserD, Sending Message= Hi" 줄바꿈 "ChatUserB, Message Receive= Hi" 와 줄바꿈 "ChatUserC, Message Receive= Hi" 가 호출되어야 한다`() {
        val chatMediator = ChatMediator()

        val chatUserA = ChatUser(chatMediator, "ChatUserA")
        val chatUserB = ChatUser(chatMediator, "ChatUserB")
        val chatUserC = ChatUser(chatMediator, "ChatUserC")

        chatMediator.addUser(chatUserA)
        chatMediator.addUser(chatUserB)
        chatMediator.addUser(chatUserC)

        chatUserA.name = "ChatUserD"

        chatUserA.send("Hi")


        assertEquals(
            "ChatUserD, Sending Message= Hi\nChatUserB, Message Receive= Hi\nChatUserC, Message Receive= Hi\n",
            outputStreamCaptor.toString()
        )

    }

}

class ChatUser(private val mediator: ChatMediator, var name: String) {

    fun send(msg: String) {
        println("$name, Sending Message= $msg")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("$name, Message Receive= $msg")
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