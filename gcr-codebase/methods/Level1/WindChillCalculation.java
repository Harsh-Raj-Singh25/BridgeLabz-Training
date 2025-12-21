import java.util.Scanner;

public class WindChillCalculation {
	// Creating a method to check the numbers
	public double calculateWindChill(double temperature, double windSpeed){
		// calculate the windChill using the formula
		double windChill=35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
		// return the value
		return windChill;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter the temaperature and windSpeed ");
		int temperature=sc.nextInt();
		int windSpeed=sc.nextInt();
		
		// creating an object
		WindChillCalculation calculator=new WindChillCalculation();
		
		// displaying the results 
		System.out.println(" the wind chill temperature is : " + calculator.calculateWindChill(temperature,  windSpeed));
	}
}