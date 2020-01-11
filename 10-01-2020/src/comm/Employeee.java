package comm;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Employeee implements Serializable{
	private String employeeId;
	private String firstName;
	private String lastName;
	private LocalDate date;
	

	public Employeee(String employeeName, LocalDate date) {
		super();
		this.employeeId=UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName =lastName;
		this.date = date;
	}
	
	

}
