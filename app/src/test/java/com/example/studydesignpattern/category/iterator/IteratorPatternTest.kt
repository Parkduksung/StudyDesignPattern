package com.example.studydesignpattern.category.iterator

import org.junit.Assert.assertEquals
import org.junit.Test

class IteratorPatternTest {


    @Test
    fun `Book("Book1") 의 name 값은 "Book1" 이어야 한다"`() {
        val book = Book("Book1")
        assertEquals(book.name, "Book1")
    }

    @Test
    fun `Book("Book2") 의 name 값은 "Book2" 이어야 한다"`() {
        val book = Book("Book2")
        assertEquals(book.name, "Book2")
    }

    @Test
    fun `Book("Book3") 의 name 값은 "Book3" 이어야 한다"`() {
        val book = Book("Book3")
        assertEquals(book.name, "Book3")
    }

    @Test
    fun `BookShelf(0) 의 containCount 는 0 이어야 한다`() {

        val bookShelf = BookShelf(0)
        assertEquals(bookShelf.containCount, 0)

    }

    @Test
    fun `BookShelf(0) 의 appendBook(Book("Book1")) 의 값은 false 이어야 한다`() {
        val bookShelf = BookShelf(0)
        assertEquals(bookShelf.appendBook(Book("Book1")), false)
    }

    @Test
    fun `BookShelf(1) 의 appendBook(Book("Book1")) 의 값은 true 이어야 하고 containCount 의 값은 1 이어야  한다`() {
        val bookShelf = BookShelf(1)
        assertEquals(bookShelf.appendBook(Book("Book1")), true)
        assertEquals(bookShelf.containCount, 1)

    }

    @Test
    fun `BookShelf(1) 의 appendBook(Book("Book1")) 하고난 뒤  appendBook(Book("Book2")) 의 값은 false 이어야 하고 containCount 의 값은 1 이어야  한다`() {
        val bookShelf = BookShelf(1)
        bookShelf.appendBook(Book("Book1"))
        assertEquals(bookShelf.appendBook(Book("Book2")), false)
        assertEquals(bookShelf.containCount, 1)
    }

    @Test
    fun `BookShelf(3) 에 appendBook(Book("Book1")) appendBook(Book("Book2")) appendBook(Book("Book3")) 를 집어넣고 BookShelfIterator(BookShelf(3)) 생성하여 createIterator() 를 이용하여 구현해 보시오`(){

        val book1 = Book("Book1")
        val book2 = Book("Book2")
        val book3 = Book("Book3")

        val bookShelf = BookShelf(3).apply {
            appendBook(book1)
            appendBook(book2)
            appendBook(book3)
        }

        val bookShelfIterator = bookShelf.createIterator()


        bookShelfIterator.run {
            while (hasNext()) {
                val getBook = next() as Book
                print(getBook.name)
            }
        }
    }

}