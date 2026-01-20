package com.day8_Sorting.GamerZoneQuickSort;

public class Player {
	String name;
	int score;
	
	Player(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	void display() {
		System.out.printf("Name:%-10s  | Score: %-10d  %n",name,score);
	}
}
