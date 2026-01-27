package csvData.intermediate_problems;
/*
 * Intermediate Problems
4️⃣ Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
 */
import java.io.*;

public class StudentFilter {
    public static void main(String[] args) {
        String file = "C:\\\\Users\\\\HP5CD\\\\Desktop\\\\BridgeLabz-Training\\\\gcr-codebase\\\\iostream_practice\\\\src\\\\main\\\\java\\\\csvData\\\\student.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            System.out.println(" Students with Marks > 80:");
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3].trim());
                
                if (marks > 80) {
                    System.out.println(data[1] + " - " + marks);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}