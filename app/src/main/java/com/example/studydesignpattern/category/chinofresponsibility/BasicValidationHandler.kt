package com.example.studydesignpattern.category.chinofresponsibility


interface Handler {
    fun handle(request: Request): Response
}

data class Request(val email: String, val question: String)

data class Response(val answer: String)

class BasicValidationHandler(private val next: Handler) : Handler {
    override fun handle(request: Request): Response {
        if (request.email.isEmpty() || request.question.isEmpty())
            throw java.lang.IllegalArgumentException()

        return next.handle(request)
    }
}


class KnownEmailHandler(private val next: Handler) : Handler {
    override fun handle(request: Request): Response {
        return next.handle(request)
    }
}

class JuniorDeveloperFilterHandler(private val next: Handler) : Handler {
    override fun handle(request: Request): Response {
        return next.handle(request)
    }
}

class AnswerHandler : Handler {
    override fun handle(request: Request): Response {
        return Response("")
    }
}


val req = Request(email = "duksung1234@naver.com", "Who broke my build?")

val chain = BasicValidationHandler(KnownEmailHandler(JuniorDeveloperFilterHandler(AnswerHandler())))

val res = chain.handle(req)

