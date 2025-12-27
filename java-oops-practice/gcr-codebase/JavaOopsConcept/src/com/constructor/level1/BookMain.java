package com.constructor.level1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling default book constructor
		Book book1=new Book();
		System.out.println("book1 details :");
		// calling display function to display details:
		book1.displaydetails();
		
		// Parameterized Constructor
		Book book2=new Book ("Discovery","Nehru",695);
		book2.displaydetails();
		
	}

}
