package Artify;

abstract public class Artwork  {
	protected String title;
	protected String artist;
	private double price;
	public String licenseType;
	
	Artwork(String title, String artist, double price, String licenseType) {
		this.artist=artist;
		this.title=title;
		this.price=price;
		this.licenseType=licenseType;
	}
	public double getPrice() {
		return price;
	}
	void display() {
		System.out.println("Art Name:"+title+" | Artist:"+ artist+" | Price: "+getPrice()+" | License Type:"+licenseType);
	}
	
	
}
