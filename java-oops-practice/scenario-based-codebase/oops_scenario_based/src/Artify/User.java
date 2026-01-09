package Artify;

public class User implements IPurchasable {
	protected String name;
	protected double walletbalance;

	User(String name, double walletBalance) {
		this.name = name;
		this.walletbalance = walletbalance;

	}
	public void setWalletBalance(double balance) {
		this.walletbalance = balance;
	}
	public double getWalletBalance() {
		return this.walletbalance;
	}
	
	public void updateBalance(double price) {
		setWalletBalance(( getWalletBalance()-price));
	}
	@Override
	public void purchase(double price) {
		if ( getWalletBalance()>=price) {
			System.out.println("Yeah!!! Congratulations on your Art Collection");
			
			
			updateBalance(price);
			System.out.println("Remaining balance :"+getWalletBalance());
		} else {
			System.out.println("Sorry !! Not enough balance ");
			
			System.out.println("Remaining Balance in wallet:"+walletbalance);
			System.out.print("Price:"+price);
		}
	}

	@Override
	public void license(String type) {
		System.out.println("Congrats !! You just " + type + " to this artwork");
	}

}
