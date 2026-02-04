package com.design_patterns.libraryManagementSystem;

import com.design_patterns.libraryManagementSystem.builder.Book;
import com.design_patterns.libraryManagementSystem.factory.User;
import com.design_patterns.libraryManagementSystem.factory.UserFactory;
import com.design_patterns.libraryManagementSystem.singleton.LibraryCatalog;

//import com.design_patterns.libraryManagementSystem.singleton.Librarycatalog;

public class LibraryApp {

	public static void main(String[] args) {

		// SINGLETON
		LibraryCatalog catalog = LibraryCatalog.getInstance();

		// FACTORY
		User student = UserFactory.createUser("student", "Harsh");
		User faculty = UserFactory.createUser("faculty", "Dr. Vishal ");

		// SHOW ROLES
		student.showRole();
		faculty.showRole();

		// OBSERVER REGISTRATION
		catalog.addObserver(student);
		catalog.addObserver(faculty);

		// BUILDER
		Book book = new Book.BookBuilder("Design Patterns").author("GoF").edition("2nd Edition")
				.genre("Software Engineering").build();

		// ADD BOOK → NOTIFY USERS
		catalog.addBook(book);
	} 
}
