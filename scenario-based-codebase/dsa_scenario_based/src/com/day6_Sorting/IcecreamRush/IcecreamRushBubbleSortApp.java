package com.day6_Sorting.IcecreamRush;

import java.util.Scanner;

/*
 *  1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons
 */
public class IcecreamRushBubbleSortApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Welcome to IceCreamRush Sorter App");
		Flavor[] flavors = new Flavor[3]; // initializing an flavor array of size 8 i.e. the number of flavors available

		for (int i = 0; i < 3; i++) {
			System.out.println(" Enter the name of IceCream");
			String name = sc.next();
			System.out.println(" Enter how many times it was sold ");
			int number = sc.nextInt();
			flavors[i] = new Flavor(name, number);
		}

		System.out.println(" The sorted list of flavors according to the quantity sold is :");
		FlavorBubbleSort.sort(flavors);
		for (int i = 0; i < flavors.length; i++) {
			flavors[i].display();
		}

	}
}
