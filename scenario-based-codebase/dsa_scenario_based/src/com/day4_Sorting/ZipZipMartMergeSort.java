package com.day4_Sorting;

import java.util.Arrays;

public class ZipZipMartMergeSort {

	// Main function that sorts the array using merge()
	public static void sort(double[] arr, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Divide: Sort first and second halves
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			// Conquer: Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	// Merges two subarrays of arr[]
	private static void merge(double[] arr, int left, int mid, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays
		double[] L = new double[n1];
		double[] R = new double[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		// Merge the temp arrays
		int i = 0, j = 0;
		int k = left; // Initial index of merged subarray

		while (i < n1 && j < n2) {
			// Stability check: if equal, take from Left first to preserve order
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		// Thousands of sales records (simplified here)
		double[] salesTransactions = { 450.50, 120.00, 1200.75, 450.50, 89.99, 500.00 };

		System.out.println("Original Sales Records: " + Arrays.toString(salesTransactions));

		sort(salesTransactions, 0, salesTransactions.length - 1);

		System.out.println("Sorted Sales Report: " + Arrays.toString(salesTransactions));
	}
}
