package comm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account account=new Account(123456,"asdfg","alchemy");
		//account.display();
		Account account=null; 
		account=new SavingAccount(324516,"Marry","western area",0.20,12000) ;
		System.out.println(account.display());
		account=new CurrentAccount(234567,"john","southern area",false, 25000);
		 System.out.println(account.display()); 
	}

}
