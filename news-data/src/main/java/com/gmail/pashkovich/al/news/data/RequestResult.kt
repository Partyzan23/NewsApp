package com.gmail.pashkovich.al.news.data

sealed class RequestResult<E>(protected val data : E?) {

    class InProgress<E>(data: E?) : RequestResult<E>(data)

    class Success<E>(data: E?) : RequestResult<E>(data)

    class Error<E> (data: E?): RequestResult<E>(data)
}