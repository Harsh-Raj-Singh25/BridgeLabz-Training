package com.day7_Sorting.EduResultsMergeSort;

public class Student {
	String name;
	int Score;

	Student(String name, int score) {
		this.name = name;
		this.Score = score;

	}
	
	void display() {
		System.out.printf("Name: %-10s Score: %-10d %n",name,Score);
	}
}
