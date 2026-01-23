package com.day1.bookShelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LibraryOrganizer {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		BookLinkedList History=new BookLinkedList();
		History.addFirst("The rise of India");
		History.addFirst("The Chola Tigers");
		History.addFirst("Rajputs & the Medieval India");
		
		BookLinkedList Romance=new BookLinkedList();
		Romance.addFirst("50 shades");
		Romance.addFirst("When she was 10");
		Romance.addFirst("When life gives you tangerins");
		
		BookLinkedList Politics = new BookLinkedList();
		Politics.addFirst("Communism");
		Politics.addFirst("MotherLand");
		Politics.addFirst("Mein Camf");
		
		HashMap <String,BookLinkedList> bookShelf=new HashMap<>();
		
		bookShelf.put("history", History);
		bookShelf.put("politics", Politics);
		bookShelf.put("romance", Romance);
		
		boolean Working=true;
		while(Working) {
			System.out.println("=================================");
			System.out.println("!!BookShelf – Library Organizer!!");
			System.out.println("=================================");
			System.out.println(" Enter the Genre : ");
			System.out.println("1. History | 2.Romance | 3.Politics");
			// using hashmap displaying the books genre by genre
			String rawInput=sc.nextLine();
			String searchGenre=rawInput.toLowerCase().trim();
			
			System.out.println("Choose the operation: ");
			System.out.println("1. Borrow \n 2.Return");
			int choice=sc.nextInt();
			sc.nextLine();			
			
			if(choice==1) {
				if(bookShelf.containsKey(searchGenre )) {
					System.out.println("Displaying the books of Genre:"+ searchGenre);
					//System.out.print(i++);
					bookShelf.get(searchGenre).displayBooks();
					System.out.println("Enter the name");
					String book=sc.nextLine().trim();
					bookShelf.get(searchGenre).removeByName(book);
					System.out.println("The book was borrowed successfully");
					System.out.println("Process Executed ");	
				}else {
					System.out.println("Genre not found");
				}
					
			}else if(choice==2) {
				System.out.println("Enter the name of book");
				String book1=sc.nextLine().trim();
				bookShelf.get(searchGenre).addFirst(book1);
				System.out.println("The book was returned successfully....");
				
			}else {
				System.err.println("Invalid entry");
				Working=false;
			}
			
		}
		
	}
}
