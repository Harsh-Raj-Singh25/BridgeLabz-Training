package csvData.intermediate_problems;

import java.io.*;
import java.util.*;
/*
7️. Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.

 */
public class SalarySorter {
    public static void main(String[] args) {
        List<String[]> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/csvData/employees.csv"))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line.split(","));
            }

            // Sort by Salary (Index 3) descending
            employees.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

            System.out.println(" Top 5 Highest Paid Employees:");
            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                String[] emp = employees.get(i);
                System.out.println(emp[1] + " | " + emp[2] + " | Rs." + emp[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}