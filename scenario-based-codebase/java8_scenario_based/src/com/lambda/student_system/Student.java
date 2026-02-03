package com.lambda.student_system;

public class Student {
	String name;
	int age;
	int marks;
	int rank;

	public Student(String name, int age, int marks, int rank) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + ", marks=" + marks + ", rank=" + rank + "}";
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getRank() {
		// TODO Auto-generated method stub
		return rank ;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
}