package tinyTownPlay;

public class TinyTownOrganizer {
	public static void main(String[] args) {
		//  Setup Bags
		Bag blueBag = new Bag("B01", "Blue", 2);
		Bag redBag = new Bag("B02", "Red", 5);

		//  Setup Balls
		Ball ball1 = new Ball("Ball-A", "Yellow", "Small");
		Ball ball2 = new Ball("Ball-B", "Green", "Medium");
		Ball ball3 = new Ball("Ball-C", "Red", "Large");

		// Perform Operations
		System.out.println("--- Storage Operations ---");
		blueBag.addBall(ball1);
		blueBag.addBall(ball2);
		blueBag.addBall(ball3); // This should fail (Capacity is 2)

		System.out.println("\n--- Inventory Display ---");
		blueBag.displayBalls();

		System.out.println("\n--- Summary ---");
		System.out.println(blueBag.getInfo());
		System.out.println(redBag.getInfo());

		//  Removal
		System.out.println("\n--- Removal ---");
		blueBag.removeBall("Ball-A");
		blueBag.displayBalls();
	}
}
