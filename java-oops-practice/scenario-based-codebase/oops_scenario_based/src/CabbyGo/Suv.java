package CabbyGo;

public class Suv extends Vehicle implements IRideService {
	public Suv(String Vnum) {
		super(Vnum,7,"SUV",1500,15);
	}
	@Override
	public void bookRide(double distance) {
		System.out.println("Booking the "+getType()+" \nCab Number is :"+getVehicleNumber());
	}
	
	@Override
	public void endRide() {
		System.out.println("-------The luxurious ride ends------\nThank you for using CabbyGo SUV");
	}
	
	// method to calculate fare
		public double calculateFare(double distance ) {
			return getBaseFare()+(distance * getRateperKm())+100; // additonal charge for SUV
		}
}
