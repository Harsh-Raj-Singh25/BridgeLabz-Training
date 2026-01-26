package com.regex.basic;

import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us", "Gemini_Flash_3", "Very_Long_Username_Exceeding_Limit"};
        
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        System.out.println("--- Username Validation Results ---");
        for (String username : testUsernames) {
            boolean isValid = Pattern.matches(regex, username);
            System.out.printf("%-35s -> %s\n", "\"" + username + "\"", (isValid ? "Valid" : " Invalid"));
        }
    }
}