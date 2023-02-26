package org.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class College_Id implements Serializable {

	private String idno;
	private String div;
	private String degree;
	
	
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
}
