package org.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Amazon {

	private String pwd;
	
	@EmbeddedId
	private Amazon_Id id;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Amazon_Id getId() {
		return id;
	}

	public void setId(Amazon_Id id) {
		this.id = id;
	}
	
	
}
