package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

public class TicketReservationList {
	private TicketNode head = null;
	private TicketNode tail = null;
	private int ticketCount = 0;

	// 1. ADD TICKET: At the end
	public void reserveTicket(int id, String customer, String movie, String seat, String time) {
		TicketNode newNode = new TicketNode(id, customer, movie, seat, time);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; // Forms the circle
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head; // Points back to the first node
		}
		ticketCount++;
		System.out.println("Reservation Confirmed for: " + customer);
	}

	// 2. REMOVE TICKET: By Ticket ID
	public void cancelReservation(int id) {
		if (head == null) {
			System.out.println("No reservations found.");
			return;
		}

		TicketNode curr = head, prev = tail;
		boolean found = false;

		do {
			if (curr.ticketId == id) {
				// Scenario: Only one ticket in the system
				if (curr == head && curr == tail) {
					head = tail = null;
				}
				// Scenario: Removing the first ticket
				else if (curr == head) {
					head = head.next;
					tail.next = head;
				}
				// Scenario: Removing the last ticket
				else if (curr == tail) {
					tail = prev;
					tail.next = head;
				}
				// Scenario: Middle ticket
				else {
					prev.next = curr.next;
				}
				ticketCount--;
				found = true;
				System.out.println("Ticket ID " + id + " has been cancelled.");
				break;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		if (!found)
			System.out.println("Ticket ID " + id + " not found.");
	}

	// 3. SEARCH: By Customer Name or Movie Name
	public void searchReservation(String query) {
		if (head == null)
			return;
		TicketNode temp = head;
		boolean found = false;
		do {
			if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
				System.out.println(
						"Found Reservation: [" + temp.ticketId + "] " + temp.customerName + " - " + temp.movieName);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found)
			System.out.println("No reservation found for: " + query);
	}

	// 4. DISPLAY ALL
	public void displayAllTickets() {
		if (head == null) {
			System.out.println("Ticket list is empty.");
			return;
		}
		TicketNode temp = head;
		System.out.println("\n--- Current Bookings (Circular View) ---");
		do {
			System.out.println("ID: " + temp.ticketId + " | Customer: " + temp.customerName + " | Movie: "
					+ temp.movieName + " | Seat: " + temp.seatNumber);
			temp = temp.next;
		} while (temp != head);
	}

	public int getBookingCount() {
		return ticketCount;
	}
}
