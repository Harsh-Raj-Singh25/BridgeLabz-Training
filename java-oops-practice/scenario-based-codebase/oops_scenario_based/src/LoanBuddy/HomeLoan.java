package LoanBuddy;

public class HomeLoan extends LoanApplication{
	
	public HomeLoan(Applicant applicant, int term){
		super(applicant,0.8, term);
	}
	
	@Override
	public boolean approveLoan() {
		if(applicant.getCreditScore()>=700 && applicant.getIncome()>=50000) {
			setLoanStatus(true);
		}else {
			setLoanStatus(false);
		}
		return loanStatus;
	}
	
	@Override
	public double calculateEMI() {
		double P=applicant.getLoanAmount();
		double R=interestRate / 12;
		int N=term;
		
		return (P*R* Math.pow(1+R, N))/ (Math.pow(1+R, N)-1);
	}
	
	

}
