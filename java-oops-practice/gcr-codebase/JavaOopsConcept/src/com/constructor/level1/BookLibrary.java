package com.constructor.level1;

public class BookLibrary {
	String title;
	String author;
    double price;
    boolean isAvailable;

    // Parameterized constructor
    public BookLibrary(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // By default, the book is available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned: " + title);
    }

    // Method to display book details
    public void displayDetails() {
    	 System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("Price: ₹ " + price);
         System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}
