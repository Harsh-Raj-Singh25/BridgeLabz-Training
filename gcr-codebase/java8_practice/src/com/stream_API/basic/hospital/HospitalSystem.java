package com.stream_API.basic.hospital;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Scenario: Find doctors available on weekends and sort by specialty.
○ Task: Use streams with filter() and sorted().
 */
import java.util.*;
import java.util.stream.Collectors;

public class HospitalSystem {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Harsh", "Cardiology", true),
            new Doctor("Namrata", "Orthopedics", true),
            new Doctor("Anand", "Neurology", false),
            new Doctor("Anil", "Cardiology", true),
            new Doctor("Suman", "Pediatrics", false)
        );

        System.out.println("--- Available Doctors (Sorted by Specialty) ---");

//        List<Doctor> availableDoctors = doctors.stream()
//            .filter(Doctor::isAvailableOnWeekend) // Keep only available ones
//            .sorted(Comparator.comparing(Doctor::getSpecialty)) // Sort by specialty
//            .toList();
//
//        availableDoctors.forEach(System.out::println);
        
        // alternate way
        doctors.stream()
                .filter(Doctor::isAvailableOnWeekend) // Keep only available ones
                .sorted(Comparator.comparing(Doctor::getSpecialty)) // Sort by specialty
                .toList().forEach(System.out::println);
    }
}
