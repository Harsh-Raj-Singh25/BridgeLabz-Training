/* 
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries. 
*/
import java.util.*;
public class NumberGuessingGame{
	// method to generate random number in between the given range:
	public static int numberGuess(int low, int high){
		Random random=new Random();
		int randomNum=random.nextInt(high-low+1)+ low;
		return randomNum;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		// range of guessing number:
		int high=100;
		int low=1;
		// computer guessing the number using the method :
		int randomGuess= numberGuess(low,high);
		// intro message:
		System.out.println("----- Welcome! to the Number Guessing Game -----");
		System.out.println("--- The computer has guessed its number. You have to match that guess!!!---");
		// initialize the attempts:
		int attempts=1;
		do{
			System.out.println("Guess the number : ");
			// user guess:
			int number=sc.nextInt();
			if(number== randomGuess){
				System.out.println("Yeah you guessed it right in "+ attempts+" attempts.\n----- Congratulations -----");
				break;
			}else{
				if(randomGuess>number && (randomGuess-number)>=50){
					System.out.println(" Your guess is too low to match.");
				}else if(randomGuess>number && (randomGuess-number)<50){
					System.out.println(" Your guess is low to match the computer's guess");
				}else if(randomGuess< number && (number - randomGuess)>=50){
					System.out.println(" Your guess is too high to match");
				}else if(randomGuess < number && (randomGuess-number)<50){
					System.out.println(" Your guess is higher than the computer's guess ");
				}
			}
			attempts++;
		}while(attempts<=5);
	}
}
