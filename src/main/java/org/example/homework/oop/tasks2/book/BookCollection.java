package org.example.homework.oop.tasks2.book;

import java.util.HashSet;

public class BookCollection {
    private final HashSet<Book> books = new HashSet<>();

    public boolean hasBook(Book book) {
        return books.contains(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public HashSet<Book> getBooks() {
        return books;
    }

}
