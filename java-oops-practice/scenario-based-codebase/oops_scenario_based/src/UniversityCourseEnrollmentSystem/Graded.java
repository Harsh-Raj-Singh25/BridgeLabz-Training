package UniversityCourseEnrollmentSystem;

//INTERFACE: Defines the contract for grading behavior
interface Graded {
	// ABSTRACTION: The interface doesn't care HOW the grade is calculated,
	// just that it must be assigned.
	void assignGrade(double marks);
}
