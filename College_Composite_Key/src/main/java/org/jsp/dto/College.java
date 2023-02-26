package org.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class College {

	private String cname;
	private int cRank;
	
	@EmbeddedId
	private College_Id id;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getcRank() {
		return cRank;
	}

	public void setcRank(int cRank) {
		this.cRank = cRank;
	}

	public College_Id getId() {
		return id;
	}

	public void setId(College_Id id) {
		this.id = id;
	}
	
	
}
