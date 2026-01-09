package TourMate;

//BASE CLASS: General Trip Template
abstract class Trip implements IBookable {
	private String destination;
	private int duration;
	protected Service transport, hotel, activity;

	public Trip(String destination, int duration, Service t, Service h, Service a) {
		this.destination = destination;
		this.duration = duration;
		this.transport = t;
		this.hotel = h;
		this.activity = a;
	}

	public String getDestination() {
		return destination;
	}

	// OPERATORS: Calculating total budget
	public double calculateTotalBudget() {
		return transport.getCost() + hotel.getCost() + activity.getCost();
	}
}