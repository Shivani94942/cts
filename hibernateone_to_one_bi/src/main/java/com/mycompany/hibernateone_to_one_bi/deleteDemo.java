package com.mycompany.hibernateone_to_one_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernateone_to_one_bi.entity.Album;
import com.mycompany.hibernateone_to_one_bi.entity.MyImage;

public class deleteDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 2;
			Album tempAlbum = session.get(Album.class, theId);

			System.out.println("Found instructor: " + tempAlbum);

			if (tempAlbum != null) {

				System.out.println("Deleting: " + tempAlbum);

				session.delete(tempAlbum);
			}

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
