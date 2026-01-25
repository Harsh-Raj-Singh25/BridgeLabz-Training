package geoMeasureSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeoMeasureApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bonus: Storing multiple lines in a List
		List<Line> blueprintLines = new ArrayList<>();

		System.out.println(" --- GeoMeasure Solutions: Blueprint Comparison ---");
		System.out.print("How many lines do you want to input? ");
		int count = sc.nextInt();

		// Data Input Loop
		for (int i = 1; i <= count; i++) {
			System.out.println("\nLine " + i + " Coordinates:");
			System.out.print("Enter x1, y1: ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			System.out.print("Enter x2, y2: ");
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();

			blueprintLines.add(new Line(x1, y1, x2, y2));
		}

		// Compare first two lines if they exist
		if (blueprintLines.size() >= 2) {
			Line.compareLines(blueprintLines.get(0), blueprintLines.get(1), 1, 2);
		} else {
			System.out.println("\nNot enough lines to perform a comparison.");
		}

		sc.close();
	}
}
