package parkEase;

class Bike extends Vehicle {
	public Bike(String licensePlate) {
		super(licensePlate, "Bike");
	}

	@Override
	public double getBaseRate() {
		return 10.0;
	} // Rs. 10/hour

	@Override
	public double calculateCharges(int hours) {
		// OPERATORS: rate * hours
		return getBaseRate() * hours;
	}
}




