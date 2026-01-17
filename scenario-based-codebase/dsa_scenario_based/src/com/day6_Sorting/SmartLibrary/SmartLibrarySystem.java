package com.day6_Sorting.SmartLibrary;

import java.util.Scanner;

/*
 *  2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */
public class SmartLibrarySystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Book [] books=new Book[5];
		for(int i=0;i<books.length;i++) {
			System.out.println("Enter the title of book");
			String id=sc.next();
			System.out.println("Enter the time [hh:mm");
			String time=sc.next();
			books[i]=new Book(id,time);
		}
		BookInsertionSort sorter=new BookInsertionSort();
		sorter.sort(books);
		System.out.println("The sorted list by registration time");
		for(int i=0;i<5;i++) {
			books[i].display();
		}
		
	}
}
