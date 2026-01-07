package parkEase;

//BASE CLASS: Represents a generic Vehicle
abstract class Vehicle implements IPayable {
	private String licensePlate;
	private String type;

	public Vehicle(String licensePlate, String type) {
		this.licensePlate = licensePlate;
		this.type = type;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public String getType() {
		return type;
	}

	// POLYMORPHISM: Abstract method for type-specific hourly rates
	public abstract double getBaseRate();
}
