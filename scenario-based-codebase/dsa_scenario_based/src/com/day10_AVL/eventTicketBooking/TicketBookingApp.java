package com.day10_AVL.eventTicketBooking;

public class TicketBookingApp {
    public static void main(String[] args) {
        EventTicketAVL system = new EventTicketAVL();

        // Adding Events
        system.addEvent(1900, "Rock Concert");
        system.addEvent(1000, "Morning Yoga");
        system.addEvent(1430, "Tech Seminar");
        system.addEvent(800, "Breakfast Meet");
        system.addEvent(2100, "Night Movie");

        system.showSchedule();

        // Scenario 2: Cancel an event
        System.out.println("\n Cancelling Tech Seminar (14:30)...");
        system.cancelEvent(1430);

        system.showSchedule();
    }
}
