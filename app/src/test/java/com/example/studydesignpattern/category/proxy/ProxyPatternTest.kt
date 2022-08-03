package com.example.studydesignpattern.category.proxy

import org.junit.Assert.assertEquals
import org.junit.Test

class ProxyPatternTest {

    @Test
    fun `NormalFile 의 read(TextFile) 의 값은 "Reading file TextFile" 이어야 한다`() {
        val normalFile = NormalFile()
        assertEquals(normalFile.read("TextFile"), "Reading file TextFile")
    }

    @Test
    fun `SecuredFile 의 password 를 입력하지 않을 경우 read("TextFile") 의 값이 "Incorrect password, Access Denied!" 이어야 한다`() {

        val securedFile = SecuredFile()
        assertEquals(securedFile.read("TextFile"), "Incorrect password, Access Denied!")
    }

    @Test
    fun `SecuredFile 의 password 가 secret 일 경우 read("TextFile") 의 값이 "Reading file TextFile" 이어야 한다`() {

        val securedFile = SecuredFile()
        securedFile.password = "secret"

        assertEquals(securedFile.read("TextFile"), "Reading file TextFile")
    }

    @Test
    fun `SecuredFile 의 password 가 secret 가 아닐 경우 read("TextFile") 의 값이 "Incorrect password, Access Denied!" 이어야 한다`() {

        val securedFile = SecuredFile()
        securedFile.password = "secret1"

        assertEquals(securedFile.read("TextFile"), "Incorrect password, Access Denied!")
    }

}


interface File {
    fun read(name: String): String
}

class NormalFile : File {
    override fun read(name: String) = "Reading file $name"
}

class SecuredFile : File {
    val normalFIle = NormalFile()
    var password = ""

    override fun read(name: String): String {
        return if (password == "secret") {
            println("Password is correct : $password")
            normalFIle.read(name)
        } else {
            "Incorrect password, Access Denied!"
        }
    }
}