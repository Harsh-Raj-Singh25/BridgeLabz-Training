package VehicleRentalSystem;

class Bike extends Vehicle implements Rentable {
	public Bike(String vNum, double rate) {
		super(vNum, rate, "Bike");
	}

	@Override
	public double calculateRent(int days) {
		// LOGIC: Simple rate calculation
		return getRentalRate() * days;
	}
}
