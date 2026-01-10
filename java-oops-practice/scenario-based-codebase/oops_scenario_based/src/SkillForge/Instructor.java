package SkillForge;

//INHERITANCE: Specialized User types
class Instructor extends User {
	public Instructor(String name, String userId) {
		super(name, userId);
	}

	@Override
	public void showDashboard() {
		System.out.println("Instructor Dashboard: Manage Uploads & Reviews.");
	}
}
