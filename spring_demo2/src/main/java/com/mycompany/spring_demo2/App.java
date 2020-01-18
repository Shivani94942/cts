package com.mycompany.spring_demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_demo2.bean.*;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Employee employee=context.getBean("employee",Employee.class);
    		Address address=context.getBean("add", Address.class);
    		address.setLine1("Bangalore");
    		address.setLine2("Karnataka");
    		address.setZipCode("123");
    		address.setPhno("456372");
    		employee.setAddress(address);
    		System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
