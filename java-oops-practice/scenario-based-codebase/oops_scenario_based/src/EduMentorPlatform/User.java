package EduMentorPlatform;

// user base class 
public class User {
	public String name;
	protected String email;
	private String userID;
	// constructor
	User(String name, String email, String userID){
		this.email=email;
		this.name=name;
		this.userID=userID;
	}
	// getter and setter  for private userID
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
}
