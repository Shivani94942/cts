package interfaceprogram;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String address;
	private double experience;
	private Employee employee=null;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Employee(int employeeId,String employeeName, String address,double experience)throws EmployeeNotCreatedException
	{
		super();
	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address=address;
		this.experience=experience;
		
	}
	
	public Employee createEmployee(int employeeId,String employeeName,String address,double experience) throws EmployeeNotCreatedException{
		
		employee=new Employee(employeeId, employeeName,address, experience);
		if(employee.getExperience()<2)
		{
			throw new EmployeeNotCreatedException("Employee can't be created with less than 2 years experience");
		}
		return employee;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", experience=" + experience + ", employee=" + employee + "]";
	}
	
	

}
