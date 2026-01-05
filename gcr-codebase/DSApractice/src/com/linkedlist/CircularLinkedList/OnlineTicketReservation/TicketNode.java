package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

class TicketNode {
	int ticketId;
	String customerName;
	String movieName;
	String seatNumber;
	String bookingTime;
	TicketNode next;

	public TicketNode(int id, String customer, String movie, String seat, String time) {
		this.ticketId = id;
		this.customerName = customer;
		this.movieName = movie;
		this.seatNumber = seat;
		this.bookingTime = time;
		this.next = null;
	}
}