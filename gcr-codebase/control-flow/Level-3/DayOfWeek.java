import java.util.*;
public class DayOfWeek{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take date as input
        System.out.println("Enter your date credential: month, day, year");
		int month=s.nextInt();
		int day=s.nextInt();
		int year=s.nextInt();
		
		// Calculating the day using the Formulas:
		double y=(double) year- (14- month) / 12;
		double x= (double) y+ y/4 - y/100 + y/400;
		double m = month + 12 * ((14- month) / 12)- 2;
		double d = (day + x + (31*m) / 12) % 7;
		
		//print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth
		System.out.println("Your day of the week is " +(int)d);
		
	}
}