package com.Inheritance.Hierarchical_Inheritance.SchoolSystem;

public class Main {
	public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Harsh", 30, "Java Development");
        Student s1 = new Student("Rahul", 20, "A+");
        Staff st1 = new Staff("Sanya", 35, "Administration");

        System.out.println("--- School Directory ---");
        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
