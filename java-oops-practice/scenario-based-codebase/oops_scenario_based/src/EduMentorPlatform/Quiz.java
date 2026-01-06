package EduMentorPlatform;

public class Quiz {
	public String question;
	private String answer;
	protected double score;
	
	Quiz(String question , String answer, double score){
		this.question=question;
		this.answer=answer;
		this.score=score;
	}
	// only making getter method . this will implement:
	//Encapsulation for quiz answers (can’t be modified once set).
	public String getAnswer() {
		return answer;
	}
	// method to check the answer
	public double totalScore(String userInput) {
		double total=0.0;
		if(userInput.equals(answer)) {
			total+=score;
		}
		return total;
	}
	
	void displayQues() {
		System.out.println(question);
	}
}
