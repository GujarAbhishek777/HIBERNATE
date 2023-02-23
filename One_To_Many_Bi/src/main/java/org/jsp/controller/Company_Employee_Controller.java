package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dta.Company_Employee_Dao;
import org.jsp.dto.Company;
import org.jsp.dto.Employee;

public class Company_Employee_Controller {
    public static void main(String[] args) {
		
    	Company company=new Company();
    	company.setCid(1009);
    	company.setAddress("Banglore");
    	company.setEmail("tcs@gmail.com");
    	company.setCname("TCS");
    	
    	Employee employee=new Employee();
    	employee.setEid(117);
    	employee.setEname("javed sir");
    	employee.setEaddress("Thane");
    	employee.setMno(12345678);
    	//employee.setCompany(company);
    	
    	Employee employee1=new Employee();
    	employee1.setEid(118);
    	employee1.setEname("Bikash sir");
    	employee1.setEaddress("Thane");
    	employee1.setMno(123465678);
    	//employee1.setCompany(company);
    	
    	List<Employee> list= new ArrayList<Employee>();
    	list.add(employee);
    	list.add(employee1);
    	
    	
    	company.setEmployee(list);
    	
    	
    	Company_Employee_Dao dao=new Company_Employee_Dao();
    	//dao.saveComany(company);
    			
    	//dao.saveEmployee(employee);
    	
    	//dao.find_Company_Employee(1006);
    	
    	
    	dao.updateCompany(1009, list);
    	
	}
}
