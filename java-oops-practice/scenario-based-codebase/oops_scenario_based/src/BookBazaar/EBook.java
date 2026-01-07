package BookBazaar;

class EBook extends Book {
	public EBook(String title, String author, double price) {
		// E-books have "infinite" stock (set to 9999)
		super(title, author, price, 9999);
	}

	@Override
	public double applyDiscount(double price) {
		// POLYMORPHISM: E-Books get a flat 15% digital discount
		return price * 0.85;
	}
}

