package CabbyGo;

public class Vehicle {
	private String vehicleNumber;
	private int capacity;
	private String type;
	private double baseFare;
	private double rateperKm;
	
	Vehicle(String vehicleNumber, int capacity,String type, double baseFare, double rateperKm){
		this.vehicleNumber=vehicleNumber;
		this.capacity=capacity;
		this.type=type;
		this.baseFare=baseFare;
		this.rateperKm=rateperKm;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		if(baseFare>0) {
			this.baseFare = baseFare;
		}else {
			System.out.println("The ride fare can't be zero");
		}
	}

	public double getRateperKm() {
		return rateperKm;
	}

	public void setRateperKm(double rateperKm) {
		if(rateperKm>0) {
			this.rateperKm = rateperKm;
		}else {
			System.out.println("You can't travel free");
		}
		
	}
	
	
	
}
