package com.example.studydesignpattern.category.iterator

import org.junit.Assert.*
import org.junit.Test

class IteratorPatternTest {


    @Test
    fun `추가한 책들을 Iterator 로 출력하였을때, 잘 출력되는지 확인한다`() {

        val book1: Book = Book("Book1")
        val book2: Book = Book("Book2")
        val book3: Book = Book("Book3")

        val bookShelf = BookShelf(10).apply {
            appendBook(book1)
            appendBook(book2)
            appendBook(book3)
        }

        val bookShelfIterator = bookShelf.createIterator()


        bookShelfIterator.run {
            while (hasNext()) {
                val getBook = next() as Book
                print(getBook.getName())
            }
        }
    }


    @Test
    fun `Raw 코드 - 추가한 책들을 Iterator 로 출력하였을때, 잘 출력되는지 확인한다`() {

        val book1: Book = Book("Book1")
        val book2: Book = Book("Book2")
        val book3: Book = Book("Book3")

        val bookShelf = BookShelf(10).apply {
            appendBook(book1)
            appendBook(book2)
            appendBook(book3)
        }

        bookShelf.getBookArray().forEach { book ->
            book?.let { print(book.getName()) }
        }
    }


}