package com.objectModeling.level1.UniversityManagement;

//Professor Class
//Relationship: Association with Course.
public class Professor {
    private String name;
    private String specialization;

    public Professor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    
     //Communication: Professor interacts with a Course object.
     
    public void teachCourse(Course course) {
        System.out.println("Professor " + name + " is now teaching: " + course.getCourseName());
        course.assignProfessor(this);
    }

    public void announce(String message) {
        System.out.println("[Professor " + name + " says]: " + message);
    }
}