package com.day7_Sorting.FlashDealzQuickSort;

public class ProductQuickSort {
	public static void quickSort(Product[] array, int low, int high) {
		if(low<high) {
			// Partition the array and get the pivot index
			int pi =partition(array, low, high);
			// Recursively sort elements before and after partition
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
		
	}
	
	public static int partition(Product[] array, int low, int high) {
		// choosing the last element as pivot
		Product pivot=array[high];
		int i=low-1;
		for(int j=low; j< high; j++) {
			if(array[j].discount>=pivot.discount) {
				i++;
				
				// swapping elements at i and j
				Product temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			
		}
		// swapping the pivot and the element at i+1
		Product temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		
		return i+1;
	}
}
