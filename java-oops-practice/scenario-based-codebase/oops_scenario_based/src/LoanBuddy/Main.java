package LoanBuddy;
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("       Welcome to LoanBuddy            ");
		System.out.println("========================================");
		// Application details
		System.out.println("Enter Applicant Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter creditScore:");
		int creditScore=sc.nextInt();
		
		System.out.println("Enter Monthly Income:");
		double income=sc.nextDouble();
		
		System.out.println("Enter Loan Amount :");
		double loanAmount=sc.nextDouble();
		
		Applicant applicant=new Applicant(name, creditScore, income, loanAmount);
		
		System.out.println("Enter your loan type");
		System.out.println("1. Home Loan");
		System.out.println("2. Auto Loan");
		
		int choice=sc.nextInt();
		System.out.println("Enter Loan terms (months) :");
		int term =sc.nextInt();
		
		LoanApplication loan=null;
		
		if(choice==1) {
			loan=new HomeLoan(applicant, term);
		}else if(choice==2) {
			 loan =new AutoLoan(applicant, term);
		}else {
			System.out.println("Invalid loan selection");
			sc.close();
			return;
		}
		boolean approved=loan.approveLoan();
		
		System.out.println("--------------------------------------------------");
		System.out.println("Loan Status:" + (approved ? "APPROVED" :"REJECTED"));
		
		if(approved) {
			System.out.println("Monthly EMI :"+loan.calculateEMI());
		}
	}
}
