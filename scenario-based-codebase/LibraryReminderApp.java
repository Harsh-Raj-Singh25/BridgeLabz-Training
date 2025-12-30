/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class LibraryReminderApp{
	public static void fineCalculator(LocalDate returnDate,LocalDate dueDate){
		long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
		int fine=0;
		if (daysLate > 0) {
			fine = (int) (daysLate * 5);
			System.out.println("IT'S LATE !!! You must pay now.\n Total Fine to be paid: "+fine); 
		}else{
			System.out.println("IT'S NOT LATE!!! You need not to worry.");
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("----WELCOME TO THE LIBRARY REMINDER APP----");
		//Repeat for 5 books using for-loop
		for (int i = 1; i <= 5; i++) {
			// take user input for dates
			System.out.print(i+". Book return date (yyyy-MM-dd) : ");
			// using data type localDate and the time package;
			LocalDate returnDate = LocalDate.parse(sc.next());
			System.out.print(i+". Book due date (yyyy-MM-dd) : ");
			LocalDate dueDate = LocalDate.parse(sc.next());
			
			// calculating the fine and displaying the results:
			fineCalculator(returnDate,dueDate);
			System.out.println();
		}
		sc.close();
	}
}
			
	