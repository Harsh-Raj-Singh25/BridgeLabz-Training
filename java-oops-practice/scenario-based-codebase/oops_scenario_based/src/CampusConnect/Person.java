package CampusConnect;

//BASE CLASS: Contains shared attributes for all users
abstract class Person {
	private String name;
	private String email;
	private String id;

	public Person(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	// Getters for shared data
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	// POLYMORPHISM: Abstract method to be implemented by Student/Faculty
	public abstract void printDetails();
}
