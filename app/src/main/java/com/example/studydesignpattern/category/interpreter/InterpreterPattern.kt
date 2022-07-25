package com.example.studydesignpattern.category.interpreter


interface Expression {
    fun interpreter(con: String): Boolean
}


class TerminalExpression(private val data: String) : Expression {
    override fun interpreter(con: String): Boolean {
        return con.contains(data)
    }
}

class OrExpression(private vararg val expr1: Expression) : Expression {

    override fun interpreter(con: String): Boolean {
        return expr1.any { it.interpreter(con) }
    }
}

class AndExpression(private vararg val expr: Expression) : Expression {

    override fun interpreter(con: String): Boolean {
        return expr.all { it.interpreter(con) }
    }
}