package LoanBuddy;
// ● LoanApplication class with loan type, term, and interest rate.
public abstract class LoanApplication implements IApprovable {
	protected int term;
	protected double interestRate;
	protected Applicant applicant;
	protected boolean loanStatus;
	// constructor
	LoanApplication(Applicant applicant2,double interestRate,int d){
		this.interestRate=interestRate;
		this.applicant =applicant2;
		this.term=d ;
	}

	public boolean getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(boolean status) {
		this.loanStatus=status;
	}
	
	
}
