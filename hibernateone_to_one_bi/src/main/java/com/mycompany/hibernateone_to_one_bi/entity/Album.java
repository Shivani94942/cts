package com.mycompany.hibernateone_to_one_bi.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "album_name")
	private String albumName;

	@Column(name = "date")
	private LocalDate date;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	private MyImage image;

	public Album() {

	}
	

	public Album(String albumName, LocalDate date) {
		super();
		this.albumName = albumName;
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public MyImage getImage() {
		return image;
	}


	public void setImage(MyImage image) {
		this.image = image;
	}


	/*
	 * @Override public String toString() { return "Album [id=" + id +
	 * ", albumName=" + albumName + ", date=" + date + ", image=" + image + "]"; }
	 */
}
