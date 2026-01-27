package csvData.advanced_problems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.*;
import java.util.*;

public class JsonCsvConverter {
	private static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		try {
			// Use the relative path from the project root
			String jsonFile = "src/main/java/csvData/students.json";
			String csvFile = "src/main/java/csvData/students_converted.csv";
			String backToJsonFile = "src/main/java/csvData/students_restored.json";

			jsonToCsv(jsonFile, csvFile);
			System.out.println(" Conversion Complete!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads a JSON array of objects and writes them to a CSV file.
	 */
	public static void jsonToCsv(String jsonPath, String csvPath) throws Exception {
		// Read JSON as a List of Maps (each map is one student)
		List<Map<String, Object>> list = mapper.readValue(new File(jsonPath), List.class);
		if (list.isEmpty())
			return;

		try (PrintWriter writer = new PrintWriter(new File(csvPath))) {
			// Get Headers from the keys of the first object
			Set<String> headers = list.get(0).keySet();
			writer.println(String.join(",", headers));

			// Write Data Rows
			for (Map<String, Object> map : list) {
				List<String> row = new ArrayList<>();
				for (String header : headers) {
					row.add(String.valueOf(map.get(header)));
				}
				writer.println(String.join(",", row));
			}
		}
	}

	/**
	 * Reads a CSV file and converts it back into a formatted JSON array.
	 */
	public static void csvToJson(String csvPath, String jsonPath) throws Exception {
		List<Map<String, String>> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
			String headerLine = br.readLine();
			if (headerLine == null)
				return;
			String[] headers = headerLine.split(",");

			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Map<String, String> map = new LinkedHashMap<>(); // Keep order
				for (int i = 0; i < headers.length; i++) {
					map.put(headers[i], values[i]);
				}
				list.add(map);
			}
		}

		// Write to JSON file with Pretty Printing
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.writeValue(new File(jsonPath), list);
	}
}