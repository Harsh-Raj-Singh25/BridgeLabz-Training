package com.day8_Sorting.GamerZoneQuickSort;

import com.day7_Sorting.FlashDealzQuickSort.Product;

public class PlayerQuickSort {
	public static void quickSort(Player[] array, int low, int high) {
		if(low<high) {
			// Partition the array and get the pivot index
			int pi =partition(array, low, high);
			// Recursively sort elements before and after partition
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
		
	}
	
	public static int partition(Player[] array, int low, int high) {
		// choosing the last element as pivot
		Player pivot=array[high];
		int i=low-1;
		for(int j=low; j< high; j++) {
			if(array[j].score>=pivot.score) {
				i++;
				
				// swapping elements at i and j
				Player temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			
		}
		// swapping the pivot and the element at i+1
		Player temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		
		return i+1;
	}
}
