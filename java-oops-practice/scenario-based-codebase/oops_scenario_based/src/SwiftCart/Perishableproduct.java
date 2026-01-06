package SwiftCart;

//INHERITANCE: Products that expire (e.g., Milk, Fruits)
class PerishableProduct extends Product {
	public PerishableProduct(String name, double price) {
		super(name, price, "Perishables");
	}

	@Override
	public double getProductSpecificDiscount() {
		// LOGIC: High discount (15%) to clear stock fast
		return getPrice() * 0.15;
	}
}