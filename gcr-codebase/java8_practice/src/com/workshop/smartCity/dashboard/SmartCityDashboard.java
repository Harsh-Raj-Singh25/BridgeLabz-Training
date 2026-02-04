package com.workshop.smartCity.dashboard;

import java.util.*;
import java.util.stream.Collectors;

import com.workshop.smartCity.dataModels.Passenger;
import com.workshop.smartCity.markerInterface.EmergencyService;
import com.workshop.smartCity.transportServices.AmbulanceService;
import com.workshop.smartCity.transportServices.BusService;
import com.workshop.smartCity.transportServices.MetroService;
import com.workshop.smartCity.transportServices.TaxiService;
import com.workshop.smartCity.transportServices.TransportService;
import com.workshop.smartCity.utils.FareCalculator;
import com.workshop.smartCity.utils.GeoUtils;

public class SmartCityDashboard {

	public static void main(String[] args) {

		List<TransportService> services = Arrays.asList(new BusService("A-B", 20, "08:30"),
				new MetroService("A-C", 40, "08:00"), new TaxiService("B-C", 100, "07:45"), new AmbulanceService());

		// Lambda + Stream: filter & sort by fare
		System.out.println("Filtered & Sorted Services:");
		services.stream().filter(s -> s.getFare() >= 20).sorted(Comparator.comparingDouble(TransportService::getFare))
				.forEach(TransportService::printServiceDetails);

		//  Method Reference
		System.out.println("\nAll Available Services:");
		services.forEach(TransportService::printServiceDetails);

		//  Functional Interface using Lambda
		FareCalculator calculator = distance -> distance * 5;
		System.out.println("\nCalculated Fare for 10km: ₹" + calculator.calculateFare(10));

		//  Static Method in Interface
		double distance = GeoUtils.calculateDistance(2, 3, 8, 9);
		System.out.println("\nCalculated Distance: " + distance);

		// Passenger Data
		List<Passenger> passengers = Arrays.asList(new Passenger("A-B", 20, true), new Passenger("A-B", 20, false),
				new Passenger("A-C", 40, true), new Passenger("B-C", 100, false));

		//   Collectors – groupingBy
		System.out.println("\nPassengers Grouped by Route:");
		Map<String, List<Passenger>> byRoute = passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));
		byRoute.forEach((k, v) -> System.out.println(k + " -> " + v.size()));

		//  partitioningBy
		System.out.println("\nPeak vs Non-Peak Trips:");
		Map<Boolean, List<Passenger>> peakPartition = passengers.stream()
				.collect(Collectors.partitioningBy(Passenger::isPeakHour));
		System.out.println("Peak Trips: " + peakPartition.get(true).size());
		System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());

		// summarizingDouble
		DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));

		System.out.println("\nRevenue Summary:");
		System.out.println("Total Revenue: ₹" + stats.getSum());
		System.out.println("Average Fare: ₹" + stats.getAverage());

		//   Marker Interface Detection
		System.out.println("\nEmergency Services:");
		services.stream().filter(s -> s instanceof EmergencyService)
				.forEach(s -> System.out.println(s.getServiceName() + " gets priority"));
	}
}
