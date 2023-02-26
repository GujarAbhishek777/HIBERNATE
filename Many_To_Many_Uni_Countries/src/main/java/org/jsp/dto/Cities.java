package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cities {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int cid;
	private String cname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Countries> countries;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Cities [cid=" + cid + ", cname=" + cname + ", countries=" + countries + "]";
	}
	
	

}
