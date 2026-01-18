package com.Algorithm_Analysis.sorting_Algorithms;

public class QuickSort {
	// Main QuickSort function
	public static void quickSort(int[] prices, int low, int high) {
		if (low < high) {
			// partitionIndex is the index where the pivot now sits
			int partitionIndex = partition(prices, low, high);

			// Recursively sort elements before and after partition
			quickSort(prices, low, partitionIndex - 1);
			quickSort(prices, partitionIndex + 1, high);
		}
	}

	// This function takes the last element as pivot and places
	// it at its correct position in the sorted array
	private static int partition(int[] prices, int low, int high) {
		double pivot = prices[high];
		int i = (low - 1); // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (prices[j] <= pivot) {
				i++;

				// Swap prices[i] and prices[j]
				int temp = prices[i];
				prices[i] = prices[j];
				prices[j] = temp;
			}
		}

		// Swap the pivot element with the element at i+1
		int temp = prices[i + 1];
		prices[i + 1] = prices[high];
		prices[high] = temp;

		return i + 1;
	}
}
