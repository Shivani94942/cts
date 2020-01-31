package com.mycompany.customer;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.customer.bean.*;


public class App 
{
    public static void main( String[] args )
    {
    	CustomerService service;
     {
    		service = new CustomerServiceImpl();
    	}
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	}
    	catch(Exception e) {
    		
    		e.printStackTrace();
    		
    }
    }
}
    	
    	
