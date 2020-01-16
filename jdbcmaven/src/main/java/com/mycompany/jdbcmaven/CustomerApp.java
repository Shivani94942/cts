package com.mycompany.jdbcmaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import com.mycompany.jdbcmaven.customer.Customer;
import com.mycompany.jdbcmaven.customer.CustomerService;
import com.mycompany.jdbcmaven.customer.CustomerServiceImpl;


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
			System.out.println("6. find customer by last name");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
		
			
			String uId;
			String lastName;
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				String fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName=br.readLine().toString();
				System.out.print(" Email: ");
				String email=br.readLine().toString();
				String arr[]=UUID.randomUUID().toString().split("-");
				Customer customer=service.createCustomer(fName, lName, email,arr[0]);
				System.out.println("Create Customer Sucess "+customer);
				break;
			case 2:
				
				  System.out.println("displaying all the customers "); 
				  List<Customer> list=service.displayAllCustomers(); 
				  list.forEach(e->{
				  System.out.format("%s %s %s %s\n",e.getFirstName(),e.getLastName(),e.getEmail(),e.getUId()); 
				  });
				 
				break;
			case 3:
				
				System.out.print(" UID: ");
				uId=br.readLine().toString();
				list=service.findById(uId);
				if(list.isEmpty())
				{
					System.out.println("no such uid found");
				}
				else {
					Customer c=list.get(0);
					System.out.println("customer found: "+c);
				}
				break;
			case 4: 
				System.out.print(" First Name: ");
				String fName1=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName1=br.readLine().toString();
				System.out.print(" Email: ");
				String email1=br.readLine().toString();
				String arr1[]=UUID.randomUUID().toString().split("-");
				Customer customer1=service.updateCustomer(arr1[0],fName1, lName1, email1);
				System.out.println("update Customer Sucess "+customer1);
				break;
			case 5:
				
				  System.out.print(" UID: ");
				  uId=br.readLine().toString();
				  String rs = service.deleteCustomer(uId);
				  System.out.println("row deleted");
				/*
				 * if(rs.isEmpty()) { System.out.println("row deleted"); }
				 */
			
				  break;
			case 6:System.out.print(" last name : ");
			lastName=br.readLine().toString();
				
				list=service.findByName(lastName);
			if(list.isEmpty())
			{
				System.out.println("no such last name is available");
			}
			else {
				Customer c=list.get(0);
				System.out.println("customer found: "+c);
			}
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