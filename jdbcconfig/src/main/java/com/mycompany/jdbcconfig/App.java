package com.mycompany.jdbcconfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.jdbcconfig.bean.CustomerConfig;
import com.mycompany.jdbcconfig.model.Customer;
import com.mycompany.jdbcconfig.service.CustomerService;

/*
 * public class App { public static void main( String[] args ) {
 * AnnotationConfigApplicationContext context=new
 * AnnotationConfigApplicationContext(CustomerConfig.class); Customer c
 * =context.getBean("customer",Customer.class); c.setUid("100");
 * c.setFirstName("john"); c.setLastName("doe"); c.setEmail("john@abc.com");
 * System.out.println(c);
 * 
 * } }
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException
    {
       AnnotationConfigApplicationContext context=
    		   new AnnotationConfigApplicationContext(CustomerConfig.class);
       BufferedReader br=null;
   	CustomerService service=null;		
		
   	
   	try {
   		br=new BufferedReader(new InputStreamReader(System.in));
		
			service = context.getBean("service", CustomerService.class);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   	finally {
			context.close();
		}
   	
   	int choice=-1;
   	String uid,firstName,lastName,email=null;
   	do {
   		System.out.println("1. create customer.");
   		System.out.println("2. display all customer.");
   		System.out.println("3. find customer by uid.");
   		System.out.println("4. update customer.");
   		System.out.println("5. delete customer.");
   		System.out.println("0.exit");
   		System.out.print("enter your choice>> ");
   		choice=Integer.parseInt(br.readLine());
   		switch (choice) {
			case 1:
				System.out.print("first name>> ");
				firstName=br.readLine();
				System.out.print("last name>> ");
				lastName=br.readLine();
				System.out.print("email>> ");
				email=br.readLine();
				String[] arr=UUID.randomUUID().toString().split("-");
				uid=arr[0]+arr[1];
				service.createCustomer(new Customer(uid, firstName, lastName, email));
				break;
			case 2:
				List<Customer> l=service.displayAllCustomers();
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
				break;
			case 3:
				System.out.print("uid>> ");
				uid=br.readLine();
				l=service.findCustomerById(uid);
				if(l.isEmpty())
				{
					System.out.println("customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
					l.forEach(c->{
						System.out.println(c);
					});
				}
				break;
			case 4:
				System.out.print("uid>> ");
				String uid1=br.readLine();
				System.out.print("first Name>> ");
			    String firstName1=br.readLine();
			
			int i=service.updateCustomerById(uid1,firstName1);
				System.out.println("update successfull");
				break;
			case 5: System.out.print("uid>> ");
			String uid2=br.readLine().toString();
			
			int s=service.deleteCustomer(uid2);
			System.out.println("delete successfull"+s);
				break;
			case 0:
				System.out.println("exited");
			System.exit(0);

			default:
				break;
			}
			
		} while (choice !=0);
    }
}