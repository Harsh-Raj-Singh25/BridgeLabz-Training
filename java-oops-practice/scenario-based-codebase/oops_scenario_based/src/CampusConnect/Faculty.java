package CampusConnect;

//INHERITANCE: Faculty class
class Faculty extends Person {
	private String department;

	public Faculty(String name, String email, String id, String department) {
		super(name, email, id);
		this.department = department;
	}

	@Override
	public void printDetails() {
		System.out.println("FACULTY PROFILE [" + getId() + "]");
		System.out.println("Name: " + getName() + " | Dept: " + department);
		System.out.println("Contact: " + getEmail());
	}
}