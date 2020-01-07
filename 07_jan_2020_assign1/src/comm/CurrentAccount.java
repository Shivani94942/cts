package comm;

public class CurrentAccount extends Account {
	
	private boolean isEligible;
	private double amount;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(int accountId, String name, String address,boolean isEligible,double amount) {
		super(accountId, name, address);
		this.isEligible=isEligible;
		this.amount=amount;
	}

	@Override
	public String display() {
		
		return super.display() +" is eligible ??"+ isEligible +"Amount of current account :"+amount;
	}

}
