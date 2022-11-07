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
        int event = 0;
        while (event != EXIT) {
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
        }
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
        bookshelf.addBook(newBook);
    }

    private static void deleteBook() {
        System.out.print("Название книги для удаления: ");
        String title = console.nextLine();
        try {
            bookshelf.deleteBook(title);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка удаления. " + e.getMessage());
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги: ");
        String title = console.nextLine();
        Book book = bookshelf.findBook(title);
        System.out.println((book != null) ? book.toString() : ("Книга не найдена"));
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }

    private static void pressEnter() {
        System.out.print("Для продолжения работы нажмите Enter ");
        console.nextLine();
    }

    private static void displayBookshelf() {
        int countBooks = bookshelf.getContBooksOnShelf();

        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            int countFreeShelfs = bookshelf.getFreeShelf();
            int maxLenght = bookshelf.getMaxLength();
            System.out.printf("\nШкаф содержит %d книг. Кол-во свободных полок %d .\n",
                    countBooks, countFreeShelfs);
            Book[] books = bookshelf.getBooks();
            for (int i = 0; i < bookshelf.getContBooksOnShelf(); i++) {
                System.out.printf("|%" + (maxLenght) + "s|%n", books[i]);
                System.out.println("|" + "-".repeat(maxLenght) + '|');
            }
            if (countFreeShelfs != 0) {
                System.out.println("|" + " ".repeat(maxLenght) + "|");
            }
        }
        System.out.println();
    }
}
