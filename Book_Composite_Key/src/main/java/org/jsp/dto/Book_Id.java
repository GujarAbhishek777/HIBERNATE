package org.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Book_Id implements Serializable {

	private String authorName;
	private String publication;
	private String bookName;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
}
