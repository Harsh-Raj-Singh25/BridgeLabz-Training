package com.day6_Sorting.ArtExpo;

import java.util.Scanner;
/*
 * 9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
 */
public class ArtExpoInsertionSortApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Artist [] artists=new Artist[5];
		for(int i=0;i<artists.length;i++) {
			System.out.println("Enter the id of artist");
			String id=sc.next();
			System.out.println("Enter the time [hh:mm");
			String time=sc.next();
			artists[i]=new Artist(id,time);
		}
		ArtistInsertionSort sorter=new ArtistInsertionSort();
		sorter.sort(artists);
		System.out.println("The sorted list by registration time");
		for(int i=0;i<5;i++) {
			artists[i].display();
		}
		
	}
}
