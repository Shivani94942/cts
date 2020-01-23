package com.mycompany.hibernatealbum_one_to_many;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatealbum_one_to_many.entity.Album;
import com.mycompany.hibernatealbum_one_to_many.entity.MyImage;
import com.mycompany.hibernatealbum_one_to_many.entity.Picture;

public class CreateCourses {

public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(MyImage.class)
								.addAnnotatedClass(Picture.class)
								.buildSessionFactory();
		

		Session session = factory.getCurrentSession();
		
		try {			
			session.beginTransaction();
			int theId = 1;
			Album tempAlbum = new Album("songs",LocalDate.now());
			MyImage img=new MyImage("https://www.google.com/search?q=images");
			Picture tempPicture1 = new Picture("https://www.google.com/search?q=images&rlz");
			Picture tempPicture2 = new Picture("https://www.google.com/search?q=images&rlz=1C1OKWM_enI");
			tempAlbum.setImage(img);
			tempAlbum.add(tempPicture1);
			tempAlbum.add(tempPicture2);
			session.getTransaction().begin();
			session.save(tempPicture1);
			session.save(tempPicture2);
			session.save(tempAlbum);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
		//	session.close();
			factory.close();
		}
	}

}
