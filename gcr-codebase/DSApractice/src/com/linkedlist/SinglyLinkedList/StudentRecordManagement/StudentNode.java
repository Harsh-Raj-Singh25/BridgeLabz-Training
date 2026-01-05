package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

class StudentNode {
    // Student Information
    int rollNumber;
    String name;
    int age;
    String grade;

    // Pointer to the next student in the list
    StudentNode next;

    // Constructor to initialize student data
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
