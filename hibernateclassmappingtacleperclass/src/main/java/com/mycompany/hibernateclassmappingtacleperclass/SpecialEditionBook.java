package com.mycompany.hibernateclassmappingtacleperclass;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("special_edition_book")

public class SpecialEditionBook extends Book{
	
	private String newfeatures;

	public SpecialEditionBook(String title, String artist, LocalDate purchaseDate, double cost,
			String newfeatures) {
		super(title, artist, purchaseDate, cost);
		this.newfeatures = newfeatures;
	}

	public String getNewfeatures() {
		return newfeatures;
	}

	public void setNewfeatures(String newfeatures) {
		this.newfeatures = newfeatures;
	}

	
}
