package com.mycompany.hibernateperson_annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.mycompany.hibernateperson_annotation.entity.Person;
import com.mycompany.hibernateperson_annotation.service.PersonService;
import com.mycompany.hibernateperson_annotation.service.PersonServiceimpl;



public class App 
{
	private static PersonService service;
	static {
		service=new PersonServiceimpl();
	}
	public static void main(String[] args) throws IOException

	{
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create person");
			System.out.println("2. display all persons");
			System.out.println("3. find person by id");
			System.out.println("4. update person");
			System.out.println("5. delete person");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			
			switch (choice) {
			case 1:
				String str[]=UUID.randomUUID().toString().split("-");
				String uid1=str[0];
				System.out.print(" person name: ");
				String pname=br.readLine().toString();
				LocalDate date= LocalDate.now();
				Person p=service.createPerson(new Person(uid1,pname,date));
				System.out.println("Create Customer Sucess "+p);
				break;
								 
			case 2:
				System.out.println("displaying all persons");
				List<Person> l=service.getAllPersons();
				System.out.println(l);
				break;
			case 3:
				System.out.println("Id : ");
				Integer id= Integer.parseInt(br.readLine().toString());
				Person p1=service.getPersonByid(id); 
				System.out.println(p1);
				break;
			case 4:
				System.out.println("Id : ");
				Integer id1= Integer.parseInt(br.readLine().toString());
				
				
				 
				/*
				 * p2.setCName(name); p2.setDateOfBirth(LocalDate.now());
				 */
				 Person p2=service.updatePerson(id1);
				 System.out.println(p2);
				System.out.println("update sucessfull");
				break;
			case 5:
				System.out.println("id : ");
				 Integer id2= Integer.parseInt(br.readLine().toString()); 
				service.deletePerson(id2);
				System.out.println("delete successfull.");
				break;
			case 0:
				System.out.println("exited");
				System.exit(0);
				
				
				default:
					System.out.println("invalid choice");				
			}
		}while(choice!=0);		 
		
	}
}
