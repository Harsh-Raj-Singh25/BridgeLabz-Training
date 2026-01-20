package com.day8_Sorting.MovieTimeInsertionSort;

public class ShowInsertionSort {
	public static void insertionSort(Show [] array) {
		int n=array.length;
		Show key;
		int j;
		for(int i=1;i<n;i++) {
			key=array[i];
			j=i-1;
			while(j>=0 && array[j].showTime >key.showTime) {
				array[j+1]=array[j];
				j--;
						
			}
			array[j+1]=key;
		}
		
	}
}
