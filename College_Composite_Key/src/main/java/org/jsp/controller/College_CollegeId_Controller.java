package org.jsp.controller;

import org.jsp.dao.College_CollegeId_Dao;
import org.jsp.dto.College;
import org.jsp.dto.College_Id;

public class College_CollegeId_Controller {

	public static void main(String[] args) {
		
		College_Id college_Id= new College_Id();
		college_Id.setIdno("123A");
		college_Id.setDegree("CS");
		college_Id.setDiv("A");
		
		College college= new College();
		college.setCname("Terna College");
		college.setcRank(123);
		college.setId(college_Id);
		
		College_CollegeId_Dao dao =new College_CollegeId_Dao();
		dao.saveDetails(college);
	}
}
