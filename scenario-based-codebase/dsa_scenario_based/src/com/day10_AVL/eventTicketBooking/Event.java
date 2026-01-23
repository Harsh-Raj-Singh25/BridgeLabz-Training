package com.day10_AVL.eventTicketBooking;
/*
 * Story: Online Ticket Booking by Time
Users book event tickets sorted by event time.
Scenarios:
● 🔹 Scenario 1: Insert Event — Add new event based on start time.
● 🔹 Scenario 2: Cancel Event — Admin deletes a cancelled event.
● 🔹 Scenario 3: Show Events in Order — Display events in upcoming order.
 */
public class Event {
	String eventname;
	int startTime; // hhmm format
	int height;
	Event left, right;
	
	Event(String name, int time){
		this.eventname=name;
		this.startTime=time;
		this.height=1;
	}
	
}
