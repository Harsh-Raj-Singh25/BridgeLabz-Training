package com.day6_Sorting.ArtExpo;

public class ArtistInsertionSort {
	public void sort(Artist[] array) {
		int n=array.length;
		Artist key;
		int j;
		for(int i=1;i<n;i++) {
			key=array[i];
			j=i-1;
			while (j >= 0 && array[j].time.compareTo(key.time) > 0) {
				array[j+1]=array[j];
				j--;		
			}
			array[j+1]=key;
		}
	}
}
