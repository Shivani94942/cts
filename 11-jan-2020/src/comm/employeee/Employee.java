package comm.employeee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	
	private int employeeId;
	private String employeeName;
	private String department;
	private LocalDate dateOfJoining;
	private int age;
	private int salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int employeeId, String department, LocalDate dateOfJoining, int age, int salary) {
		super();
		this.employeeId = employeeId;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n",employeeId,employeeName,department,new SimpleDateFormat("MM/dd/yyyy").format(dateOfJoining),age,salary);
		return "";
	}
	@Override
public int compareTo(Employee employee) {
		
		int result=0;
		if(this.getSalary()>employee.getSalary())
		{
			result=-1;
		}
		else if(this.getSalary()<employee.getSalary())
		{
			result=1;
		}
		else if(this.getSalary()==employee.getSalary())
		{
			result=0;
		}
		
		return result;
		
	}
	

}
