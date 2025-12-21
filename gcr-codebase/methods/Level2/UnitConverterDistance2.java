import java.util.Scanner;

public class UnitConverterDistance2 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// using the methods:
        System.out.print("Enter yards: ");
        double y = sc.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(y));
		
		System.out.print("Enter feet: ");
        double f = sc.nextDouble();
        System.out.println("yards: " + convertFeetToYards(f));
		
		System.out.print("Enter meters: ");
        double m = sc.nextDouble();
        System.out.println("inches: " + convertMetersToInches(m));
		
		System.out.print("Enter inches: ");
        double i = sc.nextDouble();
        System.out.println("meters: " + convertInchesToMeters(i));

        System.out.print("Enter inches: ");
        double in = sc.nextDouble();
        System.out.println("CM: " + convertInchesToCm(in));

        sc.close();
    }
}