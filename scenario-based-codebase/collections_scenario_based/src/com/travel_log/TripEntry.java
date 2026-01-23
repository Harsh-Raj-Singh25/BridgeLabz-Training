package com.travel_log;

import java.io.Serializable;
import java.util.List;

public class TripEntry implements Serializable {
	private static final long serialVersionUID = 1L; // Ensures version compatibility
	private String country;
	private List<String> cities;
	private int duration;
	private String blogText;

	public TripEntry(String country, List<String> cities, int duration, String blogText) {
		this.country = country;
		this.cities = cities;
		this.duration = duration;
		this.blogText = blogText;
	}

	// Getters
	public String getCountry() {
		return country;
	}

	public List<String> getCities() {
		return cities;
	}

	public int getDuration() {
		return duration;
	}

	public String getBlogText() {
		return blogText;
	}
}