package payXpress;

//Inheritance: Internet Bill
class InternetBill extends Bill implements IPayable {
	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate);
	}

	@Override
	public void pay(double amountPaid) {
		setPaid(true); // Internet bills usually have fixed auto-pay
		System.out.println("Internet bill processed: Rs." + amount);
	}

	// Polymorphism: Specific reminder for Internet (Focus on speed/bandwidth)
	@Override
	public void sendReminder() {
		System.out
				.println(" REMINDER: Renew your " + dueDate + " Internet plan to maintain high-speed connectivity.");
	}
}
