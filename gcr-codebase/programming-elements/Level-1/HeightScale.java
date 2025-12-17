import java.util.*;
public class HeightScale{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the height in centimeters: ");
		int height=sc.nextInt();
		// height in inches [ 1 inch =2.54 cm] 
		double height_inch=(double) height/2.54;
		// height in feet
		double height_feet=height_inch/12;
		
		//Printing the height in different units
		System.out.println("Your Height in cm is " + height +" while in feet is "+ height_feet+" and inches is "+ height_inch);
	}
}