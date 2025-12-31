package com.objectModeling.level1.libraryBooks;

public class LibraryBookMain {
	public static void main(String [] args) {
		// create a library
		Library library=new Library("HRS Library");
		
		// create  books
		Book book1=new Book("CollegeDays","HarshRS");
		Book book2=new Book("Chola Tigers","Amish Tripathi");
		
		// adding books to library
		library.addBook(book2);
		library.addBook(book1);
		
		// showing books in library
		library.displayBooks();
		
	}

}
