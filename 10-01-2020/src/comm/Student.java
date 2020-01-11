/*
 * package comm;
 * 
 * import lombok.AllArgsConstructor; import lombok.EqualsAndHashCode; import
 * lombok.Getter; import lombok.NoArgsConstructor; import lombok.Setter; import
 * lombok.ToString;
 * 
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Getter
 * 
 * @Setter
 * 
 * @ToString
 * 
 * @EqualsAndHashCode
 * 
 * public class Student implements Comparable<Student>{
 * 
 * private String studentId; private String studentName; private double cgpa;
 * 
 * public int compareTo(Student student) { int value=0; Student student=null;
 * if(o instanceof Student) { student=(Student)o; }
 * if(this.getCgpa()>student.getCgpa()) { value=-1; } else
 * if(this.getCgpa()<student.getCgpa()) { value=1; } else
 * if(this.getCgpa()==student.getCgpa()) { value=0; } return value; }
 * 
 * }
 * 
 * }
 */

package comm;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
public class Student {

	String firstName, lastName;
	int studentID = 0;
	double GPA = 0.0;

	public Student(String firstName, String lastName, int studentID, double GPA) {
		if (firstName == null || lastName == null || studentID == 0 || GPA == 0.0)
			throw new NullPointerException();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = GPA;
	}

	public String firstName() {
		return firstName;
	}

	public String lastName() {
		return lastName;
	}

	public int studentID() {
		return studentID;
	}

	public double GPA() {
		return GPA;
	}

	
}