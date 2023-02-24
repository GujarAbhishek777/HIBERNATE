package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String address;
	private long mno;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> products;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", mno=" + mno + ", products="
				+ products + "]";
	}
	
	
}
