package gameBox;


//Base Game Class
abstract class Game {
	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// Operator logic: Applying seasonal discounts
	public void applyDiscount(double percentage) {
		this.price -= (this.price * (percentage / 100));
		System.out.println("Offer applied to " + title + "! New Price: Rs." + String.format("%.2f", price));
	}

	public String getTitle() {
		return title;
	}
}

