package com.Algorithm_Analysis.sorting_Algorithms;

import java.util.Arrays;

public class Comparison {
	public static void main(String[] args) {
		int n= 10_000;
		int [] data=new int [n];
		for(int i=0;i<n;i++) {
			data[i]=i;
		}
		
		// Bubble Sort
		int [] bubbleArray=Arrays.copyOf(data, n);
		long bubbleStart=System.nanoTime();
		BubbleSort.sort(bubbleArray);
		long bubbleEnd=System.nanoTime();
		
		// Merge Sort
		int [] mergeArray=Arrays.copyOf(data, n);
		long mergeStart=System.nanoTime();
		MergeSort.sort(mergeArray, 0, n-1);
		long mergeEnd=System.nanoTime();
		
		// Quick Sort
		int quickArray[]= Arrays.copyOf(data, n);
		long quickStart=System.nanoTime();
		QuickSort.quickSort(quickArray, 0, n-1);
		long quickEnd=System.nanoTime();
		
		// Displaying the results for comparison
		System.out.println(" The time taken by Each Sorting Algo is:");
		System.out.println(" Time by Bubble Sort= "+ (bubbleEnd-bubbleStart)+" ns");
		System.out.println("Time by Merge Sort= "+ (mergeEnd-mergeStart)+ " ns");
		System.out.println("Time by Quick Sort= "+ (quickEnd-quickStart)+ " ns");
		
	}
}
