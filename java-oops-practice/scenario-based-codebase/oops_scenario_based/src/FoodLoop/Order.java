package FoodLoop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable{
	// list for adding up the ordered items
	private List<FoodItem> items=new ArrayList<>();
	private double totalPrice;
	
	// to create custom order combos
	public Order() {
		this.totalPrice=0;
	}
	
	public void addItem(FoodItem item) {
		if(item.isAvailable(1)) {
			items.add(item);
			item.reduceStock(1);
			totalPrice+=item.getPrice();
		}else {
			System.out.println("Sorry!!!"+ item.getName()+" is not available!!");
		}
	}
	// discount logic -> Polymorphism
	public double applyDiscount() {
		if(totalPrice > 1000) {
			return totalPrice * 0.20;
		}else if( totalPrice > 500) {
			return totalPrice * 0.10;
		}
		return 0.0;
	}

	@Override
	public void placeOrder() {
		double discount = applyDiscount();
		// calculate final price
		double finalPrice=totalPrice - discount;
		
		System.out.println("---FoodLoop Receipt----");
		for(FoodItem i: items) {
			System.out.println("-"+i.getName()+"( Rs. "+i.getPrice()+")");
		}
		System.out.println("Total : Rs. "+totalPrice);
		System.out.println("Discount Applied : Rs."+ discount);
		System.out.println("Final Payable : Rs."+finalPrice);
		System.out.println("Status : Sent for cooking");
		
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order is cancelled..!!!!...");
		
	}
}
