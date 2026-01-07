package LoanBuddy;
//Applicant class: name, creditScore, income, loanAmount.
public class Applicant  {
	private String name;
	private double creditScore;
	private double income;
	private double loanAmount;
	
	Applicant(String name, double creditScore, double income, double loanAmount){
		this.name=name;
		this.creditScore=creditScore;
		this.income=income;
		this.loanAmount=loanAmount;
	}

	public String getName() {
		return name;
	}

	public double getCreditScore() {
		return creditScore;
	}

	public double getIncome() {
		return income;
	}

	public double getLoanAmount() {
		return loanAmount;
	}
	
	
	
	public double calculateEMI() {
		return loanAmount;
	}
	
	
}
