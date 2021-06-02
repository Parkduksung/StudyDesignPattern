package com.example.studydesignpattern.category.iterator

class IteratorPattern {

}


interface Aggregate {
    fun createIterator(): Iterator<*>
}

class Book(private val name: String) {
    fun getName(): String = name
}


class BookShelf(size: Int) : Aggregate {
    private val books: Array<Book?> = arrayOfNulls(size)
    var length = 0
        private set

    fun getBook(index: Int): Book? {
        return books[index]
    }

    fun appendBook(book: Book?) {
        if (length < books.size) {
            books[length] = book
            length++
        } else {
            println("책꽂이가 꽉 찼습니다!")
        }
    }

    override fun createIterator(): Iterator<*> {
        return BookShelfIterator(this)
    }

    fun getBookArray() : Array<Book?> =
        books

}

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.length
    }

    override fun next(): Book {
        val book = bookShelf.getBook(index)
        index++
        return book!!
    }
}