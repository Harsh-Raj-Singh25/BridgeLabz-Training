package EventCaseEventManager;

abstract  class Event implements ISchedulable{
	private String eventName;
	private String location;
	private String date;
	private String eventId;
	protected int attendees;
	
	Event(String eventname, String location, String date,String eventId,int attendees){
		this.eventName=eventname;
		this.location=location;
		this.date=date;
		this.eventId=eventId;
		this.attendees=attendees;
	}
	// assigning only getters to restrict the editing once assigned
	public String getEventId() {
		return eventId;
	}
	public void schedule() {
		System.out.println("The event "+ eventName+"is scheduled on "+date+" at "+location);
	}
	
	
	
	// abstract method to calculate cost of event
	abstract double calculateCost();
	
	// getter and setter
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
