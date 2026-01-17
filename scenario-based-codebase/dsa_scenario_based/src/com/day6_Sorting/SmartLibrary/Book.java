package com.day6_Sorting.SmartLibrary;

public class Book {
	String title;
	String borrowDate;
	
	Book(String title, String date){
		this.title=title;
		this.borrowDate=date;
	}
	
	void display() {
		System.out.println("Title:"+title+"| Date:"+ borrowDate);
	}
}
