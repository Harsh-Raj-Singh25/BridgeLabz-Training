package com.travel_log;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class TravelLogManager {
	private static final String DATA_FILE = "trips.dat";

	// SAVE: Serialize the whole list to disk
	public void saveTrips(List<TripEntry> trips) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
			oos.writeObject(trips);
			System.out.println(" Trips saved successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// LOAD: Deserialize from disk
	@SuppressWarnings("unchecked")
	public List<TripEntry> loadTrips() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
			return (List<TripEntry>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			return new ArrayList<>(); // Return empty list if file not found
		}
	}

	public void analyzeTrips(List<TripEntry> trips) {
		// 1. Regex: Find all cities mentioned in blog text (assuming format: "Visited
		// [City]")
		Pattern pattern = Pattern.compile("(?i)Visited ([a-zA-Z]+)");
		System.out.println("---  Cities Found via Regex ---");
		trips.forEach(t -> {
			Matcher m = pattern.matcher(t.getBlogText());
			while (m.find())
				System.out.println("Detected: " + m.group(1));
		});

		// 2. Duration > 5 days
		System.out.println("\n---  Long Trips (> 5 Days) ---");
		trips.stream().filter(t -> t.getDuration() > 5)
				.forEach(t -> System.out.println(t.getCountry() + " - " + t.getDuration() + " days"));

		// 3. Unique Countries (using Set)
		Set<String> uniqueCountries = trips.stream().map(TripEntry::getCountry).collect(Collectors.toSet());
		System.out.println("\n---  Unique Countries: " + uniqueCountries);

		// 4. Top 3 Cities visited most often
		Map<String, Integer> cityFreq = new HashMap<>();
		trips.stream().flatMap(t -> t.getCities().stream())
				.forEach(city -> cityFreq.put(city, cityFreq.getOrDefault(city, 0) + 1));

		System.out.println("\n---  Top 3 Most Visited Cities ---");
		cityFreq.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
				.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " times"));
	}

	public static void main(String[] args) {
		TravelLogManager manager = new TravelLogManager();

		List<TripEntry> myTrips = Arrays.asList(
				new TripEntry("France", Arrays.asList("Paris", "Nice"), 7, "Visited Paris and it was lovely."),
				new TripEntry("Italy", Arrays.asList("Rome", "Venice", "Milan"), 10, "Visited Rome in the summer."),
				new TripEntry("France", Arrays.asList("Paris", "Lyon"), 4, "Visited Paris again for the food."));

		manager.saveTrips(myTrips);
		List<TripEntry> loaded = manager.loadTrips();
		manager.analyzeTrips(loaded);
	}
}