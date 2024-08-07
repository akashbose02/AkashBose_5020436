package com.example.library;

public class LibraryManagementTest {
    public static void main(String[] args) {
        LibraryManagement libMgmt = new LibraryManagement(5);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "The Girl in Room 105", "Chetan Bhagat");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");

        // Add books
        libMgmt.addBook(book1);
        libMgmt.addBook(book2);
        libMgmt.addBook(book3);

        // Linear Search
        System.out.println("Linear Search for 'The Girl in Room 105':");
        System.out.println(libMgmt.linearSearchByTitle("The Girl in Room 105"));

        // Sort books and perform Binary Search
        libMgmt.sortBooksByTitle();
        System.out.println("\nBinary Search for 'To Kill a Mockingbird':");
        System.out.println(libMgmt.binarySearchByTitle("To Kill a Mockingbird"));
    }
}
