import java.util.Scanner;

public class Quadratic {
	
	// Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Formula: delta = b^2 - 4ac 
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            return new double[0]; // Empty array for negative delta
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{root1, root2};
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking user input
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
		
		// using if-else-if ladder to check for roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots (delta is negative).");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
        sc.close();
    }

    
}