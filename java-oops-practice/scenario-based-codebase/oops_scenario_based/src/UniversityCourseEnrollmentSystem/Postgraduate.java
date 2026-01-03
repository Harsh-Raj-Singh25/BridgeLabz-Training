package UniversityCourseEnrollmentSystem;

//INHERITANCE: Postgraduate specialization
class Postgraduate extends Student implements Graded {
	private String researchTopic;

	public Postgraduate(String id, String name, String topic) {
		super(id, name, "Advanced Research");
		this.researchTopic = topic;
	}

	@Override
	public void assignGrade(double marks) {
		// POLYMORPHISM & LOGIC: PG students might have stricter grading
		// GPA = (Marks / 25) * 0.9 (Adjusted for higher difficulty)
		double calculatedGpa = (marks / 25.0) * 0.9;
		setGpa(calculatedGpa);
		System.out.println("Grade assigned for Postgraduate (Research: " + researchTopic + ")");
	}
}