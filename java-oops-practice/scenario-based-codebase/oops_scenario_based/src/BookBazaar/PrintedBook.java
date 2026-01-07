package BookBazaar;

class PrintedBook extends Book {
	private double shippingWeight;

	public PrintedBook(String title, String author, double price, int stock, double weight) {
		super(title, author, price, stock);
		this.shippingWeight = weight;
	}

	@Override
	public double applyDiscount(double price) {
		// POLYMORPHISM: Printed books get a flat $5 discount if price > $20
		return (price > 20) ? (price - 5) : price;
	}
}