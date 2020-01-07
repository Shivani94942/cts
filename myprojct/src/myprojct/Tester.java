package myprojct;

import myprojct.Account;
import myprojct.AccountType;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Account acc=Account.createAccount(AccountType.CREDITCARD, 12000);
       System.out.println(acc.displayAccount());
	}

}
