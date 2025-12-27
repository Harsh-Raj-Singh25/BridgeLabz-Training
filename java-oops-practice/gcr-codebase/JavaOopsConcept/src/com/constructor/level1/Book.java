package com.constructor.level1;

public class Book {
	String title;
	String author;
	int price;
	
	// default constructor:
	Book(){
		title="Chola Tigers";
		author="Amish";
		price=560;
	}
	
	// Parameterized Constructor
	Book(String title, String author, int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void displaydetails() {
		System.out.println("Book title : "+ title);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+ price);
	}
	
}
