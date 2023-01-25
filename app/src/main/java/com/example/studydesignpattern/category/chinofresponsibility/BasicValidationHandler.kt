package com.example.studydesignpattern.category.chinofresponsibility


data class Request(val email: String, val question: String)

data class Response(val answer: String)


val basicValidation = fun(next: Handler) =
    fun(request: Request): Response {
        if (request.email.isEmpty())
            throw java.lang.IllegalArgumentException()
        return next(request)
    }

val authentication = fun(next: Handler) =
    fun(request: Request): Response {
        if (request.question.isEmpty())
            throw java.lang.IllegalArgumentException()
        return next(request)
    }

val finalResponse = fun() =
    fun(request: Request): Response {
        if (request.question.isEmpty())
            throw java.lang.IllegalArgumentException()
        return Response("finalResponse")
    }


val req = Request(email = "duksung1234@naver.com", "Who broke my build?")

val chain = basicValidation(authentication(finalResponse()))

val res = chain(req)


typealias Handler = (request: Request) -> Response