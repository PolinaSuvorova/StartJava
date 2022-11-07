package com.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final int SIZE_BOOKSHELF = 10;
    private int contBooksOnShelf;
    private int maxLength;
    private Book[] books = new Book[SIZE_BOOKSHELF];

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getContBooksOnShelf() {
        return contBooksOnShelf;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getFreeShelf() {
        return SIZE_BOOKSHELF - contBooksOnShelf;
    }

    public void addBook(Book book) {
        books[contBooksOnShelf] = book;
        contBooksOnShelf++;
        calculateMaxLength();

    }

    public int findPositionBook(String title) {
        for (int i = 0; i < contBooksOnShelf; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public Book findBook(String title) {
        int positionBook = findPositionBook(title);
        if (positionBook >= 0) {
            return books[positionBook];
        }
        return null;
    }

    public void deleteBook(String title) {
        int index = findPositionBook(title);
        if (index < 0) {
            throw new IllegalStateException("Книга не найдена");
        }
        for (int i = index + 1; i < contBooksOnShelf; i++) {
            books[i - 1] = books[i];
        }
        books[contBooksOnShelf - 1] = null;
        contBooksOnShelf--;
        calculateMaxLength();
    }

    public void clear() {
        Arrays.fill(books, 0, contBooksOnShelf, 0);
        contBooksOnShelf = 0;
    }

    public void calculateMaxLength() {
        maxLength = 0;
        for (int i = 0; i < contBooksOnShelf; i++) {
            int lenghtString = books[i].toString().length();
            if (lenghtString > maxLength) {
                maxLength = lenghtString;
            }
        }
    }

    public boolean isFull() {
        if (contBooksOnShelf == SIZE_BOOKSHELF) {
            return true;
        }
        return false;
    }
}
