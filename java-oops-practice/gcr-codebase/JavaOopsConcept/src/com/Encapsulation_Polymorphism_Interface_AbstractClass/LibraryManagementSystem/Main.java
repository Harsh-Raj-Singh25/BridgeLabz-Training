package com.Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: List of LibraryItem can hold any subclass object
        List<LibraryItem> libraryCatalog = new ArrayList<>();

        // Adding different types of items
        libraryCatalog.add(new Book("B101", "Clean Code", "Robert C. Martin"));
        libraryCatalog.add(new Magazine("M202", "Tech Today", "HarshCodes"));
        libraryCatalog.add(new Book("B103", "Design Patterns", "Gang of Four"));

        System.out.println("======= LIBRARY MANAGEMENT SYSTEM =======");

        for (LibraryItem item : libraryCatalog) {
            System.out.println("\n--- Processing Item ---");
            
            // Common behavior (Concrete method from Superclass)
            item.getItemDetails();

            //Polymorphic behavior (Abstract method implemented in Subclasses)
            System.out.println("Standard Loan Duration: " + item.getLoanDuration() + " days");

            //Interface behavior (Check if the item is Reservable)
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item; // Downcasting
                
                System.out.println("Status: This item is reservable.");
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("Harsh Singh");
                } else {
                    System.out.println("Notice: Item is already reserved.");
                }
            } else {
                System.out.println("Status: This item (Magazine/Other) cannot be reserved.");
            }
            
            System.out.println("-----------------------------------------");
        }
    }
}