package com.mycompany.hibernateone_to_one_bi;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernateone_to_one_bi.entity.Album;
import com.mycompany.hibernateone_to_one_bi.entity.MyImage;

class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		

		try {

			Album tempAlbum = new Album("songs",LocalDate.now());

			MyImage myimg = new MyImage("https://www.google.com/search?q=image");

			tempAlbum.setImage(myimg);

			session.beginTransaction();

			System.out.println("Saving the album: " + tempAlbum);
			session.save(tempAlbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
		
	}

}
