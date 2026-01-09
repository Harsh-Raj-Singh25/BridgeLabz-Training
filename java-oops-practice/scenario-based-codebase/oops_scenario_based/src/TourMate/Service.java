package TourMate;

//SERVICE CLASSES: Transport, Hotel, Activity
class Service {
	private String name;
	private double cost; // Encapsulated: hidden from direct access

	public Service(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}
}
