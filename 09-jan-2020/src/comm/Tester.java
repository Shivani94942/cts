package comm;

import java.util.Set;

public class Tester {
	
	private static CustomerService customerService;
	static
	{
		customerService=new CustomerService();
	}


	public static void main(String[] args) {
		
		customerService.addCustomer(123, "john", "doe", "john@adc.com");
		customerService.addCustomer(145, "virat", "kohli", "kohli@adc.com");
		Set<Customer> set=customerService.getAllCustomers();
		System.out.println(set);
		
	}

}
