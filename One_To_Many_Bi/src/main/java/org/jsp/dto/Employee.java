package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
   @Id
   private int eid;
   private String ename;
   private String eaddress;
   private long mno;
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn
   private Company company;

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getEaddress() {
	return eaddress;
}

public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}

public long getMno() {
	return mno;
}

public void setMno(long mno) {
	this.mno = mno;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", mno=" + mno + ", company="
			+ company + "]";
}
   
   
   
   
}
