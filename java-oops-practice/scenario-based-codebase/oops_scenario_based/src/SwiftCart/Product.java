package SwiftCart;

//BASE CLASS: General Product template
abstract class Product {
	private String name;
	private double price;
	private String category;

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	// ENCAPSULATION: Getters to access private data
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	// POLYMORPHISM: Abstract method for type-specific discounts
	public abstract double getProductSpecificDiscount();
}
