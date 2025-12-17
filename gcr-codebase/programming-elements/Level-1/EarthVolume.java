public class EarthVolume{
	public static void main(String [] args){
		
		double radius=6378; // in kilometers
		// compute volume=(4/3) * pi * r^3 {in cubic kilometers}
		double volume_inKM = (4/3) * 3.14 * radius*radius*radius;
		// calculation in terms of miles
		double radius_M= radius*1.6;
		double volume_inMiles= (4/3) * 3.14 * radius_M*radius_M*radius_M;
		
		// Printing the results
		System.out.println("The volume of earth in cubic kilometers is " + volume_inKM +" and cubic miles is "+ volume_inMiles);
	}
}