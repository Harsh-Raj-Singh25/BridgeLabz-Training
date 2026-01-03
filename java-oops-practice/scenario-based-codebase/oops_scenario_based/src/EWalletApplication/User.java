package EWalletApplication;

//USER CLASS: Represents the customer
class User implements Transferrable {
	private String name;
	private Wallet wallet;

	public User(String name, Wallet wallet) {
		this.name = name;
		this.wallet = wallet;
	}

	public String getName() {
		return name;
	}

	public Wallet getWallet() {
		return wallet;
	}

	// POLYMORPHISM & ABSTRACTION: The actual transfer logic
	@Override
	public void transferTo(User receiver, double amount) {
		System.out.println("\nInitiating transfer from " + this.name + " to " + receiver.getName() + "...");

		double finalDeduction = amount;

		// LOGIC: If it's a Business Wallet, apply a 2% tax using OPERATORS
		if (this.wallet instanceof BusinessWallet) {
			double tax = amount * 0.02;
			finalDeduction = amount + tax;
			System.out.println("Business Account Detected. Applying 2% Tax: Rs. " + tax);
		}

		if (this.wallet.withdraw(finalDeduction)) {
			receiver.getWallet().deposit(amount);
			System.out.println("Transfer of Rs. " + amount + " successful!");
		}
	}
}
