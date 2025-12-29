/* 9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/
import java.util.*;
public class BusAttendance{
	// initializing the numberOfStudents
	static int numberOfStudents=10;
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		// defining the String array of 10 students names:
		String[] names={"Harsh", "Namrata", "Madhur","Pratul","Hena", "Harshika","Jitu","Mohit","Harsh J","Nitesh"};
		
		int presentCount=0;
		int absentCount=0;
		System.out.println("Enter your attendance: p for present and a for absent");
		// for-each loop to iterate through the names in the array:
		for(String name: names){
			// ask for presence/absence:
			System.out.println(name + " is present or Absent? ");
			char s=sc.next().charAt(0);
			if(s=='p' || s=='P'){
				presentCount++;
			}else{
				absentCount++;
			}
		}
		// display output
		displayAttendance(presentCount, absentCount);
	}
	// method for displaying the attendance :
	public static void displayAttendance(int presentCount, int absentCount){
		System.out.println("=================================");
		System.out.println("        BUS ATTENDANCE                   ");
		System.out.println("=================================");
		// use of String formatting for better view:
		System.out.printf("%-10s %-10s %-12s%n", "Total-Student", "Present", "Absent");
		System.out.println("---------------------------------");
		System.out.printf("%-15d %-10d %-12d%n", 10, presentCount, absentCount);
		System.out.println("=================================");
	}
}
		