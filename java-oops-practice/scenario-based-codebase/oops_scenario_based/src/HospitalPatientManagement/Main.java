package HospitalPatientManagement;

public class Main {
	public static void main(String[] args) {
		// Demonstrate Polymorphism
		Patient p1 = new InPatient("Ravi kumar", 25,"AIDS", 402);
		p1.displayInfo();

		Bill patientBill = new Bill(500, 1250);
		System.out.println("Total Amount Due: Rs. " + patientBill.calculatePayment());
	}
}