package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Customer_Product_Dao;
import org.jsp.dto.Customer;
import org.jsp.dto.Product;

public class Customer_Product_Controller {
 
	public static void main(String[] args) {
		
		Product product=new Product();
		product.setBrand("Guccci");
		product.setName("TShirt");
		product.setPrice(1000);
		product.setQty(5);
		
		Product product1=new Product();
		product1.setBrand("Guccci1");
		product1.setName("TShirt1");
		product1.setPrice(1002);
		product1.setQty(7);
		
		List<Product> list=new ArrayList<Product>();
		list.add(product);
		list.add(product1);
		
		
		
		Customer customer=new Customer();
		customer.setName("Rohit");
		customer.setAddress("Kalyan");
		customer.setMno(1234567);
		
		customer.setProducts(list);
		
		Customer_Product_Dao dao=new Customer_Product_Dao();
		dao.saveCustomer(customer);
		//dao.deleteCustomer(1);
	}
}
