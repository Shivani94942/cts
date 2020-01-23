package com.mycompany.hibernatealbum_one_to_many.entity;

import java.time.LocalDate;
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
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
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
	
	@OneToMany(mappedBy = "album",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})

	private List<Picture> pictures;
	
	public Album(String albumName, LocalDate date) {
		super();
		this.albumName = albumName;
		this.date = date;
	}
	public void add(Picture tempPicture) {
		
		if(pictures==null)
		{
			pictures=new ArrayList<>();
		}
		pictures.add(tempPicture);
		tempPicture.setAlbum(this);
	}

	
}
