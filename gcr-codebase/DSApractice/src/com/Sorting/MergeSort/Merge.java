package com.Sorting.MergeSort;

public class Merge {
	// Helper function to merge two sorted subarrays
		public static  void merge(double[] prices, int left, int mid, int right) {
			// Sizes of two subarrays to be merged
			int n1 = mid - left + 1;
			int n2 = right - mid;

			// Create temporary arrays
			double[] L = new double[n1];
			double[] R = new double[n2];

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
}
