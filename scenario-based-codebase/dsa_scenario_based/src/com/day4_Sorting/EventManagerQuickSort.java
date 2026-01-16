package com.day4_Sorting;

import java.util.Arrays;

public class EventManagerQuickSort {
	// Standard Quick Sort Implementation
	public static void quickSort(double[] tickets, int low, int high) {
		if (low < high) {
			// Partition the array and get the pivot index
			int pi = partition(tickets, low, high);

			// Recursively sort elements before and after partition
			quickSort(tickets, low, pi - 1);
			quickSort(tickets, pi + 1, high);
		}
	}

	private static int partition(double[] tickets, int low, int high) {
		// Choosing the last element as pivot
		double pivot = tickets[high];
		int i = (low - 1); // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (tickets[j] <= pivot) {
				i++;
				// Swap tickets[i] and tickets[j]
				double temp = tickets[i];
				tickets[i] = tickets[j];
				tickets[j] = temp;
			}
		}

		// Swap the pivot element to its correct position
		double temp = tickets[i + 1];
		tickets[i + 1] = tickets[high];
		tickets[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		double[] ticketPrices = { 1200.50, 450.00, 890.00, 150.75, 3200.00, 110.00 };

		System.out.println("Unsorted Tickets: " + Arrays.toString(ticketPrices));

		quickSort(ticketPrices, 0, ticketPrices.length - 1);

		System.out.println("Sorted Tickets (Cheapest First): " + Arrays.toString(ticketPrices));
	}
}
