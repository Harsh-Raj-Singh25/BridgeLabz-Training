/* 16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/
public class WatchSimulation{
	public static void main( String [] args){
		// loop for hours
		System.out.println("----DIGITAL WATCH STARTED----");
		for(int hours=0; hours<24; hours++){
			//nested for loop for minutes
			for(int minutes=0; minutes<60; minutes++){
				// checking for stop condition and simulating power cut
				if(hours==13 && minutes==0){
					System.err.println("[13:00] -> !!POWER-CUT!! --The watch stopped--");
					System.exit(0);
				}
				// printing the time
				System.out.printf("Current Time : %02d:%02d%n",hours, minutes);
			}
		}
	}
}