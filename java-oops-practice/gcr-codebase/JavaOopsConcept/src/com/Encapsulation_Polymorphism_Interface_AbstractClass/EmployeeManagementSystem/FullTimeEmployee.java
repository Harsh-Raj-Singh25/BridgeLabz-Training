package com.Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0); // Base salary is 0, calculated purely on hours
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}