package FitTrackApplication;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private double dailyCalorieTarget;

	UserProfile(String name, int age, double weight, double goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyCalorieTarget = goal;
	}

	UserProfile(String name, int age, double weight) {
		this(name, age, weight, 2000.0);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getDailyCalorieTarget() {
		return dailyCalorieTarget;
	}

	public void setDailyCalorieTarget(double goal) {
		this.dailyCalorieTarget = goal;
	}

}
