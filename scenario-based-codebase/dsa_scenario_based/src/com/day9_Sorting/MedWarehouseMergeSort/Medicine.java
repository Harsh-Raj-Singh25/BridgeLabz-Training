package com.day9_Sorting.MedWarehouseMergeSort;

/*
 * 10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory
 */
public class Medicine {
	String name;
	private int expiryDate;

	Medicine(String name, int date) {
		this.expiryDate = date;
		this.name = name;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return name + " (Expires: " + expiryDate + ")";
	}

}
