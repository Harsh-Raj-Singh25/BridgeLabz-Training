package UniversityCourseEnrollmentSystem;

//INHERITANCE: Undergraduate specialization
class Undergraduate extends Student implements Graded {
	public Undergraduate(String id, String name) {
		super(id, name);
	}

	@Override
	public void assignGrade(double marks) {
		// POLYMORPHISM & OPERATORS: Simple Letter Grading logic
		// GPA = Marks / 25 (Assuming 100 marks scale to 4.0 GPA)
		double calculatedGpa = marks / 25.0;
		setGpa(calculatedGpa);
		System.out.println("Grade assigned for Undergraduate: " + getName());
	}
}