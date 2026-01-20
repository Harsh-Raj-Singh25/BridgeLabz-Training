package com.day7_Sorting.EduResultsMergeSort;

import java.util.Arrays;

import com.day6_Sorting.FleetManagerMergeSort.Vehicle;

public class ScoreMergeSort {
	static void mergeSort(Student[] array) {
		if (array.length <= 1) {
            return;
        }
		// divide the array into two parts
		int mid=array.length/2;
		Student [] left=Arrays.copyOfRange(array, 0, mid);
		Student [] right=Arrays.copyOfRange(array, mid, array.length);
		
		// recursively sort the left and right halves:
		mergeSort(left);
		mergeSort(right);
		
		// merge the two sorted halves
		merge(array, left, right);
		
		
		
	}
	
	static void merge(Student[] array,Student[] left, Student[] right) {
		int i=0 , j=0, k=0;
		
		// merge the two sorted arrays
		while(i<left.length && j<right.length) {
			if(left[i].Score > right[j].Score) {
				array[k]=left[i];
				i++;
			}else {
				array[k]=right[j];
				j++;
			}
			k++;
		}
		
		// if there are any remaining elements in right half .. copy them directly
		while(j<right.length) {
			array[k]=right[j];
			j++;
			k++;
		}
		// similarly if the same case occurs with left side array
		
		while(i<left.length) {
			array[k]=left[i];
			i++;
			k++;
		}
		
		
		
	}
}
