package org.jsp.dta;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Identity
{
	
	@Id
	private long id;
	private String cardname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	@Override
	public String toString() {
		return "Identity [id=" + id + ", cardname=" + cardname + "]";
	}
	
	
	

}
