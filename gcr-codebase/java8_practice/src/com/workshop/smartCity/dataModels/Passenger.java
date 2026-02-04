package com.workshop.smartCity.dataModels;

public class Passenger {

	private String route;
	private double fare;
	private boolean peakHour;

	public Passenger(String route, double fare, boolean peakHour) {
		this.route = route;
		this.fare = fare;
		this.peakHour = peakHour;
	}

	public String getRoute() {
		return route;
	}

	public double getFare() {
		return fare;
	}

	public boolean isPeakHour() {
		return peakHour;
	}
}
