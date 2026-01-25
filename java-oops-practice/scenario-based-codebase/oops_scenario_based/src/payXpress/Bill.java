package payXpress;

//Base Bill Class
abstract class Bill {
	protected String type;
	protected double amount;
	protected String dueDate;
	private boolean isPaid; // Encapsulation: Status is private
	protected double penaltyRate = 0.05; // 5% penalty for late bills

	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}

	// Encapsulation: Only internal methods can change payment status
	protected void setPaid(boolean status) {
		this.isPaid = status;
	}

	public boolean getIsPaid() {
		return isPaid;
	}

	// Requirement: Operators for late fees (baseAmount + penalty)
	public double calculateTotalWithLateFee() {
		double penalty = amount * penaltyRate;
		return amount + penalty; // Logic: baseAmount + penalty
	}
}
