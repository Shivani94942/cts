package com.mycompany.assignment_24_01.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Setter
@Table(name = "comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private Integer id;
	
	private String commentText;
	private LocalDateTime dateTime;
	@ManyToOne
	private Post post;

	
	public Comment(String commentText, LocalDateTime dateTime) {
		super();
		this.commentText = commentText;
		this.dateTime = dateTime;
	}

	
	

}
