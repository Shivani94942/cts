package com.mycompany.assignment_24_01;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.assignment_24_01.entity.Comment;
import com.mycompany.assignment_24_01.entity.Post;



public class App 
{
	
    public static void main( String[] args )
    {
       try {
    	   
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	   PostService service=context.getBean("service",PostService.class);
    	   String str[]=UUID.randomUUID().toString().split("-");
    	   Post pos=new Post(str[0], "https://www.google.com/search?q=images", LocalDateTime.now());
    	   /*Comment comment=new Comment("hello,how are you??", LocalDateTime.now());*/
    	   Comment c1=new Comment("nice", LocalDateTime.now());
    	   Comment c2=new Comment("hello,how are you??", LocalDateTime.now());
    	  pos.add(c1);
    	  pos.add(c2);
    	   
    	   service.createPost(pos);
    	   System.out.println(pos);
    	   
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
