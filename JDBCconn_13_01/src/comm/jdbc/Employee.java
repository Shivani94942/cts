package comm.jdbc;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 6600181960967350908L;
	
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private int department_id;
	private String email;

}
