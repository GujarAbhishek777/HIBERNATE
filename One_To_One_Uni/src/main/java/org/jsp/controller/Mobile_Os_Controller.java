package org.jsp.controller;

import org.jsp.dta.Mobile_Os_Dao;
import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_Controller {
  
	public static void main(String[] args) {
		Os os= new Os();
		os.setId(10120);
		os.setName("Android123");
		os.setBit("1080 bit");
		
		Mobile mobile=new Mobile();
		mobile.setId(1010);
		mobile.setName("Abhixxx");
		mobile.setColor("Black");
		mobile.setPrice(990000);
		
		mobile.setOs(os);
		
	   Mobile_Os_Dao dao =new Mobile_Os_Dao();
	  // dao.saveMobile(mobile);
	   
	  // dao.saveOs(os);
	   
	   //dao.updateMobile(mobile);
	   
	   dao.findById(1010);
		
	}
}
