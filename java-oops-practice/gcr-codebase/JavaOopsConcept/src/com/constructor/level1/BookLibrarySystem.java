package com.constructor.level1;

public class BookLibrarySystem {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get author name
    public String getAuthor() {
        return author;
    }

    // Subclass EBook
    public static class EBook extends BookLibrarySystem {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        // Method to display EBook details
        public void displayEBookDetails() {
            System.out.println("EBook ISBN: " + ISBN); // public member
            System.out.println("EBook Title: " + title); // protected member
            // System.out.println("EBook Author: " + author); // Cannot access private member directly
            System.out.println("EBook Author: " + getAuthor()); // private member via public method
        }
    }

    public static void main(String[] args) {
        BookLibrarySystem book = new BookLibrarySystem("89896-55811", "Java Programming", "John Doe");
        System.out.println("Book Author: " + book.getAuthor());

        EBook ebook = new EBook("89896-55811", "Advanced Java", "Jane Smith");
        ebook.displayEBookDetails();
    }
}
