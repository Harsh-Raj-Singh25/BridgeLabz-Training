package com.objectModeling.level1.libraryBooks;

public class Book {
	public String title;
	private String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	void bookDetails() {
		System.out.println("Title:" + title +"Author: "+author);
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
}
