package VehicleRentalSystem;

public abstract class Vehicle {
	private String VehicleNumber;
	private double rentalRate;
	private String type;

	Vehicle(String Vnum, double rate, String type) {
		this.VehicleNumber = Vnum;
		this.rentalRate = rate;
		this.type = type;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	// SETTERS: Allows updating data with potential validation logic
	public void setRentalRate(double rate) {
		if (rate > 0) {
			this.rentalRate = rate;
		} else {
			System.out.println("Error: Rate must be positive!");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// public abstract double calculateRentalCost(int days);
}
