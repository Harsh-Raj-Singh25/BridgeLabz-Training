package EduMentorPlatform;
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		// declaring an array of learners
		Learner [] learners= {
				new Learner("Harsh","hrs252@gmail.com","H252","M-1",4.5,15),  
				new Learner("Namrata","Nam3474@gamil.com","N347","M-1",4.0,14),
				new Learner("Anand","ana18@gmail.com","A18","Bio",3.8,12),
				new Learner("Sarthak","Srs@gmail.com","S12","C-1",4.2,6)
		};
		// declaring an array of Instructors
		Instructor [] instructors= {
				new Instructor("Vishal","vb2@gmail.com","VB-1","Java",800000),
				new Instructor("Karthik","kr@gmail.com","KR-1","GIT",750000),
				new Instructor("Kotti","kb@gmail.com","Kb-2","OOPS",700000),
				new Instructor("Bhuvan","BP@gmail.com","Bp-1","Fullstack",780000)
		};
		
		// declaring an array of quiz questions
		Quiz [] quiz= {
				new Quiz("Is Java used today?[yes/no]","yes",4.5),
				new Quiz("Java is faster than Python[True/False]","True",5.0),
				new Quiz ("Sanjay Chalke is CEO of Capgemini [True/False]","True",4.8)
		};
		
		// running loop over learners array to test each learner based on quiz elements
		for(int i=0;i<learners.length;i++) {
			System.out.println("Welcome to the Saturday Quiz:");
			System.out.println("Enter your answer according to the question");
			double score=0;
			for(int j=0;j<quiz.length;j++) {
				quiz[j].displayQues();
				String ans=sc.next();
				score+=quiz[j].totalScore(ans);
			}
			double percentage=learners[i].percent(score,quiz.length);
			System.out.println("The Score of "+learners[i].name+" is "+score);
			System.out.println("===================================");
			System.out.println(" Course details of "+learners[i].name + " : ");
			learners[i].generateCertificate(learners[i].course);
		}
		
		
	}
}
