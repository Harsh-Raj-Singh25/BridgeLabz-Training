package geoMeasureSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Line {
	// Encapsulation: Private variables hide internal data
	private double x1, y1, x2, y2;

	// Constructor: Uses 'this' keyword to initialize fields
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// Method to calculate length
	public double calculateLength() {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	// Static method for comparison (Comparison Logic)
	public static void compareLines(Line l1, Line l2, int index1, int index2) {
		double len1 = l1.calculateLength();
		double len2 = l2.calculateLength();

		System.out.printf("\nLine %d Length: %.2f | Line %d Length: %.2f\n", index1, len1, index2, len2);

		if (len1 == len2) {
			System.out.println("Result: Both lines are of equal length.");
		} else if (len1 > len2) {
			System.out.println("Result: Line " + index1 + " is longer.");
		} else {
			System.out.println("Result: Line " + index2 + " is longer.");
		}
	}
}

