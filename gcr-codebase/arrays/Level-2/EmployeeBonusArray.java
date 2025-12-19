import java.util.*;
public class EmployeeBonusArray{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		// Constants and arrays as per the hints
        int numEmployee = 10;
        double[] oldSalary = new double[numEmployee];
        double[] yearsOfService = new double[numEmployee];
        double[] newSalaries = new double[numEmployee];
        double[] bonusAmounts = new double[numEmployee];
		// variables
		double totalBonus=0.0;
		double totalOldSalary=0.0;
		double totalNewSalary=0.0;
		
		// Loop to take input and perform validation:-
		for (int i = 0; i < numEmployee; i++) {
            System.out.println("\nEnter details for the Employee " + (i + 1) + ":");
            
            System.out.print("Enter your Salary: ");
            double salaryInput = sc.nextDouble();
            
            System.out.print("Enter your Years of Service: ");
            double serviceInput = sc.nextDouble();

            // Check for the positive numbers
            if (salaryInput <= 0 || serviceInput < 0) {
                System.out.println("Invalid input! Please re-enter it ");
                i--; 
            } else {
                oldSalary[i] = salaryInput;
                yearsOfService[i] = serviceInput;
            }
        }
		//  Loop to calculate bonuses and total
        for (int i = 0; i < numEmployee; i++) {
            double bonusPercentage;
            
            // Logic: 5% if service > 5 years, 2% otherwise
            if (yearsOfService[i] > 5) {
                bonusPercentage = 0.05;
            } else {
                bonusPercentage = 0.02;
            }

            bonusAmounts[i] = oldSalary[i] * bonusPercentage;
            newSalaries[i] = oldSalary[i] + bonusAmounts[i];

            // Accumulate totals
            totalBonus += bonusAmounts[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalaries[i];
        }	
		
		// Display the results
		System.out.println("total old salary paid: "+ totalOldSalary);
		System.out.println(" total bonus paid : "+ totalBonus);
		System.out.println(" total New salary payout :" + totalNewSalary);	
		
	}
}