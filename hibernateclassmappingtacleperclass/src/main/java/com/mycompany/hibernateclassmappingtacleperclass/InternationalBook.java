package com.mycompany.hibernateclassmappingtacleperclass;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("international_book")
public class InternationalBook extends Book{

	private String languages;
	private int region;

	/*
	 * public InternationalBook() { }
	 */
	public InternationalBook(String title, String artist, LocalDate purchaseDate, double cost, String languages,
			int region) {
		super(title, artist, purchaseDate, cost);
		this.languages = languages;
		this.region = region;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}
	
}
