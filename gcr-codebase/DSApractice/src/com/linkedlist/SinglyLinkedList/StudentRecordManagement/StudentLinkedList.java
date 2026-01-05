package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

class StudentLinkedList {
    private StudentNode head;

    // ADD: At the Beginning
    public void addFirst(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Record added at the beginning.");
    }

    // ADD: At the End
    public void addLast(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Record added at the end.");
    }

    // DELETE: By Roll Number
    public void deleteByRoll(int roll) {
        if (head == null) return;

        // If the student to be deleted is the head
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Roll Number " + roll + " deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Roll Number " + roll + " deleted.");
        } else {
            System.out.println("Roll Number not found.");
        }
    }

    // SEARCH & UPDATE
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll No: " + roll);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    //  DISPLAY ALL
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        StudentNode temp = head;
        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + " | Name: " + temp.name + 
                               " | Age: " + temp.age + " | Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}