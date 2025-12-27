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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
