import java.util.*;
public class EmployeeBonus{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		//Taking salary and year of service from the user
        System.out.println("Enter your salary");
		int salary=sc.nextInt();
		System.out.println("Enter the year of service");
		int year=sc.nextInt();
		//initialize the bonus 
		int bonus=0;
		//check whether the employee's year of service is more than 5 years 
		//and calculating the bonuses i.e., 5% 
		if(year>5){
			bonus=salary * 5/100;
		}
		
		// Print the bonus that the employee will receive
		System.out.println("Based on year of service, your bonus amount is : " +bonus );		
		
	}
}