package com.workshop.smartCity.transportServices;

public interface TransportService {

	String getServiceName();
	String getRoute();
	double getFare();
	String getDepartureTime();

	// Default method (Java 8 feature)
	default void printServiceDetails() {
		System.out.println(getServiceName() + " | Route: " + getRoute() + " | Fare: ₹" + getFare() + " | Departure: "
				+ getDepartureTime());
	}
}
