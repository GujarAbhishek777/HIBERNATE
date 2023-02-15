package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Flipkart {
	@Id
   private int id; 
   private String name;
   private String email;
   private String pwd;
   
   @OneToMany(cascade = CascadeType.ALL)
   private List<Items>items;

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

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public List<Items> getItems() {
	return items;
}

public void setItems(List<Items> items) {
	this.items = items;
}

@Override
public String toString() {
	return "Flipkart [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", items=" + items + "]";
}
   

   
   
   
}
