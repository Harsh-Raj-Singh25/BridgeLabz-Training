package EWalletApplication;

//INHERITANCE: Business Wallet with different business logic (e.g., 2% transaction tax)
class BusinessWallet extends Wallet {
	public BusinessWallet(double initialLoad, double bonus) {
		super(initialLoad, bonus);
	}
}
