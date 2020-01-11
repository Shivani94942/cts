//package comm;

/*
 * import java.util.Iterator; import java.util.Set; import java.util.TreeSet;
 * import java.util.UUID;
 * 
 * public class Tester {
 * 
 * public static void main(String[] args) {
 * 
 * Set<Student> set=new TreeSet<Student>(); set.add(new
 * Student(UUID.randomUUID().toString(),"xioaqi",9.5)); set.add(new
 * Student(UUID.randomUUID().toString(),"feng leng",7.2)); set.add(new
 * Student(UUID.randomUUID().toString(),"feng lie",8.8)); Iterator<Student>
 * iterator=set.iterator(); while(iterator.hasNext()) {
 * System.out.println(iterator.next()+"\n"); } }
 * 
 * }
 */
package comm;

//import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;
//import java.util.UUID;

public class Tester {

	public static void main(String[] args) {

		/*
		 * Set<Employee> set=new HashSet<Employee>(); set.add(new Employee("John",
		 * UUID.randomUUID().toString(), 10000)); set.add(new
		 * Employee("Marry",UUID.randomUUID().toString(),12000)); set.add(new
		 * Employee("Sachin", UUID.randomUUID().toString(), 5700)); for(Employee e:set)
		 * 
		 * { System.out.println(e+"\n");
		 * 
		 * }
		 */

		Set<Student> set = new TreeSet<Student>();
		set.add(new Student("John", "Doe", 100,0.5));
		set.add(new Student("Shane", "Warne", 110,3.0));
		for (Student s : set) {
			System.out.println(s + "\n");
		}

	}

}
