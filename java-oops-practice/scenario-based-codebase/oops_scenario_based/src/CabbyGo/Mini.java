package CabbyGo;

public class Mini extends Vehicle implements IRideService {
	public Mini(String Vnum) {
		super(Vnum,4,"Mini",1000,12);
	}
	
	@Override
	public void bookRide(double distance) {
		System.out.println("Booking the "+getType()+"\n Cab Number is :"+getVehicleNumber());
	}
	
	@Override
	public void endRide() {
		System.out.println("-------The ride ends------\nThank you for using CabbyGo Mini");
	}
	
	// method to calculate fare
	public double calculateFare(double distance ) {
		return getBaseFare()+(distance * getRateperKm());
	}

}
