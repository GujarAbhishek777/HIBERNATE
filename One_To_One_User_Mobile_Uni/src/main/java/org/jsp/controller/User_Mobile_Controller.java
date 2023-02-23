package org.jsp.controller;

import org.jsp.dao.User_Mobile_Dao;
import org.jsp.dto.Mobile;
import org.jsp.dto.User;

public class User_Mobile_Controller {

	public static void main(String[] args) {
		
		Mobile mobile= new Mobile();
		mobile.setMid(21);
		mobile.setMname("POCO X5 Pro ");
		mobile.setStorage("128GB");
		mobile.setRam("8 GB");
		
		User user= new User();
		user.setUid(1);
		user.setName("Abhi");
		user.setAge(23);
		
		user.setMobile(mobile);
		
		User_Mobile_Dao dao= new User_Mobile_Dao();
		dao.saveUser(user);
	}
}
