package csvData.advanced_problems;

import java.io.*;
import java.util.*;

public class DuplicateDetector {
	public static void main(String[] args) throws Exception {
		Set<String> ids = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/csvData/student.csv"))) {
			br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
				String id = line.split(",")[1]; // using column 2 to check duplicate elements
				if (!ids.add(id)) {
					System.out.println("!!! Duplicate found !!! : ID " + id);
				}
			}
		}
	}
}