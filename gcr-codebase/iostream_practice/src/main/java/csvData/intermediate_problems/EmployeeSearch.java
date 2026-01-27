package csvData.intermediate_problems;

import java.io.*;
import java.util.Scanner;
/*
 * Intermediate Problems
5️. Search for a Record in CSV
Read an employees.csv file and search for an employee by name.
Print their department and salary.

 */
public class EmployeeSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name to search: ");
		String searchName = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/csvData/employees.csv"))) {
			String line;
			boolean found = false;
			br.readLine(); // Skip header

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if (data[1].equalsIgnoreCase(searchName)) {
					System.out.println(" !! Found: Dept: " + data[2] + ", Salary: Rs." + data[3]);
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println(" Employee not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}