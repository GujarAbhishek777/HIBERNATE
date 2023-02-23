package org.jsp.dta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Company;
import org.jsp.dto.Employee;

public class Company_Employee_Dao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  
	  public void saveComany(Company company ) {
		  entityTransaction.begin();
		  List<Employee> list= company.getEmployee();
		  for (Employee emp : list) {
			emp.setCompany(company);
		}
		  entityManager.persist(company);
		  entityTransaction.commit();
	  }
	  
	  public void saveEmployee(Employee employee) {
		  entityTransaction.begin();
		  entityManager.persist(employee);
		  entityTransaction.commit();
	  }
	  
	  public void find_Company_Employee(int id) {
//		  Company company= entityManager.find(Company.class, id);
//			System.out.println(company);
		  
//		  Employee employee= entityManager.find(Employee.class, id);
//			System.out.println(employee);
	  }
	  
	  public void updateCompany(int id,List<Employee>employees) {
		  
		  entityTransaction.begin();
		  Company company= entityManager.find(Company.class, id);
		  List<Employee> employee2= company.getEmployee();
		  employee2.addAll(employees);
		  company.setEmployee(employee2);
		  
		  for (Employee emp : employees) {
			  
			emp.setCompany(company);
		}
		  
		  entityManager.merge(company);
		  entityTransaction.commit();
	  }
	
}
