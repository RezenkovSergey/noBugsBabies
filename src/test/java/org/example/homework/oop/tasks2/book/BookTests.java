package org.example.homework.oop.tasks2.book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BookTests {

    @Test
    public void creationBookTest(){
        String bookTitle = "Book Title";
        String bookAuthor = "Book Author";

        Book book = new Book();
        book.setTitle(bookTitle);
        book.setAuthor(bookAuthor);

        Assertions.assertEquals(bookTitle, book.getTitle());
        Assertions.assertEquals(bookAuthor, book.getAuthor());
    }
}
