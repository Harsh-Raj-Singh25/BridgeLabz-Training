package csvData.basic_problems;

import java.io.*;

public class EmployeeCSVWriter {
    public static void main(String[] args) {
        String[][] employees = {
            {"101", "Alice", "IT", "75000"},
            {"102", "Bob", "HR", "60000"},
            {"103", "Charlie", "Finance", "80000"},
            {"104", "David", "Marketing", "55000"},
            {"105", "Eve", "Operations", "68000"}
        };
        // we use printwriter because its inBuilt and don't need any addition of jar files
        try (PrintWriter writer = new PrintWriter(new File("src/main/java/csvData/employees.csv"))) {
            // Write Header
            writer.println("ID,Name,Department,Salary");

            // Write Records
            for (String[] emp : employees) {
                writer.println(String.join(",", emp));
            }
            System.out.println("Data successfully written to employees.csv");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}