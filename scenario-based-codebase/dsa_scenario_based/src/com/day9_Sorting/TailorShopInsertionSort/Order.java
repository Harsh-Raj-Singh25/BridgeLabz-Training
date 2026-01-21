package com.day9_Sorting.TailorShopInsertionSort;
/*
 * 9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting

 */
public class Order {
	String OName;
	private int deliverydate;
	
	Order(String name, int date){
		this.deliverydate=date;
		this.OName=name;
		
	}
	
	public int getDate() {
		return deliverydate;
	}
	
	public void display() {
		System.out.printf(" %2s   | before %-5d%n",OName, deliverydate);
	}
	
}
