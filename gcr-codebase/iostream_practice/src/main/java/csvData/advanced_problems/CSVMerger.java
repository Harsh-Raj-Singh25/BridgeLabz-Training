package csvData.advanced_problems;

import java.io.*;
import java.util.*;

public class CSVMerger {
	public static void main(String[] args) throws Exception {
		Map<String, String> studentDetails = new HashMap<>();

		// Read file 1 into Map
		BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
		br1.readLine();
		String line;
		while ((line = br1.readLine()) != null) {
			String[] d = line.split(",");
			studentDetails.put(d[0], d[1] + "," + d[2]); // ID -> Name, Age
		}
		br1.close();

		// Merge with file 2
		BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
		PrintWriter pw = new PrintWriter(new FileWriter("merged.csv"));
		pw.println("ID,Name,Age,Marks,Grade");
		br2.readLine();
		while ((line = br2.readLine()) != null) {
			String[] d = line.split(",");
			if (studentDetails.containsKey(d[0])) {
				pw.println(d[0] + "," + studentDetails.get(d[0]) + "," + d[1] + "," + d[2]);
			}
		}
		pw.close();
		br2.close();
		System.out.println(" Files Merged Successfully!");
	}
}