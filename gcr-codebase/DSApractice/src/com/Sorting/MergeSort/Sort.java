package com.Sorting.MergeSort;

public class Sort {
	// Main function that sorts the array using merge()
	public static void sort(double[] prices, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort first and second halves
			sort(prices, left, mid);
			sort(prices, mid + 1, right);

			// Merge the sorted halves
			Merge.merge(prices, left, mid, right);
		}
	}
}
