package myBank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   WELCOME TO MYBANK DIGITAL [HRS GROUP]       ");
        System.out.println("==============================================");

        // Initializing accounts using Constructors
        Account mySavings = new SavingsAccount("SAV-9988", 5000.0);
        Account myBusiness = new CurrentAccount("CUR-1122", 25000.0);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account ");
        System.out.print("Select account to manage: ");
        int choice = sc.nextInt();

        // POLYMORPHISM: Storing specific account in a base class reference
        Account activeAccount = (choice == 1) ? mySavings : myBusiness;

        System.out.println("\nActive Account: " + activeAccount.getAccountNumber());
        
        // Performing Transactions via INTERFACE methods
        System.out.println("What you wanna do:-");
        System.out.println("1. deposit");
        System.out.println("2. Withdraw");
        int ch=sc.nextInt();
        if(ch==1) {
        	System.out.println("enter the amount you wanna deposit:");
        	double amount=sc.nextDouble();
        	activeAccount.deposit(amount);
        }else {
        	System.out.println("enter the amount you wanna withdraw:");
        	double amount=sc.nextDouble();
        	activeAccount.withdraw(amount);
        }
        
        // Demonstrating Polymorphic Interest calculation
        activeAccount.calculateInterest();

        System.out.println("----------------------------------------------");
        activeAccount.checkBalance();

        sc.close();
    }
}