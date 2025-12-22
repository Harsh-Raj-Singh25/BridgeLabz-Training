import java.util.Scanner;

public class BMICalculator {

	// method to determineBMIStatus
    public static String[] determineBMIStatus(double[][] data) {
        String[] statusArray = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            
            if (bmi <= 18.4) {
                statusArray[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statusArray[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statusArray[i] = "Overweight";
            } else {
                statusArray[i] = "Obese";
            }
        }
        return statusArray;
    }
	
	// method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeter = data[i][1] / 100.0; // Convert cm to meter
            data[i][2] = weight / (heightInMeter * heightInMeter);
        }
    }

	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D Array: 10 rows for members, 3 columns (Weight, Height, BMI)
        double[][] personData = new double[10][3];
        
        //  Take user input for weight and height
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nMember " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI and populate the array
        calculateBMI(personData);

        // Determine BMI status
        String[] statuses = determineBMIStatus(personData);

        // Display the results
		for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], statuses[i]);
        }
        
        sc.close();
		
    }

    
    
}