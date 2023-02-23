package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
   @Id
   private int cid;
   private String cname;
   private String email;
   private String address;
   
   @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
   private List<Employee> employee;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Company [cid=" + cid + ", cname=" + cname + ", email=" + email + ", address=" + address + ", employee="
			+ employee + "]";
}
   
   
}
