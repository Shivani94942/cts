package comm;

public class SavingAccount extends Account{
	
	private double rateOfInterest;
	private double amount;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int accountId, String name, String address,double rateOfInterest,double amount) {
		super(accountId, name, address);
		this.rateOfInterest=rateOfInterest;
		this.amount=amount;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display()+"  rate of interest : "+rateOfInterest+"   Amount : "+amount;
	}
	
	

}
