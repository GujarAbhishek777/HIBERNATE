package org.jsp.dta;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person 
{
	
	@Id
	private int id;
	private String name;
	private String email;
	private long mno;
	@OneToMany (cascade = CascadeType.ALL)
	private List<Identity> identity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public List<Identity> getIdentity() {
		return identity;
	}

	public void setIdentity(List<Identity> identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", mno=" + mno + ", identity=" + identity
				+ "]";
	}
	
   
}
