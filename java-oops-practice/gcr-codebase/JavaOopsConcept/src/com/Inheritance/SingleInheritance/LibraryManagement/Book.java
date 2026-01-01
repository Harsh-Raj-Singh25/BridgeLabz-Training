package com.Inheritance.SingleInheritance.LibraryManagement;

public class Book {
	String title;
	int publicationYear;
	
	Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayBookBasic() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}
