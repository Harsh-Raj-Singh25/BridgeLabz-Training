package payXpress;

//Inheritance: Water Bill
class WaterBill extends Bill implements IPayable {
	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate);
	}

	@Override
	public void pay(double amountPaid) {
		setPaid(true);
		System.out.println("Water bill of Rs." + amount + " cleared.");
	}

	@Override
	public void sendReminder() {
		System.out.println(" REMINDER: Water bill due on " + dueDate + ". Please conserve water and pay on time.");
	}
}