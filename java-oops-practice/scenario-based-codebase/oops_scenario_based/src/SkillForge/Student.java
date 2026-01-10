package SkillForge;

class Student extends User {
	private double currentProgress = 0.0;

	public Student(String name, String userId) {
		super(name, userId);
	}

	@Override
	public void showDashboard() {
		System.out.println("Student Dashboard: Current Progress: " + currentProgress + "%");
	}
}
