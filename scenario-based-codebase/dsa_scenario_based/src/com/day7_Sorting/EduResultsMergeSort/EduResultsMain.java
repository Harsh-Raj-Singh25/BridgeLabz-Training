package com.day7_Sorting.EduResultsMergeSort;

public class EduResultsMain {
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("----WELCOME TO EDU-RESULTS-----");
		System.out.println("===============================");
		Student [] array= {
				new Student("Harsh", 154),
				new Student("Namrata" ,150),
				new Student("Anand",160),
				new Student("Adarsh",149),
				new Student("Madhu",155)
		};
		ScoreMergeSort.mergeSort(array);
		
		System.out.println("---SCORE OF TOP STUDENTS---");
		for(Student s: array) {
			s.display();
		}
	}
}
