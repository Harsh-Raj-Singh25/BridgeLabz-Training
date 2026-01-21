package com.Generics.DynamicOnlineMarketplace;

public class MarketPlace {
	public static <T extends Product> void applyDiscount(T product, double percentage) {
		double currentPrice=product.getPrice();
		double discountAmount=currentPrice * (percentage / 100);
		product.setPrice(currentPrice-discountAmount);
		System.out.println(" !!! DISCOUNT APPLIED!!!");
	}
	
	public static void main(String[] args) {
		// create a book 
		Product <BookCategory> javaBook=new Product<>("Java Book",50,new BookCategory());
		Product <GadgetCategory> gadget=new Product<>("SmartPhone",5000,new GadgetCategory());
		
		javaBook.display();
		gadget.display();
		
		// applying discounts using generic methods
		applyDiscount(javaBook,10);
		applyDiscount(gadget,15);
		
		System.out.println("------ After Sale-----");
		javaBook.display();
		gadget.display();
	}
}
