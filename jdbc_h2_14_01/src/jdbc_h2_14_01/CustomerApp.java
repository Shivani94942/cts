package jdbc_h2_14_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;


public class CustomerApp {
	private static CustomerService service;
	static {
		service = new CustomerServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				String fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName=br.readLine().toString();
				System.out.print(" Email: ");
				String email=br.readLine().toString();
				Customer customer=service.createCustomer(fName, lName, email);
				System.out.println("Create Customer Sucess "+customer);
				break;
			case 2:
				System.out.println("displaying all the customers ");
				List<Customer> list=service.displayAllCustomers();
				list.forEach(e->{
					System.out.format("%s %s %s\n",e.getFirstName(),e.getLastName(),e.getEmail());
				});
			case 3:
				List<Customer> list1=service.findById();
				list1.forEach(e->{
					System.out.format("%s %s %s\n",e.getFirstName(),e.getLastName(),e.getEmail());
				});
				break;
			case 4: 
				System.out.print(" First Name: ");
				String fName1=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName1=br.readLine().toString();
				System.out.print(" Email: ");
				String email1=br.readLine().toString();
				Customer customer1=service.updateCustomer(fName1, lName1, email1);
				System.out.println("update Customer Sucess "+customer1);
				break;

			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}