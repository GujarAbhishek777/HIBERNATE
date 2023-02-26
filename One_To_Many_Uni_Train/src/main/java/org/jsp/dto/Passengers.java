package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passengers {
	
	@Id
	private int id;
	private String pname;
	private long mobno;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Train>train;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	
	public List<Train> getTrain() {
		return train;
	}
	public void setTrain(List<Train> train) {
		this.train = train;
	}
	@Override
	public String toString() {
		return "Passengers [id=" + id + ", pname=" + pname + ", mobno=" + mobno + "]";
	}
	
	
	

}
