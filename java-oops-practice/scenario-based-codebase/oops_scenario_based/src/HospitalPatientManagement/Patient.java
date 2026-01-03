package HospitalPatientManagement;

//Base class representing a general Patient
class Patient {
	private String name;
	private int age;
	private String medicalHistory; // ENCAPSULATION: Sensitive data kept private

	// CONSTRUCTOR: Overloaded for Normal Admission
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
		this.medicalHistory = "No previous history";
	}

	// CONSTRUCTOR: Overloaded for Emergency (allows immediate history recording)
	public Patient(String name, int age, String emergencyNote) {
		this.name = name;
		this.age = age;
		this.medicalHistory = emergencyNote;
	}

	// Getters and Setters (Encapsulation)
	public String getName() {
		return name;
	}

	public void setMedicalHistory(String history) {
		this.medicalHistory = history;
	}
	public String getHistory() {
		return medicalHistory;
	}

	// POLYMORPHISM: This method will be overridden by subclasses
	public void displayInfo() {
		System.out.println("Patient: " + name + " | Age: " + age+ "Disease : "+ medicalHistory);
	}
}