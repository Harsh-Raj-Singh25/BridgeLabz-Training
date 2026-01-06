package CampusConnect;

import java.util.ArrayList;
import java.util.List;

//INHERITANCE: Student class with Encapsulation
class Student extends Person implements ICourseActions {
	// ENCAPSULATION: Grades are private for privacy
	private List<Double> grades;

	public Student(String name, String email, String id) {
		super(name, email, id);
		this.grades = new ArrayList<>();
	}

	public void addGrade(double grade) {
		if (grade >= 0 && grade <= 100) {
			grades.add(grade);
		}
	}

	// OPERATORS: Calculating GPA
	public double calculateGPA() {
		if (grades.isEmpty())
			return 0.0;
		double sum = 0;
		for (double g : grades) {
			sum += g; // Operator: Addition
		}
		// Logic: Convert 100-point scale to 4.0 scale
		return (sum / grades.size()) / 25.0; // Operators: Division
	}

	@Override
	public void enrollCourse(Course course) {
		course.addStudent(this);
		System.out.println(getName() + " enrolled in " + course.getCourseName());
	}

	@Override
	public void dropCourse(Course course) {
		System.out.println(getName() + " dropped " + course.getCourseName());
	}

	@Override
	public void printDetails() {
		System.out.println("STUDENT PROFILE [" + getId() + "]");
		System.out.println("Name: " + getName() + " | GPA: " + String.format("%.2f", calculateGPA()));
		System.out.println("Email: " + getEmail());
	}
}
