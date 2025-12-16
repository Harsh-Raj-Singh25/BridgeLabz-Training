import java.util.*;
public class CelsiusToFahrenheit{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter temperature in Celsius");
		double CELSIUS=scanner.nextDouble();
		double FAHRENHEIT = (CELSIUS * 9.0 / 5.0) + 32;
		//Output
		System.out.println(CELSIUS+ "°C is equal to " + FAHRENHEIT + "°F");

        scanner.close();
	}
}