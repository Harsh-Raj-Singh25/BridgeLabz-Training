//import java.util.Scanner;

public class SpringSeason {
	
	// Creating a method to check the spring season
	public boolean springChecker(int month, int date){
		if(month>3 && month<6){
			return true;
		}else if((month==3 && date>=20) || (month==6 && date<=20) ){
			return true;
		}else{
			return false;
		}
	}

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your month in form of number and date ");
		//int month=sc.nextInt();
		//int date=sc.nextInt();
		int month=Integer.parseInt(args[0]);
		int date=Integer.parseInt(args[1]);
		// creating an object
		SpringSeason check = new SpringSeason();
		// displaying the results using method
		System.out.println("The date and month fall in spring ? "+ check.springChecker(month,date));
		
		//sc.close();
	}
}

