package VehicleRentalSystem;

public class Car extends Vehicle implements Rentable {
	private double surCharges=500;
	
	public Car(String vNum, double rate, double surCharges) {
		super(vNum, rate, "Car");
		this.surCharges = surCharges;
	}

	public double getSurCharges() {
		return surCharges;
	}

	public void setSurCharges(double surCharges) {
		this.surCharges = surCharges;
	}
	@Override
	public double calculateRent(int days) {
		// LOGIC: Accessing private parent data via public Getter
		return (getRentalRate() * days) + surCharges;
	}
	
	void displaydetails(String Vnum , double rate,String  type) {
		System.out.println("The Car number is :"+Vnum + "\n its rate is "+rate+"\n the type of car is "+ type);
	}
}