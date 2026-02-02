package com.stream_API.forEach_questions;

import java.util.Arrays;
import java.util.List;

public class SensorReadings {
	public static void main(String[] args) {
		List <Double> readings=Arrays.asList(45.2,25.4,36.4,78.5,45.8,39.6);
		
		double threshold=40.0;
		// checking and printing the values above threshold
		System.out.println("Above threshold values:");
		readings.stream().filter(n -> n>threshold).forEach(System.out::println);
	}
}
