package com.objectModeling.level1.libraryBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Library {
	private List<Book> booksList;
	public String libraryName;
	
	Library(String libraryName){
		this.booksList=new ArrayList<>();
		this.libraryName=libraryName;
	}
	
	public void addBook(Book book) {
	    booksList.add(book);
		System.out.println("Book "+ book.getTitle()+"has been added to "+libraryName);
	}
	
	public void displayBooks() {
		System.out.println("The books present in "+libraryName+":");
		for(Book book:booksList) {
			//System.out.println("Book name:"+book.getTitle()+ "Book author:"+ book.getAuthor());
			book.bookDetails();
		}
	}
	
	
	
	
}
