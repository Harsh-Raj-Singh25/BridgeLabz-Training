import java.util.*;
public class BmiStatus{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take weight and height as input
        System.out.println("Enter your weight in kg");
		double weight=s.nextInt();
		System.out.println("Enter your height in cm");
		double height=s.nextInt();
		// convert height in meters
		double heightInMeters=height/100;
		// calculate the BMI = weight / (height * height)
		double BMI=weight / (heightInMeters * heightInMeters);
		
		// According to the given table, we'll be using if-else-if ladder to determine status
		if(BMI >= 40){
			System.out.println("With " + BMI + " you are Obese");
		}else if(BMI >= 25.0 && BMI < 40){
			System.out.println("With " + BMI + " you are Overweight");
		}else if(BMI > 18.5 && BMI <25){
			System.out.println("With " + BMI + " you are Normal");
		}else{
             System.out.println("With " + BMI + " you are UnderWeight");		
		}
		
		s.close();
	}
}