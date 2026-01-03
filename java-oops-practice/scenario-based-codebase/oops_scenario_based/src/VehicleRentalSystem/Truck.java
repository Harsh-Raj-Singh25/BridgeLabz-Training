package VehicleRentalSystem;

class Truck extends Vehicle implements Rentable {
	private double weightage;

	public Truck(String vNum, double rate, double weightage) {
		super(vNum, rate, "Truck");
		this.weightage = weightage;
	}

	@Override
	public double calculateRent(int days) {
		// LOGIC: Heavier trucks have a weight-based surcharges
		double weightFee = weightage * 100;
		return (getRentalRate() * days) + weightFee;
	}
}