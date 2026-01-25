package payXpress;

//Inheritance: Electricity Bill
class ElectricityBill extends Bill implements IPayable {
	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate);
	}

	@Override
	public void pay(double amountPaid) {
		if (amountPaid >= amount) {
			setPaid(true);
			System.out.println("Electricity bill paid successfully: Rs." + amountPaid);
		} else {
			System.out.println("Insufficient funds for Electricity bill.");
		}
	}

	// Polymorphism: Specific reminder for Electricity (Focus on blackout)
	@Override
	public void sendReminder() {
		System.out.println(
				" REMINDER: Pay your Electricity bill by " + dueDate + " to avoid disconnection and darkness!");
	}
}