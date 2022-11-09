package com.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final int BOOKSHELF_LIMIT = 10;
    private int countBooksOnShelf;
    private int maxLength;
    private Book[] books = new Book[BOOKSHELF_LIMIT];

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooksOnShelf);
    }

    public int getCountBooksOnShelf() {
        return countBooksOnShelf;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getFreeShelves() {
        return BOOKSHELF_LIMIT - countBooksOnShelf;
    }

    public void add(Book book) {
        books[countBooksOnShelf] = book;
        countBooksOnShelf++;
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
        int length = books[index].toString().length();
        countBooksOnShelf--;
        System.arraycopy(books, index + 1, books, index, countBooksOnShelf - index);
        if (length == maxLength) {
            calculateMaxLength();
        }
    }

    public void clear() {
        Arrays.fill(books, 0, countBooksOnShelf, 0);
        countBooksOnShelf = 0;
    }

    public boolean isFull() {
        return countBooksOnShelf == BOOKSHELF_LIMIT;
    }

    private void calculateMaxLength() {
        maxLength = 0;
        for (int i = 0; i < countBooksOnShelf; i++) {
            int lenghtString = books[i].toString().length();
            if (lenghtString > maxLength) {
                maxLength = lenghtString;
            }
        }
    }

    private int findPosition(String title) {
        for (int i = 0; i < countBooksOnShelf; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
