package com.mycompany.hibernatealbum_one_to_many;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatealbum_one_to_many.entity.Album;
import com.mycompany.hibernatealbum_one_to_many.entity.MyImage;
import com.mycompany.hibernatealbum_one_to_many.entity.Picture;

public class DeleteCourses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(MyImage.class)
								.addAnnotatedClass(Picture.class)
								.buildSessionFactory();
	Session session = factory.getCurrentSession();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {			
		session.beginTransaction();
			int theId = 0;
			System.out.println("enter id :");
			theId=Integer.parseInt(br.readLine().toString());
			
		//System.out.println("Deleting course: " + tempPicture);
			 session.getTransaction().begin();
			 Picture tempPicture = session.get(Picture.class, theId);
			 //session.save(tempPicture); 
			session.delete(tempPicture);
			 
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			//session.close();
			factory.close();
		}
	}

}
