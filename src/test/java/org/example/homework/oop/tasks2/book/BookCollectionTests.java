package org.example.homework.oop.tasks2.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class BookCollectionTests {
    private final Book firstBook = new Book();
    private final Book secondBook = new Book();

    @BeforeEach
    public void setUp() {
        firstBook.setTitle("First Book Title");
        firstBook.setAuthor("First Book Author");

        secondBook.setTitle("Second Book Title");
        secondBook.setAuthor("Second Book Author");
    }

    @Test
    public void additionBookTest() {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(firstBook);
        HashSet<Book> books = bookCollection.getBooks();

        Assertions.assertTrue(books.contains(firstBook));
    }

    @Test
    public void hasBookTest() {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(firstBook);

        Assertions.assertTrue(bookCollection.hasBook(firstBook));
    }

    @Test
    public void hasNotBookTest() {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(firstBook);

        Assertions.assertFalse(bookCollection.hasBook(secondBook));
    }

    @Test
    public void removingBookTest() {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(firstBook);
        bookCollection.removeBook(firstBook);

        Assertions.assertFalse(bookCollection.hasBook(firstBook));
    }
}
