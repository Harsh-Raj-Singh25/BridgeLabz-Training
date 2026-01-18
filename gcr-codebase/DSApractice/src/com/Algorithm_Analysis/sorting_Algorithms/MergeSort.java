package com.Algorithm_Analysis.sorting_Algorithms;

import com.Sorting.MergeSort.Merge;

public class MergeSort {
	// Helper function to merge two sorted subarrays
	public static void merge(int[] prices, int left, int mid, int right) {
		// Sizes of two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = prices[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = prices[mid + 1 + j];

		// Merge the temp arrays back into the original array
		int i = 0, j = 0;
		int k = left; // Initial index of merged subarray

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				prices[k] = L[i];
				i++;
			} else {
				prices[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			prices[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			prices[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts the array using merge()
	public static void sort(int[] prices, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort first and second halves
			sort(prices, left, mid);
			sort(prices, mid + 1, right);

			// Merge the sorted halves
			merge(prices, left, mid, right);
		}
	}
}
