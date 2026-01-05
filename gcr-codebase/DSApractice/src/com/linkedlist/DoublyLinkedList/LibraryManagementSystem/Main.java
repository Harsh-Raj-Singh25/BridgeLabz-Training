package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryLinkedList myLibrary = new LibraryLinkedList();

        // Adding books to the shelf
        myLibrary.insertAtHead(1001, "Java Programming", "Harsh Singh", "Education");
        myLibrary.insertAtEnd(1002, "Java Fullstack", "Namrata Khapre", "Education");
        myLibrary.insertAtEnd(1003, "Python", "Akshay", "Education");

        // Show total count
        System.out.println("Total books in library: " + myLibrary.getTotalBooks());

        // Update status of a book
        myLibrary.updateStatus(1002, false);

        // Display in both directions
        myLibrary.displayForward();
        myLibrary.displayReverse();

        // Search and Remove
        myLibrary.search("Harsh Singh");
        myLibrary.removeBook(1003);

        System.out.println("Updated Total: " + myLibrary.getTotalBooks());
    }
}
