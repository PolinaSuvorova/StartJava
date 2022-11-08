package com.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublishing;

    public Book(String author, String title, int yearPublishing) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' + ", title='" + title + '\'' +
                ", yearPublishing=" + yearPublishing;
    }
}

