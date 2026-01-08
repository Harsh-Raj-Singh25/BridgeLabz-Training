package com.Sorting.MergeSort;
import java.util.Arrays;

public class BookPricesSorting {
	
	public static void main(String[] args) {
		double[] bookPrices = { 599.50, 250.00, 999.00, 150.75, 450.00, 320.25 };

		System.out.println("Original Prices: " + Arrays.toString(bookPrices));
		Sort.sort(bookPrices, 0, bookPrices.length - 1);
		System.out.println("Sorted Prices:   " + Arrays.toString(bookPrices));
	}
}
