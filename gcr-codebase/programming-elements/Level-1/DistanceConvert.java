import java.util.*;
public class DistanceConvert{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Provide the distance in feet");
		double distance=sc.nextDouble();
		// distance in yards
		double distance_yard=distance/3;
		// distance in miles
		double distance_miles=distance_yard / 1760;
		
		System.out.println("Your distance in yards is "+ distance_yard+ " and in miles is "+ distance_miles);
	}
}