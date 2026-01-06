package EduMentorPlatform;

public class Courses implements ICertifiable{
	String courseID;
	int duration; // in months
	double cost;
	Courses(int duration,double cost){
		this.cost=cost;
		this.duration=duration;
	}
	
	
	public void generateCertificate(String courseID) {
		if(duration>=12) {
			System.out.println("---- Full-time Course----\n You get certified in :"+courseID);
		}else {
			System.out.println("---- Short Course----\n You get a short term certificate in :"+courseID);
		}
	}
	
	
}
