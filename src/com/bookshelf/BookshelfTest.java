package com.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int ADD_BOOK = 1;
    private static final int DELETE_BOOK = 2;
    private static final int FIND_BOOK = 3;
    private static final int CLEAR_BOOKSHELF = 4;
    private static final int EXIT = 5;
    private static Bookshelf bookshelf;
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        bookshelf = new Bookshelf();
        int event;
        do {
            displayBookshelf();
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Найти книгу");
            System.out.println("4. Очистить шкаф");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            event = console.nextInt();
            try {
                executeEvent(event);
            } catch (IllegalStateException error) {
                System.out.println(error.getMessage());
            }
        } while (event != EXIT);
    }

    private static void displayBookshelf() {
        int countBooks = bookshelf.getCountBooksOnShelf();

        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            int countFreeShelves = bookshelf.getFreeShelves();
            int maxLength = bookshelf.getMaxLength();
            System.out.printf("\nШкаф содержит %d книг. Кол-во свободных полок %d .\n",
                    countBooks, countFreeShelves);
            Book[] books = bookshelf.getBooks();
            for (int i = 0; i < countBooks; i++) {
                System.out.printf("|%" + (maxLength) + "s|%n", books[i]);
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            if (countFreeShelves != 0) {
                System.out.println("|" + " ".repeat(maxLength) + "|");
            }
        }
        System.out.println();
    }

    private static void executeEvent(int event) {
        console.nextLine();
        switch (event) {
            case ADD_BOOK:
                addBook();
                return;
            case DELETE_BOOK:
                deleteBook();
                return;
            case FIND_BOOK:
                findBook();
                return;
            case CLEAR_BOOKSHELF:
                clearBookshelf();
                return;
            case EXIT:
                return;
            default:
                throw new IllegalStateException("Указан неправильный номер функции");
        }
    }

    private static void addBook() {
        if (bookshelf.isFull()) {
            System.out.println("Шкаф заполнен.Невозможно добавить книгу");
            return;
        }
        System.out.print("Автор книги: ");
        String author = console.nextLine();
        System.out.print("Название книги: ");
        String name = console.nextLine();
        System.out.print("Год выпуска: ");
        int year = console.nextInt();
        Book newBook = new Book(author, name, year);
        bookshelf.add(newBook);
    }

    private static void deleteBook() {
        System.out.print("Название книги для удаления: ");
        String title = console.nextLine();
        try {
            bookshelf.delete(title);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка удаления. " + e.getMessage());
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги: ");
        String title = console.nextLine();
        Book book = bookshelf.find(title);
        System.out.println((book != null) ? book : ("Книга не найдена"));
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }
}
