package parkEase;

class Truck extends Vehicle {
	public Truck(String licensePlate) {
		super(licensePlate, "Truck");
	}

	@Override
	public double getBaseRate() {
		return 100.0;
	} // Rs. 100/hour

	@Override
	public double calculateCharges(int hours) {
		// OPERATORS: (base * hours) + penalty for oversized vehicle
		double baseCharge = getBaseRate() * hours;
		double penalty = (hours > 5) ? 200.0 : 0.0;
		return baseCharge + penalty;
	}
}
