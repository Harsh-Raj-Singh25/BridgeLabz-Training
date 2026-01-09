package mediStore;

public class Syrup extends Medicine {
	protected double discount;
	Syrup(String name, int price, String expiryDate,int quantity) {
		super(name, price, expiryDate, quantity);
		this.discount=0.2;
	}

	@Override
	public void checkExpiry() {
		System.out.println("The expiry date is " + getExpiryDate());
		System.out.println("It expires soon once opened0");
	}

	@Override
	public void sell(int number) {
		if (getQuantity() > number) {
			System.out.println("Total " + number + " unit of syrup sold.\n Total Cost " + ((price * number)-((price*number)*discount)));
			setQuantity(number);
		} else {
			System.out.println("Sorry!!! The quantity is not suffiecient to fulfill the demand");
		}
	}
	void displayDetails() {
		System.out.println("Name:"+ name +"\n Price:"+price+"\nExpiryDate:"+getExpiryDate());
	}

}
