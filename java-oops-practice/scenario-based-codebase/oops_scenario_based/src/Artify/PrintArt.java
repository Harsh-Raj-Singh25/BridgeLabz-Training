package Artify;

public class PrintArt extends Artwork{
	protected double printingCharge;
	
	
	PrintArt(String title, String artist, double price, String licenseType,double printingCharge) {
		super(title,artist,price,licenseType);
		this.printingCharge=printingCharge;
	}
	
	public double totalPrice() {
		return printingCharge + getPrice();
	}
	@Override
	void display() {
		System.out.println("The Print Art :");
		System.out.println("Art Name:"+title+" | Artist:"+ artist+" | Price: "+getPrice()+" | License Type:"+licenseType);
		System.out.println("!!!Note : Final Price will include printing charges!!!");
	}
}
