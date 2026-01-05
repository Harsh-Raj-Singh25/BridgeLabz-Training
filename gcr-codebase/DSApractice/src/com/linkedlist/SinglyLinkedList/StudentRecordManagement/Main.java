package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding Records
        list.addLast(101, "Harsh Singh", 20, "A");
        list.addLast(102, "Namrata Khapre", 21, "B");
        list.addFirst(100, "Anand", 19, "A+");

        // Display current records
        list.display();

        // Update Grade for Harsh
        list.updateGrade(101, "A+");

        // Delete Namrata's record
        list.deleteByRoll(102);

        // Final Display
        list.display();
    }
}