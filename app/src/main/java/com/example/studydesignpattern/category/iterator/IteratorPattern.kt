package com.example.studydesignpattern.category.iterator


interface Aggregate {
    fun createIterator(): Iterator<*>
}

data class Book(
    val name: String
)

class BookShelf(size: Int) : Aggregate {

    private val books: Array<Book?> = arrayOfNulls(size)

    var containCount = 0
        private set

    fun getBook(index: Int): Book? {
        return books[index]
    }

    fun appendBook(book: Book?): Boolean {
        return if (containCount < books.size) {
            books[containCount] = book
            containCount++
            true
        } else {
            false
        }
    }

    override fun createIterator(): Iterator<*> {
        return BookShelfIterator(this)
    }
}

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.containCount
    }

    override fun next(): Book {
        val book = bookShelf.getBook(index)
        index++
        return book!!
    }


}