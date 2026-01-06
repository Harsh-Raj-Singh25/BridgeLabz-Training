package EventCaseEventManager;

public class Conference extends Event{
	private double discount;
	private int venueCost;
	private int services;
	// constructor
	public Conference(String location, String date, String eventId, int attendees,
			double discount, int venueCost) {
		super("Conference", location, date, eventId, attendees);
		this.discount = discount;
		this.venueCost = venueCost;
		this.services = 10000;
	};
	@Override
	public void schedule() {
		System.out.println("The Conference event is scheduled");
		System.out.println("The Event Details :");
		System.out.println("Event location:"+getLocation()+" | Date:"+getDate()+" | EventId"+getEventId()+" |Total attendees " +attendees+"total cost:"+calculateCost());
	}
	@Override
	public void reschedule(String newDate) {
		System.out.println("The Conference party is recheduled ");
		System.out.println(" New Details with added fine :");
		System.out.println("Event location:"+getLocation()+" | New Date:"+newDate+" | EventId"+getEventId()+" |Total attendees " +attendees+" total Cost :"+calculateCost()+1000);
		
	}
	
	@Override
	public void cancel() {
		System.out.println("The Conference event is cancelled");
	}

	
	double calculateCost() {
		return venueCost+services - discount;
	}
}
