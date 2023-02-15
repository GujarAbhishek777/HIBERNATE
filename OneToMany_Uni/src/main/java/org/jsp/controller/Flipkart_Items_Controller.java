package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dta.Flipkart_Items_Dao;
import org.jsp.dto.Flipkart;
import org.jsp.dto.Items;

public class Flipkart_Items_Controller {
    public static void main(String[] args) {
    	
       Items items=new Items();
       items.setId(1010);
       items.setName("Mobile");
       items.setPrice(1234);
       
       Items items1= new Items();
       items1.setId(1020);
       items1.setName("laptop");
       items1.setPrice(5432);
       
       Items items2= new Items();
       items2.setId(1030);
       items2.setName("Java Books");
       items2.setPrice(6543);
    	
//    	 Items items3= new Items();
//       items3.setId(105);
//       items3.setName("Java Books");
//       items3.setPrice(6543);
////       
       List<Items> list = new ArrayList<Items>();
       list.add(items);
       list.add(items1);
       list.add(items2);
       //list.add(items3);
       
       
    	
		Flipkart flipkart=new Flipkart();
		flipkart.setId(10);
		flipkart.setName("Abhishek");
		flipkart.setEmail("abhi@gmail.com");
		flipkart.setPwd("Abhi@123");
		flipkart.setItems(list);
		
		Flipkart_Items_Dao dao=new Flipkart_Items_Dao();
		//dao.saveFilpkart_Customer_Details(flipkart);
		//dao.findCustomerById(10);
		//dao.update_Customer_Cart(flipkart,list,10);
		//dao.delete_Customer_Cart(10);
		dao.FindAll();
	}
	
}
