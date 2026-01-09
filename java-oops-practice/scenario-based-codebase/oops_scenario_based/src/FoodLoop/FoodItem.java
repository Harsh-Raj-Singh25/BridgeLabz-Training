package FoodLoop;
// abstract class for mandatory implementation
abstract class FoodItem {
	private String name;
	private String category;
	private double price;
	private int stock; // encapsulation

	public FoodItem(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
	
	// only getter methods to maintain encapsulation
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	// method to check availability
	public boolean isAvailable(int quantity) {
		return stock >= quantity;
	}
	
	// updating the stock
	public void reduceStock(int quantity) {
		if (isAvailable(quantity))
			this.stock -= quantity;
	}
	// display the menu
	public void displayMenu() {
		System.out.println("Food Item:"+name+" | Price : Rs."+price);
	}
}
