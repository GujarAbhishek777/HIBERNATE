package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {
 
	@Id
	private int wid;
	private String name;
	private String address;
	private long mno;
	
	
}
