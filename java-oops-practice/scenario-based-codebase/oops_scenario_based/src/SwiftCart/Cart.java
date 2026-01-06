package SwiftCart;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {
	private List<Product> items;
	// ENCAPSULATION: totalPrice is private to prevent unauthorized tampering
	private double totalPrice;

	// CONSTRUCTOR: Empty cart
	public Cart() {
		this.items = new ArrayList<>();
		this.totalPrice = 0.0;
	}

	// CONSTRUCTOR: Pre-filled cart (Overloading)
	public Cart(List<Product> preSelectedItems) {
		this.items = new ArrayList<>(preSelectedItems);
		updateTotal();
	}

	public void addItem(Product p) {
		items.add(p);
		updateTotal();
	}

	// ACCESS MODIFIER: Private logic so only the Cart can update the price
	private void updateTotal() {
		double sum = 0;
		for (Product p : items) {
			sum += p.getPrice(); // OPERATOR: Addition
		}
		this.totalPrice = sum;
	}

	@Override
	public double applyDiscount(double couponAmount) {
		double itemDiscounts = 0;
		for (Product p : items) {
			itemDiscounts += p.getProductSpecificDiscount(); // POLYMORPHISM in action
		}
		// OPERATOR: Subtraction
		double finalPrice = (totalPrice - itemDiscounts) - couponAmount;
		return finalPrice > 0 ? finalPrice : 0;
	}

	@Override
	public void generateBill() {
		System.out.println("\n--- SWIFTCART INVOICE ---");
		for (Product p : items) {
			System.out.printf("%-15s : Rs. %.2f (%s)%n", p.getName(), p.getPrice(), p.getCategory());
		}
		System.out.println("-------------------------");
		System.out.printf("Gross Total: Rs. %.2f%n", totalPrice);
	}
}