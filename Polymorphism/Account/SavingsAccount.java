import java.lang.*;

public class SavingsAccount extends Account
{

	private double interestRate;


	public SavingsAccount(int accountNumber,String accountHolderName,double balance,double interestRate){
		super(accountNumber,accountHolderName,balance);
		
		this.interestRate=interestRate;
	}

	// public SavingsAccount(double interestRate) {
	// 	this.interestRate = interestRate;
	// }
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}

	//double Total=((Balance*Interest)/100)+Balance;


	public void showDetails()
	{
		super.showDetails();
		System.out.println("Interest Rate: "+interestRate);
		//System.out.println("total Balance :"+Balance);
	}
}