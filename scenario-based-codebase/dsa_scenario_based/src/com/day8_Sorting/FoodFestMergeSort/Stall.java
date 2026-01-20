package com.day8_Sorting.FoodFestMergeSort;

public class Stall {
	protected String stallName;
	private int footfall;
	
	Stall(String name, int number){
		this.stallName=name;
		this.footfall=number;
	}
	
	@Override
	public String toString() {
		return String.format(" %-18s | %-6d",stallName, footfall);
	}

	public int getFootfall() {
		return footfall;
	}
	void display() {
		System.out.println("Stall Name:"+stallName+" | FootFall:"+ getFootfall());
	}
	
}
