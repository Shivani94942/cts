package comm.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Tester {
	private EmployeeService service;

	public static void main(String[] args) throws SQLException {

		Tester tester = new Tester();
		tester.service = new EmployeeServiceImpl();
		List<Employee> list=tester.service.getAllEmployees();
		System.out.println("ID  FIRST_NAME  LAST_NAME  SALARY  DEPARTMENT_ID EMAIL");
		list.forEach(e->{
			System.out.format("%-5d %-10s%-10s %.2f     %-5d   %s\n",e.getEmployeeId(),e.getFirstName(),e.getLastName(),e.getSalary(),e.getDepartment_id(),e.getEmail());
		});

	}

}