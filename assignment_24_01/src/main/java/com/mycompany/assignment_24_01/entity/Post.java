package com.mycompany.assignment_24_01.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "post")

public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String postedBy;
	private String imageUrl;
	private LocalDateTime createdDateTime;

   
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
@JoinColumn
	private List<Comment> comments;
	
	public Post(String postedBy, String imageUrl, LocalDateTime createdDateTime) {
		super();
		this.postedBy = postedBy;
		this.imageUrl = imageUrl;
		this.createdDateTime = createdDateTime;
	}

	/*public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;}*/
	
	public void add(Comment coment)
	{
		if(comments==null)
		{
			comments=new ArrayList<Comment>();
		}
		comments.add(coment);
		coment.setPost(this);
		
	}

}
