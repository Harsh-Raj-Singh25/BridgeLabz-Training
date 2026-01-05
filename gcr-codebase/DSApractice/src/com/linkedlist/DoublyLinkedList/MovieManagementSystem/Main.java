package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class Main {
	public static void main(String [] args) {
		MovieLinkedList movieList=new MovieLinkedList();
		
		// adding elements
		movieList.insertAtHead("Dhurandhar", "Aditya", "2025", 5.0);
		movieList.insertAtEnd("PK", "Hirani", "2016",3.8);
		movieList.insertAtEnd("Bahubali-1", "SS","2015",4.8);
		movieList.insertAtEnd("Bhediya", "Amar", "2022", 4.0);
		// display forward
		movieList.displayForward();
		
		//updateRating
		movieList.updateRating("Bhediya", 3.8);
		//searchMovie
		movieList.searchMovie("SS");
		//deleteByTitle
		movieList.deleteByTitle("PK");
		
		// display backward
		movieList.displayBackward();
	}
}
