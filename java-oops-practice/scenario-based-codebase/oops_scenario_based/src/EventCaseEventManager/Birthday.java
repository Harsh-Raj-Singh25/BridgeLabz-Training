package EventCaseEventManager;

public class Birthday extends Event {
	private double discount;
	private int venueCost;
	private int services;
	// constructor
	public Birthday(String location, String date, String eventId, int attendees,
			double discount, int venues) {
		super("Birthday", location, date, eventId, attendees);
		this.discount = discount;
		this.venueCost = venues;
		this.services = 5000;
	};
	@Override
	public void schedule() {
		System.out.println("The Birthday event is scheduled");
		System.out.println("Event location:"+getLocation()+" | Date:"+getDate()+" | EventId"+getEventId()+" |Total attendees " +attendees+" total cost"+ calculateCost());
	}
	@Override
	public void reschedule(String newDate) {
		System.out.println("The birthday party is recheduled ");
		System.out.println(" New Details:");
		System.out.println("Event location:"+getLocation()+" | New Date:"+newDate+" | EventId"+getEventId()+" |Total attendees " +attendees+" total cost:"+ calculateCost());
		
	}
	
	@Override
	public void cancel() {
		System.out.println("The Birthday event is cancelled");
	}

	
	double calculateCost() {
		return venueCost+services - discount;
	}
}
