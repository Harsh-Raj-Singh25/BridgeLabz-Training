package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

class BookNode {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    // next and prev 
    BookNode next;
    BookNode prev;
    // constructor
    public BookNode(int id, String title, String author, String genre) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true; // Default status
        this.next = null;
        this.prev = null;
    }
}
