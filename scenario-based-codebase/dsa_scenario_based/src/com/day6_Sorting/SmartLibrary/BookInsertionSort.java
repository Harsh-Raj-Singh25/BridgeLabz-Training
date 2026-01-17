package com.day6_Sorting.SmartLibrary;

import com.day6_Sorting.ArtExpo.Artist;

public class BookInsertionSort {
	public void sort(Book[] array) {
		int n = array.length;
		Book key;
		int j;
		for (int i = 1; i < n; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && array[j].title.compareTo(key.title) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
}
