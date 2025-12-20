import java.util.Scanner;

public class MaxHandshakes {
	
	// Creating a method for calculating the number of Handshakes
	public double handshakes(double numberOfStudents){
		double handshakesCount= (numberOfStudents * (numberOfStudents-1)) / 2;
		return handshakesCount;
	}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Take user input for number of students
		System.out.println("Enter the number of students ");
		double numberOfStudents=sc.nextDouble();
		// Create an object handshakesCount
		MaxHandshakes handshakesCounter=new MaxHandshakes();
		// counting the number of handhshakes
		double handshakesCount=handshakesCounter.handshakes(numberOfStudents);
		
		// Display the number of hanshakes
		System.out.println(" Maximum number of possible handhshakes are : "+ handshakesCount);
		sc.close();
	}
}