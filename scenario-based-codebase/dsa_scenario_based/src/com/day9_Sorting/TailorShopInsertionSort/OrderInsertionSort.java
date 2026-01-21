package com.day9_Sorting.TailorShopInsertionSort;

public class OrderInsertionSort {
	public static void insertionSort(Order[] array) {

		int n = array.length;
		Order key;
		int j;

		for (int i = 0; i < n; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && array[j].getDate() > key.getDate()) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}
	}
}
