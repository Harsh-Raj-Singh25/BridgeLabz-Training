package Artify;

public class DigitalArt extends Artwork {
	
	DigitalArt(String title, String artist, double price, String licenseType){
		super(title,artist,price,licenseType);
	}

	public double totalPrice() {
		return getPrice();
	}
	@Override
	void display() {
		System.out.println("The Digital Art");
		System.out.println("Art Name:"+title+" | Artist:"+ artist+" | Price: "+getPrice()+" | License Type:"+licenseType);
	}
}
