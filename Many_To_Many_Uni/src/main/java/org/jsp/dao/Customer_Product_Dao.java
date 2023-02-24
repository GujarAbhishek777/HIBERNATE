package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Customer;
import org.jsp.dto.Product;

public class Customer_Product_Dao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  
	  public void saveCustomer(Customer customer) {
		  entityTransaction.begin();
		  entityManager.persist(customer);
		  entityTransaction.commit();
	  }
	  
	  public void updateCustomer(int id,List<Product> products) {
		  
		  entityTransaction.begin();
		  Customer customer= entityManager.find(Customer.class, id);
		  List<Product> products2= customer.getProducts();
		  products2.addAll(products);
		  customer.setProducts(products2);
		  
//		  for (Customer pro : customer) {
//			pro.s
//		}
		  
		  entityManager.merge(customer);
		  entityTransaction.commit();
	  }
	  
	  public void deleteCustomer(int id) {
		  Customer c2=entityManager.find(Customer.class,id);
			
			if(c2!=null) {
				entityTransaction.begin();
				entityManager.remove(c2);
				entityTransaction.commit();
	   }else {
			System.out.println("Id not found and data not deleted");
			}
	  }
}
