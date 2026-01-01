package com.Inheritance.SingleInheritance.LibraryManagement;

public class Author extends Book{
	String name;
	String bio;
	// constructor
	Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); 
        this.name = authorName;
        this.bio = bio;
    }
	
	void displayInfo() {
		System.out.println("The author name is:"+name+"\nHis bio is :"+bio);
		System.out.println("His book is: "+title+"\nPublication year : "+ publicationYear );
	}
}
