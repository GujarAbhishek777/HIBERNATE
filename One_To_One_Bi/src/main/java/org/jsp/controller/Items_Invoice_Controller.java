package org.jsp.controller;

import org.jsp.dta.Items_Invoice_Dao;
import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Items_Invoice_Controller {
   public static void main(String[] args) {
	
	Invoice invoice=new Invoice();
	invoice.setId(101);
	invoice.setCname("Sheela");
	invoice.setAddress("Delhi");
	invoice.setMno(64848339);
	
	
	Items items=new Items();
	items.setId(201);
	items.setName("Ball");
	items.setPrice(100);
	
	items.setInvoice(invoice);
	//invoice.setItems(items);

	
	Items_Invoice_Dao dao= new Items_Invoice_Dao();
	//dao.saveItems(items);
	dao.saveInvoice(invoice);
	
}
}
