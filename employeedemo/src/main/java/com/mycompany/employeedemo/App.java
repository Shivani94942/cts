package com.mycompany.employeedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.employeedemo.bean.Employee;
public class App 
{
    public static void main( String[] args )
    {
    try
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee employee=context.getBean("employee",Employee.class);
    	Employee employee1=context.getBean("employee",Employee.class);
    	System.out.println(employee==employee1);
    	System.out.println(employee);
	} catch (Exception e) {
		
			e.printStackTrace(); 
	}
}
}
