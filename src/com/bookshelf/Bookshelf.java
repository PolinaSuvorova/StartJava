package com.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final int BOOKSHELF_LIMIT = 10;
    private int contBooksOnShelf;
    private int maxLength;
    private Book[] books = new Book[BOOKSHELF_LIMIT];

    public Book[] getBooks() {
        return Arrays.copyOf(books, contBooksOnShelf);
    }

    public int getContBooksOnShelf() {
        return contBooksOnShelf;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getFreeShelves() {
        return BOOKSHELF_LIMIT - contBooksOnShelf;
    }

    public void add(Book book) {
        books[contBooksOnShelf] = book;
        contBooksOnShelf++;
        calculateMaxLength();
    }

    public Book find(String title) {
        int positionBook = findPosition(title);
        if (positionBook >= 0) {
            return books[positionBook];
        }
        return null;
    }

    public void delete(String title) {
        int index = findPosition(title);
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

    private void calculateMaxLength() {
        maxLength = 0;
        for (int i = 0; i < contBooksOnShelf; i++) {
            int lenghtString = books[i].toString().length();
            if (lenghtString > maxLength) {
                maxLength = lenghtString;
            }
        }
    }

    public boolean isFull() {
        return (contBooksOnShelf == BOOKSHELF_LIMIT ? true : false);
    }

    private int findPosition(String title) {
        for (int i = 0; i < contBooksOnShelf; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
