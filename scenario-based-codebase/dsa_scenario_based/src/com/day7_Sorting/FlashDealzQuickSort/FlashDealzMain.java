package com.day7_Sorting.FlashDealzQuickSort;

public class FlashDealzMain {
	public static void main(String[] args) {
		Product[] array= {
				new Product("Apple",15),
				new Product("Juice",20),
				new Product("Pulses",12),
				new Product("Garments",25),
				new Product("Carpet",8)
		};
		
		System.out.println("==========================");
		System.out.println(" WELCOME TO FLASH-DEALZ");
		System.out.println("==========================");
		ProductQuickSort.quickSort(array, 0, array.length-1);
		System.out.println(" The list of most discounted products:");
		for(Product p: array) {
			p.show();
		}
	}
}
