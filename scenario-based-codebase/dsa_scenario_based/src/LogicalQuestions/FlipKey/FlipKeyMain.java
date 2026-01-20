package LogicalQuestions.FlipKey;

import java.util.Scanner;

public class FlipKeyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(" Enter your String :");
			String word = sc.nextLine();
			String result = StringManipulation.CleanseAndInvert(word);
			if (result.length() <= 0) {
				System.out.println(" Invalid input ");
			} else {
				System.out.println("The generated key is : <" + result+">");
			}
		}
		
	}
}
