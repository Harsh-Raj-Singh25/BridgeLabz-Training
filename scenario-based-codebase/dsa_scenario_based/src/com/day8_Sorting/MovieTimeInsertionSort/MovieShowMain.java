package com.day8_Sorting.MovieTimeInsertionSort;

public class MovieShowMain {
	public static void main(String[] args) {
		Show[] array= {
			new Show("Veer",457),
			new Show("DDLJ",350),
			new Show("YJHD",400),
			new Show("SOTY",389)
		};
		ShowInsertionSort.insertionSort(array);
		System.out.println("============================================");
		System.out.println("             MOVIESHOW                      ");
		System.out.println("The Sorted list of movies according to showtime:");
		System.out.println("-----------------------------------------------");
		for(Show s: array) {
			s.display();
		}
	}
}
