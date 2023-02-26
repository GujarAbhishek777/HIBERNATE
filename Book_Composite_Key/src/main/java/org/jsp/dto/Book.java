package org.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Book {

	private double price;
	private int edition;
	
	@EmbeddedId
	private Book_Id id;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public Book_Id getId() {
		return id;
	}

	public void setId(Book_Id id) {
		this.id = id;
	}
	
	
}
