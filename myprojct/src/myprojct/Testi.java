package myprojct;
import java.util.Scanner;

public class Testi {
 public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=-1;
		Account account=null;
		do {
			System.out.println("1.create account");
			System.out.println("2.display account");
			System.out.println("0.exit");
			System.out.println("enter ur choice >>>");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				account=Account.createAccount(AccountType.CREDITCARD,12340);
				break;
			case 2:
				System.out.println(account.displayAccount());
				break;
			case 0:
				System.out.println("exiting from the system....!");
				System.exit(0);
				
			default:
				System.out.println("Invalid chaoice...");
				break;
			}
		}while(choice!=0);
		}

	}