package com.workshop.smartCity.transportServices;

public class MetroService implements TransportService {

	private String route;
	private double fare;
	private String departureTime;

	public MetroService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	public String getServiceName() {
		return "Metro";
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
