package BookBazaar;

//BASE CLASS: Represents a general Book
abstract class Book implements IDiscountable {
	private String title;
	private String author;
	private double price;
	private int stock; // Encapsulated inventory

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	// Getters
	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	// ENCAPSULATION: Stock can only be updated through controlled methods
	public void reduceStock(int quantity) {
		if (this.stock >= quantity) {
			this.stock -= quantity;
		} else {
			System.out.println("Error: Insufficient stock for " + title);
		}
	}
}