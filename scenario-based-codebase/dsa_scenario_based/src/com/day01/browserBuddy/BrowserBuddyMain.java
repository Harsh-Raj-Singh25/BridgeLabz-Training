package com.day1.browserBuddy;

import java.util.Scanner;

public class BrowserBuddyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize the browser with a homepage
        TabManager browser = new TabManager("google.com");
        
        System.out.println("===  Welcome to BrowserBuddy ===");
        
        boolean running = true;
        while (running) {
            System.out.println("\n----------------------------------");
            System.out.println("1. Visit Page | 2. Back | 3. Forward");
            System.out.println("4. Close Tab  | 5. Restore Tab | 6. Exit");
            System.out.print("Action: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Buffer fix
            
            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visit(url);
                    break;
                    
                case 2:
                    browser.back();
                    break;
                    
                case 3:
                    browser.forward();
                    break;
                    
                case 4:
                    browser.closeTab();
                    break;
                    
                case 5:
                    browser.reopenClosedTab();
                    break;
                    
                case 6:
                    running = false;
                    System.out.println("Closing BrowserBuddy...");
                    break;
                    
                default:
                    System.out.println(" Invalid Choice!");
            }
        }
        sc.close();
    }
}
