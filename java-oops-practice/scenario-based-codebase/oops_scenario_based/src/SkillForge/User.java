package SkillForge;

//BASE CLASS: General User properties
abstract class User {
	private String name;
	private String userId;

	public User(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public abstract void showDashboard();
}

