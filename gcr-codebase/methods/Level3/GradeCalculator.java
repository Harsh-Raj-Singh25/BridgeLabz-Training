import java.util.*;

// program to generate scorecard for students with grades and remarks
// Compute the total, average, and the percentage score
public class GradeCalculator {
    private static final Random RAND = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int numStudents = sc.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
	// generate random scores for students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + RAND.nextInt(90);
            scores[i][1] = 10 + RAND.nextInt(90);
            scores[i][2] = 10 + RAND.nextInt(90);
        }
        return scores;
    }
	// calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
	// determine grade based on percentage
    private static String determineGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        if (percentage >= 70)
            return "B";
        if (percentage >= 60)
            return "C";
        if (percentage >= 50)
            return "D";
        if (percentage >= 40)
            return "E";
        return "R";
    }
	// remarks based on grade
    private static String gradeRemarks(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, approaching agency-normalized standards";
            case "D":
                return "Level 1, below agency-normalized standards";
            case "E":
                return "Level 1, too below agency-normalized standards";
            default:
                return "Remedial standards";
        }
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
    // Create a Format String for consistent column widths
    String format = "%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-8s %-30s%n";
    String dataFormat = "%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-12.2f %-8s %-30s%n";

    //Print the Header using the format string
    System.out.printf(format, 
            "Student", "Physics", "Chemistry", "Math", "Total", 
            "Average", "Percentage", "Grade", "Remarks");
    
    System.out.println("----------------------------------------------------------------------------------------------------------");

    for (int i = 0; i < scores.length; i++) {
        String grade = determineGrade(results[i][2]);
        String remarks = gradeRemarks(grade);

        // 3. Print the Data using the dataFormat string
        System.out.printf(dataFormat,
                (i + 1),         // %-10d
                scores[i][0],    // %-10d
                scores[i][1],    // %-10d
                scores[i][2],    // %-10d
                results[i][0],   // %-10.2f
                results[i][1],   // %-10.2f
                results[i][2],   // %-12.2f
                grade,           // %-8s
                remarks);        // %-30s
    }
}
}