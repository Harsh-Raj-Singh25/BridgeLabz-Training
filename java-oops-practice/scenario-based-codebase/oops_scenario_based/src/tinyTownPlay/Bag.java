package tinyTownPlay;

import java.util.ArrayList;
import java.util.List;

//Bag Class
class Bag implements Storable {
	private String bagId;
	private String color;
	private int capacity;
	// Composition: Bag has-a list of Balls
	private List<Ball> balls;

	public Bag(String bagId, String color, int capacity) {
		this.bagId = bagId;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	// Method to add ball with capacity check
	public boolean addBall(Ball ball) {
		if (balls.size() < capacity) {
			balls.add(ball);
			System.out.println(" Ball " + ball.getBallId() + " added to Bag " + bagId);
			return true;
		} else {
			System.out.println(" Error: Bag " + bagId + " is full!");
			return false;
		}
	}

	// Method to remove a ball by ID
	public void removeBall(String ballId) {
		boolean removed = balls.removeIf(b -> b.getBallId().equals(ballId));
		if (removed) {
			System.out.println(" Ball " + ballId + " removed from Bag " + bagId);
		} else {
			System.out.println(" Ball ID not found in this bag.");
		}
	}

	public void displayBalls() {
		System.out.println("Contents of Bag " + bagId + ":");
		if (balls.isEmpty())
			System.out.println("   (Empty)");
		for (Ball b : balls) {
			System.out.println("   " + b.getInfo());
		}
	}

	@Override
	public String getInfo() {
		return String.format("Bag ID: %s | Color: %s | Capacity: %d | Count: %d", bagId, color, capacity, balls.size());
	}

	public String getBagId() {
		return bagId;
	}
}
