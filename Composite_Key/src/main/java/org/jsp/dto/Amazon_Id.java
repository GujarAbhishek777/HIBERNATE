package org.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Amazon_Id implements Serializable{

	
	private String email;
	private String mno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	
	
}
