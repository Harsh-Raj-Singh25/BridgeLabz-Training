package com.streams.readFromConsole;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputStorage {
	public static void main(String[] args) {
		// Initialize BufferedReader to read from the Console (System.in)
		// We wrap System.in in an InputStreamReader to convert bytes to characters
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("user_profile.txt"))) {

			// Ask for User Input
			System.out.print("Enter your name: ");
			String name = reader.readLine();

			System.out.print("Enter your age: ");
			String age = reader.readLine();

			System.out.print("Enter your favorite programming language: ");
			String language = reader.readLine();

			// Construct the data string
			String profileData = String.format("--- User Profile ---\nName: %s\nAge: %s\nFavorite Language: %s\n", name,
					age, language);

			//  Write to file
			writer.write(profileData);

			System.out.println("\n Success: Information saved to 'user_profile.txt'");

		} catch (IOException e) {
			System.err.println(" An error occurred while handling data: " + e.getMessage());
		}
	}
}
