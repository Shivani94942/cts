package com.mycompany.assignment_24_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.assignment_24_01.entity.Post;

@Repository("dao")
public class PostDaoImpl implements PostDao {

	private SessionFactory sessionFactory;
	private Session session;

@Autowired
	public PostDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		session=sessionFactory.openSession();
}
		
	@Override
	public Post createPost(Post post) {
		
		session.save(post);
		return post;
	}

}
