package com.day9_Sorting.TailorShopInsertionSort;

import java.util.Scanner;

public class TailorShopMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Order [] orders= {
				new Order("Shirt1   ",15),
				new Order("PantBlack",18),
				new Order("ShirtBlue", 12),
				new Order("PantBrown",17),
				new Order("Kurta    ",16)
		};
		
		System.out.println("================================");
		System.out.println("     WELCOME TO Tailor Shop     ");
		System.out.println("--------------------------------");
		System.out.println("List of Orders by delivery Date:");
		System.out.println("--------------------------------");
		System.out.println("    Name     |  Date to deliver ");
		System.out.println("--------------------------------");
		OrderInsertionSort.insertionSort(orders);
		for(Order o:orders) {
			o.display();
		}
		
		
		
	}
}
