/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/
import java.util.*;
public class OnlineQuiz{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// initializing an array of questions
		String[] questions={
			"A.Which of these is NOT a primitive data type in java?",
			"B. What is the entry point for any Java application?",
			"C.  What is the size of 'int' in Java?",
			"D.Which keyword is used to prevent a method from being overridden by subclasses?",
			"E.Which memory stores the actual objects in Java?"
		};
		// creating a 2-D string array for options:
		String [][] options={
			{"1.int", "2.boolean", "3.String", "4.char"},
			{"1.start() method ","2.init() method","3.main() method","4.run() method"},
			{"1. 16-bit","2.32-bit","3.64-bit","4.128-bit"},
			{"1. static","2.Abstract","3.Final","4.private"},
			{"1. Stack","2.Heap","3. Register","4. Queue"}
		};
		// defining the correct answers
		int [] correctAns={3,3,2,3,2};
		int score=0;
		System.out.println("===== WELCOME TO THE JAVA QUIZ =====");
        System.out.println("Please enter the letter of your choice (A/B/C)\n");
		
		for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(" " + opt);
            }
            
            System.out.print("Your selected option : ");
            int input=sc.nextInt();

            // Using switch to check the answer
            switch (input) {
                case 1:
                case 2:
                case 3:
                    if (input== correctAns[i]) {
                        System.out.println(">> Correct Answer!!\n");
                        score++;
                    } else {
                        System.out.println(">> Wrong!! Correct answer was " + correctAns[i] + "\n");
                    }
                    break;
                default:
                    System.out.println(">> Invalid Input!!! Moving to next question...\n");
            }
        }
		
		// displaying the final results:
		System.out.println("The QUIZ is over");
		System.out.println("====================");
		System.out.println("--FINAL SCORE-Card--");
		System.out.printf("FINAL SCORE: %d/%d%n",score, 5);
		System.out.println("====================");
			
		
	}
}