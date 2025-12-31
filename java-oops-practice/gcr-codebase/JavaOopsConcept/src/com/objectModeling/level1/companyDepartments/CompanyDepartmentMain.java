package com.objectModeling.level1.companyDepartments;

public class CompanyDepartmentMain {
    public static void main(String[] args) {
        // Create the Company
        Company myCorp = new Company("HRS Tech Solutions");

        //Create Departments through the Company
        myCorp.createDepartment("Management");
        myCorp.createDepartment("Human Resources");

        //Add Employees through the Departments
        myCorp.getDepartment(0).addEmployee("Harsh Raj Singh", "CEO");
        myCorp.getDepartment(0).addEmployee("Namrata Khapre", "MD");
        
        myCorp.getDepartment(1).addEmployee("Rahul Verma", "HR Manager");

        //Show the whole structure
        myCorp.showStructure();

        //Demonstrate Composition
        System.out.println("\n[Logic]: Setting 'myCorp' to null...");
        myCorp = null; 
        
        System.out.println("[Observation]: Now, there is no way to access the Departments or ");
        System.out.println("Employees. They will be removed by the Garbage Collector.");
    }
}