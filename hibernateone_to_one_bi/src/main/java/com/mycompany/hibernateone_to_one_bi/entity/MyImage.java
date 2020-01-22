package com.mycompany.hibernateone_to_one_bi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class MyImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "image_url")
	private String imageUrl;

	@OneToOne(mappedBy = "image", cascade = CascadeType.ALL)
	private Album album;

	
	public MyImage() {

	}


	public MyImage(String imageUrl) {
		super();
		this.imageUrl = imageUrl;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Album getAlbum() {
		return album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}


	/*
	 * @Override public String toString() { return "MyImage [id=" + id +
	 * ", imageUrl=" + imageUrl + ", album=" + album + "]"; }
	 */
}