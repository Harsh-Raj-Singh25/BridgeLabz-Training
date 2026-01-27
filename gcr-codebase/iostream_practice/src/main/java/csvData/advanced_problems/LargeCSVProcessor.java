package csvData.advanced_problems;

import java.io.*;

public class LargeCSVProcessor {
	public static void main(String[] args) {
		int chunkSize = 100;
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/csvData/student.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				count++;
				// Process line here...
				if (count % chunkSize == 0) {
					System.out.println("Processed " + count + " lines...");
				}
			}
			System.out.println(" Final Count: " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}