package org.example.homework.oop.tasks1.book;

public class Book implements Displayable{
    private String name;
    private String author;
    private String yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void display() {
        String bookInfo = String.format("This is the book '%s' by %s, %s edition",
                this.name,
                this.author,
                this.yearOfPublication);
        System.out.println(bookInfo);
    }
}
