package interfaceprogram;

public class Test {
	
	public static void main(String args[]) throws EmployeeNotCreatedException
	{
		Employee employee=new Employee();
		employee.createEmployee(2345,"mary","western india",1);
		System.out.println(employee);
	
	}
}