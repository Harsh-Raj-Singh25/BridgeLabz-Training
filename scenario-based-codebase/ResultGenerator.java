import java.util.*;
// This program generates results based on marks entered for 5 subjects.
public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfSubjects = 5;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("marks " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double average = totalMarks / (double) numberOfSubjects;
        System.out.println("total Marks: " + average);

        String grade;
        switch ((int) average / 10) {
            case 9:
            case 10:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}