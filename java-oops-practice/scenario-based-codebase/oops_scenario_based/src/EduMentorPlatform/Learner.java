package EduMentorPlatform;

public class Learner extends User implements ICertifiable  {
	protected String course;
	protected double duration;
	private double rating;
	
	
	Learner(String name, String email, String userID,String course, double rating, double duration){
		super(name, email, userID);
		this.course=course;
		this.rating=rating;
		this.duration=duration;
	}
	// method to calculate percent score of learner
	public static double percent(double total, double count) {
		return total/count * 100;
	}
	 
	public void generateCertificate(String courseID) {
		if(duration>=12) {
			System.out.println("---- Full-time Course----\n You will  get certified in :"+courseID);
		}else {
			System.out.println("---- Short Course----\n You will be getting a short term certificate in :"+courseID);
		}
	}
}
