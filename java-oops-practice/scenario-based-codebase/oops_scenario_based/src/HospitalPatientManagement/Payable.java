package HospitalPatientManagement;

//Interface to standardize billing across different services
interface Payable {
	double calculatePayment(); // Abstract method to be implemented by Bill
}