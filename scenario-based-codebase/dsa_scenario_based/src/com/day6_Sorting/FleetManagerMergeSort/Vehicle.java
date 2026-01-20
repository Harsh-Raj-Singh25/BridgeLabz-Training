package com.day6_Sorting.FleetManagerMergeSort;

public class Vehicle {
	String name;
	double mileage;
	
	Vehicle(String name, double mileage){
		this.name=name;
		this.mileage=mileage;
	}
	
	void display() {
		System.out.println("VName:"+ name+" | Mileage:"+mileage);
	}
}
