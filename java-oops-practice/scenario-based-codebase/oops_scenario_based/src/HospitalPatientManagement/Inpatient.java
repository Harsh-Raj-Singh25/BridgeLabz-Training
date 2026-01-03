package HospitalPatientManagement;

//INHERITANCE: InPatient adds stay-specific data
class InPatient extends Patient {
	private int roomNumber;

	public InPatient(String name, int age,String medicalHistory, int roomNumber) {
		super(name, age, medicalHistory);
		this.roomNumber = roomNumber;
	}

	@Override
	public void displayInfo() {
		System.out.println("[In-Patient] Name: " + getName() + " | Room: " + roomNumber + "| Disease :"+ getHistory());
	}
}