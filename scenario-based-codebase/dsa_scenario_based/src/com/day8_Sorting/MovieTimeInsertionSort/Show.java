package com.day8_Sorting.MovieTimeInsertionSort;

public class Show {
	String showName;
	int showTime;
	
	Show(String name, int time){
		this.showName=name;
		this.showTime=time;
	}
	
	void display() {
		System.out.println(" Show Name:"+showName+" | ShowTime[in minutes]:"+ showTime);
	}
}
