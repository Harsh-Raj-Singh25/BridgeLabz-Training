package HospitalPatientManagement;
//BILLING CLASS: Implements the interface
class Bill implements Payable {
	private double consultationFee;
	private double medicineCost;

	public Bill(double consultation, double meds) {
		this.consultationFee = consultation;
		this.medicineCost = meds;
	}

	@Override
	public double calculatePayment() {
		// OPERATORS: Arithmetic operations to compute total
		double tax = 0.05;
		double total = consultationFee + medicineCost;
		return total + (total * tax); // Total with 5% tax
	}
}