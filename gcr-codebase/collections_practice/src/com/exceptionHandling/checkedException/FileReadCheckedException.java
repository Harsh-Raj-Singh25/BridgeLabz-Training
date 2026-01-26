package com.exceptionHandling.checkedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCheckedException {

	public static void main(String[] args) {
		// Define the file name
		String fileName = "data.txt";

		// Use a try-catch block to handle the checked exception (IOException)
		try {
			// FileReader and BufferedReader are used for reading text files
			// This is a common pattern for file reading in Java.
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;  
			boolean fileHasContent = false; 

			System.out.println("--- File Contents ---");
			// Read lines from the file until the end
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				fileHasContent = true;
			}
			System.out.println("---------------------");

			// Close the resources
			bufferedReader.close();

			if (!fileHasContent) {
				System.out.println("File exists but is empty.");
			}
			
			// If the file is missing, the catch block will be executed.
		} catch (IOException e) {
			// This block executes if the file is not found (FileNotFoundException is a
			// subclass of IOException)
			// or if any other I/O error occurs while reading.
			System.out.println("File not found");
		}
	}
}
