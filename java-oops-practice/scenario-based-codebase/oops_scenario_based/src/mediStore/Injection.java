package mediStore;

public class Injection extends Medicine{
	protected double discount;
	Injection(String name, int price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
		this.discount=0.3;
	}

	@Override
	public void checkExpiry() {
		System.out.println("The expiry date is : " + getExpiryDate());
	}

	@Override
	public void sell(int number) {
		if (getQuantity() > number) {
			System.out.println("Total " + number + " unit of Injections sold.\n Total Cost " + ((price * number)-((price*number)*discount)));
			// stock adjustment
			setQuantity(number);
		} else {
			System.out.println("Sorry!!! The quantity is not suffiecient to fulfill the demand");
		}
	}
	
	void displayDetails() {
		System.out.println("Name:"+ name +"\n Price:"+price+"\nExpiryDate:"+getExpiryDate());
	}
}
