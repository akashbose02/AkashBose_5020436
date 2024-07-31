package com.example.library;

import java.util.Arrays;

public class LibraryManagement {
    private Book[] books;
    private int size;

    // Constructor to initialize the books array
    public LibraryManagement(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (size == books.length) {
            System.out.println("Book array is full. Cannot add more books.");
            return;
        }
        books[size++] = book;
    }

    // Linear Search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search to find a book by title (requires sorted array)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method to sort books by title (for binary search)
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }
}
