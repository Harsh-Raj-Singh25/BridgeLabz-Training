package com.day8_Sorting.FoodFestMergeSort;

import java.util.Arrays;
// another version of merge sort
public class FootFallMergeSort {
	public static void mergeSort(Stall[] arr,int low, int high) {
		
		// dividing the array into two part
		if(low<high) {
		int mid = low+ (high-low) / 2;

		

		mergeSort(arr, low,mid);
		mergeSort(arr, mid+1,high);

		merge(arr, low,mid, high);
		}
	}

	public static void merge(Stall[] array, int low, int mid, int high) {
		
		int n1 = mid-low+1;
		int n2 = high-mid;
		
//		Stall[] left = Arrays.copyOfRange(array, 0, n1);
//		Stall[] right = Arrays.copyOfRange(array, mid+1, n2);
		Stall [] left=new Stall[n1];
		Stall [] right=new Stall[n2];
		
		System.arraycopy(array, low, left, 0, n1);
		System.arraycopy(array, mid + 1, right, 0, n2);

		
		int i = 0, j = 0, k = low;


		// merge two sorted arrays
		while (i < n1 && j < n2) {
			if (left[i].getFootfall() <= right[j].getFootfall()) {
				array[k++] = left[i];
				i++;
			} else {
				array[k++] = right[j];
				j++;
			}
		}
		// if there are any remaining elements in right half .. copy them directly
		while (j < right.length) {
			array[k] = right[j];
			j++;
			k++;
		}
		// similarly if the same case occurs with left side array

		while (i < left.length) {
			array[k] = left[i];
			i++;
			k++;
		}
	}
}
