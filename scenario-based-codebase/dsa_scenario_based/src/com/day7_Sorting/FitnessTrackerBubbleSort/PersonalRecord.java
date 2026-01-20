package com.day7_Sorting.FitnessTrackerBubbleSort;

public class PersonalRecord {
	protected String name;
	private int steps;
	
	PersonalRecord(String name, int steps){
		this.name=name;
		this.steps=steps;
	}
	
	
	
	
	
	
	public int getSteps() {
		return steps;
	}
	
	
	@Override
	public String toString() {
		return String.format("%-18s | %6d steps", name, steps);
	}
	
	
}
