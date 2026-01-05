package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

public class Main {
    public static void main(String[] args) {
        TicketReservationList system = new TicketReservationList();

        // Adding Reservations
        system.reserveTicket(501, "Harsh Singh", "Inception", "A12", "18:00");
        system.reserveTicket(502, "Namrata Khapre", "Avatar 2", "B05", "20:30");
        system.reserveTicket(503, "Anand", "Inception", "A13", "18:00");

        // Display current status
        system.displayAllTickets();
        System.out.println("Total Booked: " + system.getBookingCount());

        // Search for movie
        System.out.println("\nSearching for movie 'Inception'...");
        system.searchReservation("Inception");

        // Cancel a ticket
        system.cancelReservation(502);

        // Final Display
        system.displayAllTickets();
    }
}