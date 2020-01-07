package comm;

public class Account {
	private int accountId;
	private String name;
	private String address;

	public Account() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Account(int accountId,String name,String address)
	{
		super();
		this.accountId=accountId;
		this.name=name;
		this.address=address;		
	}
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String display() {
		return getObjectType(this)+ "Name: " + getName() + " AccountId: " + getAccountId() + " Address : "
				+ getAddress();
	}

	private String getObjectType(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
