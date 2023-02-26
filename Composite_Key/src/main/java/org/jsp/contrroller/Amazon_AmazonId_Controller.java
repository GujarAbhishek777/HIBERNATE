package org.jsp.contrroller;

import org.jsp.dao.Amazon_AmazonId_Dao;
import org.jsp.dto.Amazon;
import org.jsp.dto.Amazon_Id;

public class Amazon_AmazonId_Controller {

	public static void main(String[] args) {
		
//		Amazon_Id amazon_Id=new Amazon_Id();
//		amazon_Id.setEmail("abhi@gmail.com");
//		amazon_Id.setMno("12345");
		
		
		Amazon_Id amazon_Id1=new Amazon_Id();
		amazon_Id1.setEmail("abhi21@gmail.com");
		amazon_Id1.setMno("12345453");
		
		
		Amazon amazon= new Amazon();
		amazon.setPwd("wsdew2");
		
		amazon.setId(amazon_Id1);
		
		Amazon_AmazonId_Dao dao=new Amazon_AmazonId_Dao();
		dao.saveDetails(amazon);
		 
		
		
	}
}
