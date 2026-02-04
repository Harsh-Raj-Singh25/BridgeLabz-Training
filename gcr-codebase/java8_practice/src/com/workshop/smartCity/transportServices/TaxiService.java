package com.workshop.smartCity.transportServices;

public class TaxiService implements TransportService {

	private String route;
	private double fare;
	private String departureTime;

	public TaxiService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	public String getServiceName() {
		return "Taxi";
	}

	public String getRoute() {
		return route;
	}

	public double getFare() {
		return fare;
	}

	public String getDepartureTime() {
		return departureTime;
	}
}
