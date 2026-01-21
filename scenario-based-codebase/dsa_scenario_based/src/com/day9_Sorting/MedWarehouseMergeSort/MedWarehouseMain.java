package com.day9_Sorting.MedWarehouseMergeSort;

public class MedWarehouseMain {
	public static void main(String[] args) {
		Medicine[] warehouseStock = { new Medicine("Paracetamol", 20261231), 
				new Medicine("Amoxicillin", 20250520),
				new Medicine("Aspirin", 20260115), 
				new Medicine("Insulin", 20250210) // Nearing expiration
		};

		System.out.println("---  Receiving Mixed Branch Stocks ---");
		MedWarehouseSort.mergeSort(warehouseStock, 0, warehouseStock.length - 1);

		System.out.println("\n---  Master Expiry Schedule (Earliest First) ---");
		for (Medicine m : warehouseStock) {
			System.out.println(m);
		}
	}
}
