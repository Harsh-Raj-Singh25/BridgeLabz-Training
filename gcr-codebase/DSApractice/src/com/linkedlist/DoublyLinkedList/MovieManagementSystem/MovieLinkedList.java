package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieLinkedList {
	MovieNode head;
	MovieNode tail;

	// Add a movie record at the beginning, end, or at a specific position.
	.void insertAtHead(String movie, String director, String year, double rating) {
		MovieNode newNode = new MovieNode(movie, director, year, rating);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println("The movie added at beginning");
	}

	void insertAtEnd(String movie, String director, String year, double rating) {
		MovieNode newNode = new MovieNode(movie, director, year, rating);
		if (head == null) {
			head  = tail = newNode;
			return;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}	
		System.out.println("The movie added at End");
	}

	// Remove a movie record by Movie Title.
	void deleteByTitle(String title) {
		if (head == null) {
			return;
		}
		// if item to be deleted is head
		if (head.movieTitle.equalsIgnoreCase(title)) {
			head = head.next;
			System.out.println("Movie title :" + title + " Deleted");
			return;
		}
		MovieNode temp = head;
		while (temp.next != null && !temp.next.movieTitle.equalsIgnoreCase(title)) {
			temp = temp.next;
		}
		if (temp.next != null) {
			temp.next = temp.next.next;
			temp.next.prev=temp;
			System.out.println("Movie title:" + title + " deleted");
		} else {
			System.out.println("Movie not found");
		}
	}
	// Search for a movie record by Director or Rating.
	void searchMovie(String Director) {
		MovieNode temp=head;
		while(temp.next!=null) {
			if(temp.next.director.equalsIgnoreCase(Director)) {
				System.out.println("Found movie  :"+ temp.next.movieTitle+ "\nBy :"+Director );
				return;
			}
			temp=temp.next;
		}
		System.out.println("Movie not found");
		
	}
	// Display all movie records in both forward and reverse order.
	// forward
	void displayForward() {
		MovieNode temp=head;
		System.out.println("Forward List:");
		while(temp!=null) {
			System.out.println("Movie : "+temp.movieTitle+" ||Directed by: "+temp.director+"||Year of release :"+temp.year+"|| Rating:"+temp.rating);
			temp=temp.next;
		}
	}
	// Backward
//	void displayBackward() {
//		if(head==null) {
//			return;
//		}
//		MovieNode temp=head;
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		System.out.println(" BAckward List: ");
//		while(temp!=null) {
//			System.out.println("Movie : "+temp.movieTitle+" ||Directed by: "+temp.director+"||Year of release :"+temp.year+"|| Rating:"+temp.rating);
//			temp=temp.prev;
//		}
//	}
	void displayBackward() {
		MovieNode temp=tail;
		if( temp == null) System.out.println("tail is null");
		while(temp!=null) {
			System.out.println("Movie : "+temp.movieTitle+" ||Directed by: "+temp.director+"||Year of release :"+temp.year+"|| Rating:"+temp.rating);
			temp=temp.prev;
		}
	}
	
	
	
	// Update a movie's Rating based on the Movie Title.
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated " + title + " rating to " + newRating);
                return;
            }
            temp = temp.next;
        }
    }

}
