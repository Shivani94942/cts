package comm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefaultStream {

	
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("Enter the name : ");
			String str=br.readLine();
			System.out.format("Name # %s", str);
			System.out.println("Enter the age :");
			int age=Integer.parseInt(br.readLine().toString());
			System.out.printf("Age # %d", age);
		}catch(IOException ioe)
		{
			System.err.println("IO exception is occured");
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("number format exception is occured.");
		}
	}

}
