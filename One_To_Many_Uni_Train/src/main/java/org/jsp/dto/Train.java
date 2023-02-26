package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {

	@Id
	private int id;
	private String name;
	private int train_no;
	
	
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

	public int getTrain_no() {
		return train_no;
	}

	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}

	
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", train_no=" + train_no + "]";
	}
	
	
}
