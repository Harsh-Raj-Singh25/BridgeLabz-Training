/* 19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/
import java.util.*;
public class BusRouteDistanceTracker{
	static int totalStops=10;
	// setting the distance between two stops= 2km
	static int stopDistance=2; 
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean going=true;
		while(going){
			System.out.println("--------Happy Journey--------");
			System.out.println("-----------WELCOME-----------");
			System.out.println("---------HRS TRAVELS---------");
			int totalDistance=2;
			for(int i=0;i<totalStops;i++){
				System.out.println("Reached stop No."+(i+1));
				System.out.println("Do you want to keep going? [y/n]");
				String str=sc.next().toLowerCase();
				if(str.equals("y")){
					System.out.println("-----Let's go-----");
					totalDistance+=2;
				}else{
					System.out.println("---Thank for travelling with us---");
					going=false;
					break;
				}
			}
			System.out.println("The total Distance travelled is :"+totalDistance+ "km");
		}
	}
}
				