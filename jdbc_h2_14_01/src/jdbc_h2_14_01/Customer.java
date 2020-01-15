package jdbc_h2_14_01;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Customer implements Serializable {

	private static final long serialVersionUID = -375065079056659899L;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	

}