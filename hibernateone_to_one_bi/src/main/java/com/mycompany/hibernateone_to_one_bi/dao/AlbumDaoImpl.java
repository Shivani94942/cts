package com.mycompany.hibernateone_to_one_bi.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernateone_to_one_bi.entity.Album;
import com.mycompany.hibernateone_to_one_bi.entity.MyImage;
import com.mycompany.hibernateone_to_one_bi.util.HibernateUtil;


public class AlbumDaoImpl implements AlbumDao {
	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session=HibernateUtil.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public Album createAlbum(Album album) {
		try {
			
			transaction.begin();
			System.out.println("Saving the album: " + album);
			session.save(album);			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return album;
	}
	
	@Override
	public List<Album> getAllAlbums() {
		Query query=session.createQuery("from Album");
		return query.list();
	}

	@Override
	public Album findById(Integer id) {
	  Album alb=session.get(Album.class, id);
		if(alb==null)
		{
			System.out.println("not found");
		}
		return alb;
	}
	@Override
	public Album updateAlbum(Integer id) throws IOException {
		Album alb=session.get(Album.class, id);
		if(alb!=null)
		{			
			 System.out.println("Name: ");
			  String name=br.readLine().toString(); 
			 alb.setAlbumName(name);
			transaction.begin();
			session.update(alb);
			transaction.commit();
			
			
			
		}
		else {
			System.out.println("not found");
		}
		
		return alb;
	}
	
	@Override
	public Album deleteAlbum(Integer id) {
		Album a=session.get(Album.class, id);
		if(a!=null)
		{
			transaction.begin();
			session.delete(a);
			transaction.commit();
			
		}
		else
		{
			System.out.println("not found");
		}
		return a;
	}
}
