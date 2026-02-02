package com.stream_API.basic.hospital;

class Doctor {
	private String name;
	private String specialty;
	private boolean availableOnWeekend;

	public Doctor(String name, String specialty, boolean availableOnWeekend) {
		this.name = name;
		this.specialty = specialty;
		this.availableOnWeekend = availableOnWeekend;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public boolean isAvailableOnWeekend() {
		return availableOnWeekend;
	}

	@Override
	public String toString() {
		return String.format("Dr. %-10s | Specialty: %-12s", name, specialty);
	}
}