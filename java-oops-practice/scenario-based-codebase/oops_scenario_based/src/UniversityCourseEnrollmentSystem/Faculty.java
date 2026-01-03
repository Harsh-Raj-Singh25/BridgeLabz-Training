package UniversityCourseEnrollmentSystem;

//FACULTY CLASS: Acts as the controller that interacts with Graded objects
class Faculty {
	private String facultyName;

	public Faculty(String name) {
		this.facultyName = name;
	}

	// This method demonstrates POLYMORPHISM: It accepts any object that 'is-a'
	// Graded
	public void evaluateStudent(Graded student, double marks) {
		System.out.println("Faculty " + facultyName + " is evaluating...");
		student.assignGrade(marks);
	}
}