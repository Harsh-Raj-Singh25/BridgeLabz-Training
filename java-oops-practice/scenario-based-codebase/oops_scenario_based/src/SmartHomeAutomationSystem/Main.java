package SmartHomeAutomationSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// POLYMORPHISM: Storing different devices in a list of the interface type
		List<Controllable> devices = new ArrayList<>();
		devices.add(new Light("Living Room", 80));
		devices.add(new AirConditioner("Bedroom", 22));

		System.out.println("==============================================");
		System.out.println("       WELCOME TO HARSH'S SMART HOME       ");
		System.out.println("==============================================");

		boolean running = true;
		while (running) {
			System.out.println("\n--- MAIN CONTROL PANEL ---");
			System.out.println("1. Turn ON all devices");
			System.out.println("2. Turn OFF all devices");
			System.out.println("3. Compare Energy Usage (Operators)");
			System.out.println("4. Exit");
			System.out.print("Select an option: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nProcessing commands...");
				for (Controllable device : devices) {
					device.turnOn(); // Polymorphic behavior
				}
				break;
			case 2:
				for (Controllable device : devices) {
					device.turnOff();
				}
				break;
			case 3:
				// OPERATORS: Comparing energy usage logic
				double lightUsage = devices.get(0).getEnergyConsumption();
				double acUsage = devices.get(1).getEnergyConsumption();

				System.out.println("\n--- ENERGY COMPARISON ---");
				if (acUsage > lightUsage) {
					System.out.println("WARNING: AC is consuming significantly more power than the Lights.");
				}
				System.out.println("Total usage if both ON: " + (lightUsage + acUsage) + " Watts");
				break;
			case 4:
				running = false;
				System.out.println("Shutting down Smart Panel. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
		scanner.close();
	}
}