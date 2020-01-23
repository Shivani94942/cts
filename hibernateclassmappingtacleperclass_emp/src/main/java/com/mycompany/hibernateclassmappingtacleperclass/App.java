package com.mycompany.hibernateclassmappingtacleperclass;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
public static void main(String[] args) {
		
		Session session=null;
		try {
			
			session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(RegularEmployee.class)
					.addAnnotatedClass(ContractualEmployee.class).buildSessionFactory()
					.getCurrentSession();
			Employee emp1=new Employee("meera", "panda",LocalDate.now(), 20000);
			Employee emp2=new RegularEmployee("colton", "grey",LocalDate.now() ,15000,5,20000);
			Employee emp3=new ContractualEmployee("reynold", "parker", LocalDate.now(), 40000,10,30000);
		session.getTransaction().begin();
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.getTransaction().commit();
			System.out.println("done");
		} finally {
			//session.close();
		}
}
}
