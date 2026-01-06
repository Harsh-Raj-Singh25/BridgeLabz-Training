package SwiftCart;


// INTERFACE: Defines the checkout flow
interface ICheckout {
	void generateBill();

	double applyDiscount(double currentTotal);
}