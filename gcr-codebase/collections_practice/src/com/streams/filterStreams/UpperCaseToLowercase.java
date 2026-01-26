package com.streams.filterStreams;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class UpperCaseToLowercase {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\source.txt");
        File destination = new File("output_lowercase.txt");

        //  Ensure the source file exists
        if (!source.exists()) {
            System.out.println(" Error: File not found. Please create it first.");
            return;
        }

        //  Use try-with-resources for automatic closing and character encoding
        // StandardCharsets.UTF_8 ensures we handle special characters correctly
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(source), StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(destination), StandardCharsets.UTF_8))) {

            String line;
            System.out.println(" Reading and converting text...");

            // Read line by line
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and write
                writer.write(line.toLowerCase());
                writer.newLine(); // Maintain original line structure
            }

            System.out.println(" Success! Lowercase content saved to: " + destination.getName());

        } catch (IOException e) {
            System.err.println(" An I/O error occurred: " + e.getMessage());
        }
    }
}
