package com.collections.queue_Interface;

/*
 * 
 * Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
 */
import java.util.*;

class Patient {
	String name;
	int severity;

	Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	@Override
	public String toString() {
		return name + " (Level " + severity + ")";
	}
}

public class HospitalTriageSystem {
	public static void main(String[] args) {
		// Comparator.comparingInt(...).reversed() ensures higher numbers come first
//		Patient p;
		PriorityQueue<Patient> triage = new PriorityQueue<>(
				Comparator.comparingInt((Patient p) -> p.severity).reversed());

		triage.add(new Patient("John", 3));
		triage.add(new Patient("Alice", 5));
		triage.add(new Patient("Bob", 2));

		System.out.println("Treatment Order:");
		while (!triage.isEmpty()) {
			System.out.println(triage.poll());
		}
	}
}
