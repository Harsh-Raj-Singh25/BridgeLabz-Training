package parkEase;

class Car extends Vehicle {
	public Car(String licensePlate) {
		super(licensePlate, "Car");
	}

	@Override
	public double getBaseRate() {
		return 30.0;
	} // Rs. 30/hour

	@Override
	public double calculateCharges(int hours) {
		return getBaseRate() * hours;
	}
}