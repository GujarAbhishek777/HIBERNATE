package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Os {
	 @Id
   private int id;
   private String name;
   private String bit;
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
public String getBit() {
	return bit;
}
public void setBit(String bit) {
	this.bit = bit;
}
   
}
