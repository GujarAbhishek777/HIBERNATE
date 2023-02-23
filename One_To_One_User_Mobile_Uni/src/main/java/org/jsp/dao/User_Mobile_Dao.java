package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Mobile;
import org.jsp.dto.User;


public class User_Mobile_Dao {

	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  
	  public void saveMobile(Mobile mobile) {
		  entityTransaction.begin();
		  entityManager.persist(mobile);
		  entityTransaction.commit();
	  }
	  
	  public void saveUser(User user) {
		  entityTransaction.begin();
		  entityManager.persist(user);
		  entityTransaction.commit();
	  }
	  
	  public void updateUser(User user) {
		  entityTransaction.begin();
		  entityManager.merge(user);
		  entityTransaction.commit();
	  }
	  
	  public void deleteUser(int id)
	  {
		  User c2=entityManager.find(User.class,id);
			
			if(c2!=null) {
				entityTransaction.begin();
				entityManager.remove(c2);
				entityTransaction.commit();
	   }else {
			System.out.println("Id not found and data not deleted");
			}
	  }
	  
	  public void findById(int mid) {
		  User user=entityManager.find(User.class,mid);
		 System.out.println(user);
	  }
	
}
