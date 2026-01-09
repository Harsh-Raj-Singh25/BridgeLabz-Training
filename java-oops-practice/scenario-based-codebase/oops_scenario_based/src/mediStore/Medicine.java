package mediStore;

abstract public class Medicine implements ISellable {
	protected String name;
	protected int price;
	private String expiryDate;
	private int quantity;
	
	Medicine(String name, int price, String expiryDate, int quantity){
		this.name=name;
		this.price=price;
		this.expiryDate=expiryDate;
		this.quantity=quantity;
	}
	
	// encapsulation
	public String getExpiryDate() {
		return expiryDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public abstract void checkExpiry();
	
	public void setQuantity(int number) {
		quantity-=number;
	}
	
}
