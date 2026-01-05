package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieNode {
	String movieTitle;
	String director;
	String year;
	double rating;
	
	// pointer to next and prev movie.
	MovieNode next;
	MovieNode prev;
	
	// constructor
	MovieNode(String title, String director, String year, double rating){
		this.movieTitle=title;
		this.director=director;
		this.year=year;
		this.rating=rating;
		this.next=null;
		this.prev=null;
	}
}
