package EduMentorPlatform;

public class Instructor extends User{
	public String subject;
	private double salary;
	
	Instructor(String name, String email, String userID, String subject, double salary){
		super(name, email, userID);
		this.salary=salary;
		this.subject=subject;
	}
	

}
