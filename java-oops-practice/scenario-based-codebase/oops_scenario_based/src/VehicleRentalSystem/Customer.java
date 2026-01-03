package VehicleRentalSystem;

// independent customer , not associated with any vehicle
class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}