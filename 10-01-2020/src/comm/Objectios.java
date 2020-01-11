
package comm;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Objectios {

	
	public static void main(String[] args) {
		BufferedReader reader;
		
		Employeee emp = null;
		List<Employeee> l = new ArrayList<Employeee>();
		try {
			reader = new BufferedReader(new FileReader("emp.in"));

			String stri = reader.readLine();
			while (stri != null) {
				String str[] = stri.split(" ");
				emp = new Employeee(str[0], str[1],str[2],LocalDate.now());
				System.out.println("employee to write is: " + emp);
				l.add(emp);
				stri = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream out = new FileOutputStream("emp.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(l);
			oos.flush();
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}

		try {
			FileInputStream in = new FileInputStream("emp.out");
			ObjectInputStream ois = new ObjectInputStream(in);
			l = (List<Employeee>) (ois.readObject());
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}
		System.out.println("\n\n");
		for(Employeee e:l)
		{
			System.out.println( e+"\n");
		}
			

	}
}