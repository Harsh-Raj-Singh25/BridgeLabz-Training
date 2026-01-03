package UniversityCourseEnrollmentSystem;

//BASE CLASS: Represents a general Student
abstract class Student {
	private String studentId;
	private String name;
	private String electivePreference;
	// ENCAPSULATION: GPA is private. It can't be changed by students or external
	// classes.
	private double gpa;

	// CONSTRUCTOR: For students with elective preferences
	public Student(String id, String name, String elective) {
		this.studentId = id;
		this.name = name;
		this.electivePreference = elective;
		this.gpa = 0.0;
	}

	// OVERLOADED CONSTRUCTOR: For students without elective preferences (defaults
	// to "None")
	public Student(String id, String name) {
		this(id, name, "None");
	}

	// ENCAPSULATION:(Getters)
	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	// Protected setter: Only the 'Graded' logic in subclasses can update the GPA
	protected void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void displayTranscript() {
		System.out.println("ID: " + studentId + " | Student: " + name);
		System.out.println("Elective: " + electivePreference + " | Current GPA: " + gpa);
	}
}
