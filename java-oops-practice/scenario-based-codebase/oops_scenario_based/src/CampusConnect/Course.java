package CampusConnect;
import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseCode;
    private String courseName;
    private Faculty assignedFaculty;
    private List<Student> enrolledStudents;

    public Course(String code, String name, Faculty faculty) {
        this.courseCode = code;
        this.courseName = name;
        this.assignedFaculty = faculty;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student s) {
        enrolledStudents.add(s);
    }

    public String getCourseName() {
    	return courseName; 
    }

    public void displayCourseSummary() {
        System.out.println("\nCOURSE: " + courseName + " (" + courseCode + ")");
        System.out.println("Taught by: " + assignedFaculty.getName());
        System.out.println("Total Students: " + enrolledStudents.size());
    }
}