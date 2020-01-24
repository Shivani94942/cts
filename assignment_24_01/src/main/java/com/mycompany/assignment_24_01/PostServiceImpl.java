package com.mycompany.assignment_24_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.assignment_24_01.entity.Post;

@Service("service")
public class PostServiceImpl implements PostService {

	private PostDao dao;
	
	@Autowired
	public PostServiceImpl(PostDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	@Transactional
	public Post createPost(Post post) {
		
		return dao.createPost(post);
	}

}
