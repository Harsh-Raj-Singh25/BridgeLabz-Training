import java.util.*;
public class Temperature {
    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// take user input
        System.out.print("temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
		// use of method
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        System.out.print("temperature in Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

        scanner.close();
    }
}