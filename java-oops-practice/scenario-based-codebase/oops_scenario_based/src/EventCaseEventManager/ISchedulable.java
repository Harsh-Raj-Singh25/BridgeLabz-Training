package EventCaseEventManager;
/*
 * 13. "EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.

Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.
 */
public interface ISchedulable {
	void schedule();
	void reschedule(String newdate);
	void cancel();
}
