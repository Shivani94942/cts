package com.mycompany.spring_hibernate_demo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_hibernate_demo.entity.UserDetail;

public class App 
{
    public static void main( String[] args )
    {
       try {
		
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
          UserService service=context.getBean("service",UserService.class);
         
           String str[]=UUID.randomUUID().toString().split("-");
           
           UserDetail userd=new UserDetail();
           userd.setUserId(str[0]);
           userd.setUserName("meera grey");
           userd.setEmail("meera@hmail.com");
           service.createUser(userd);
           System.out.println(userd);
	} catch (Exception e) {
		e.printStackTrace();
	}
        
    }
}
