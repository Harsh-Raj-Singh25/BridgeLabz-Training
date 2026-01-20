package com.day7_Sorting.FlashDealzQuickSort;
/*
 * 4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */
public class Product {
	String name;
	int discount;
	
	Product(String name, int discount){
		this.name=name;
		this.discount=discount;
	}
	void show() {
		System.out.printf("Name:%-10s  | Discount: %-10d  %n",name,discount);
	}
}
