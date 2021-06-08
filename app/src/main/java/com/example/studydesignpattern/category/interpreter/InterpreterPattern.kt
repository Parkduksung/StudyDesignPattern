package com.example.studydesignpattern.category.interpreter

class InterpreterPattern {
}


interface Expression {
    fun interpreter(con: String): Boolean
}


class TerminalExpression(private val data: String) : Expression {
    override fun interpreter(con: String): Boolean {
        return con.contains(data)
    }
}

class OrExpression(private val expr1: Expression, private val expr2: Expression) : Expression {

    override fun interpreter(con: String): Boolean {
        return expr1.interpreter(con) || expr2.interpreter(con)
    }
}

class AndExpression(private val expr1: Expression, private val expr2: Expression) : Expression {

    override fun interpreter(con: String): Boolean {
        return expr1.interpreter(con) && expr2.interpreter(con)
    }
}