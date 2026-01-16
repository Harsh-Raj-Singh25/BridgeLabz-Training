package com.day4_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title

 */
import java.util.Arrays;
import java.util.Scanner;

public class SmartShelfInsertionSort {
	// Logic: Sorts an array of Strings alphabetically
	static void insertionSort(String[] array, int n) {
		for (int i = 1; i < n; i++) {
			String key = array[i]; // The "new book" we are inserting
			int j = i - 1;

			/*
			 * Move books that are alphabetically 'greater' than the key one position ahead.
			 * compareTo() returns > 0 if array[j] comes AFTER key
			 */
			while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key; // Place the book in its sorted spot
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] shelf = new String[5];

		System.out.println("--- SmartShelf: Add 5 Books ---");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter book title " + (i + 1) + ": ");
			shelf[i] = sc.nextLine();

			// In a real "Online" system, we would sort after EVERY entry
			// For this exercise, we sort the final list
		}

		insertionSort(shelf, shelf.length);

		System.out.println("\n Alphabetical Reading List:");
		System.out.println(Arrays.toString(shelf));
	}
}