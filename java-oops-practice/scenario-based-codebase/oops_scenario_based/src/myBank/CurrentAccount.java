package myBank;

//INHERITANCE: Current Account for business users
class CurrentAccount extends Account {
	public CurrentAccount(String accNum, double initial) {
		super(accNum, initial);
	}

	// POLYMORPHISM: Current accounts usually have zero or very low interest
	@Override
	public void calculateInterest() {
		System.out.println("Current Account (Business) so no interest");
	}
}