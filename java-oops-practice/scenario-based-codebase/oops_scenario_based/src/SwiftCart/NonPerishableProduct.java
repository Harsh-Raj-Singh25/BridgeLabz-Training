package SwiftCart;

//INHERITANCE: Long-shelf-life products (e.g., Rice, Pasta)
class NonPerishableProduct extends Product {
	public NonPerishableProduct(String name, double price) {
		super(name, price, "Groceries");
	}

	@Override
	public double getProductSpecificDiscount() {
		// LOGIC: Standard discount (5%)
		return getPrice() * 0.05;
	}
}