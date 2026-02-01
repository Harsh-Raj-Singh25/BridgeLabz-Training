package com.method_references.patientIdPrinting;

import java.util.Arrays;
import java.util.List;

public class HospitalAdmin {
	public static void main(String[] args) {
		List<String> patientIds = Arrays.asList("P-101", "P-102", "P-103", "P-104");

		System.out.println("--- Admin Verification List ---");

		// Lambda Version: 
		patientIds.forEach(id -> System.out.println(id));
		
		System.out.println("--List with method reference--");
		// Method Reference Version:
		patientIds.forEach(System.out::println);
	}
}