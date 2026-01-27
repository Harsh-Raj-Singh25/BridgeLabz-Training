package csvData.basic_problems;

import java.io.*;

public class CountRows {
    public static void main(String[] args) {
        String path = "C:\\\\Users\\\\HP5CD\\\\Desktop\\\\BridgeLabz-Training\\\\gcr-codebase\\\\iostream_practice\\\\src\\\\main\\\\java\\\\csvData\\\\student.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Read first line (header) and do nothing with it
            String header = br.readLine();
            
            if (header != null) {
                while (br.readLine() != null) {
                    count++;
                }
            }
            
            System.out.println("Total records (excluding header): " + count);
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
