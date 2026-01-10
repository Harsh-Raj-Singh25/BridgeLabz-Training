package SkillForge;

import java.util.ArrayList;
import java.util.List;

class Course implements ICertifiable {
	private String title;
	private String level; // Beginner, Intermediate, Expert
	private double rating;
	private int totalReviews;
	private List<String> modules;

	// CONSTRUCTOR: Custom module list
	public Course(String title, String level, List<String> modules) {
		this.title = title;
		this.level = level;
		this.modules = modules;
		this.rating = 0.0;
		this.totalReviews = 0;
	}

	// CONSTRUCTOR: Default modules (Overloading)
	public Course(String title, String level) {
		this(title, level, new ArrayList<>(List.of("Introduction", "Core Concepts", "Final Exam")));
	}

	// ENCAPSULATION: Rating is protected. Only the addReview method can update it.
	public void addReview(int newRating) {
		if (newRating >= 1 && newRating <= 5) {
			// OPERATOR: Calculating moving average
			this.rating = ((this.rating * totalReviews) + newRating) / (totalReviews + 1);
			this.totalReviews++;
		}
	}

	public double getRating() {
		return rating;
	}

	@Override
	public void generateCertificate(String studentName) {
		// POLYMORPHISM: Certificate format varies based on course level
		System.out.println("\n--- SKILLFORGE OFFICIAL CERTIFICATE ---");
		if (level.equalsIgnoreCase("Expert")) {
			System.out.println(" GOLD CREDENTIAL: " + studentName);
		} else {
			System.out.println(" COMPLETION CERTIFICATE: " + studentName);
		}
		System.out.println("Course: " + title + " | Level: " + level);
		System.out.println("----------------------------------------");
	}
}
