package org.jsp.dta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_Dao {
  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
  EntityManager entityManager=entityManagerFactory.createEntityManager();
  EntityTransaction entityTransaction=entityManager.getTransaction();
  
  public void saveMobile(Mobile mobile) {
	  entityTransaction.begin();
	  entityManager.persist(mobile);
	  entityTransaction.commit();
  }
  
  public void saveOs(Os os) {
	  entityTransaction.begin();
	  entityManager.persist(os);
	  entityTransaction.commit();
  }
  
  public void updateMobile(Mobile mobile) {
	  entityTransaction.begin();
	  entityManager.merge(mobile);
	  entityTransaction.commit();
  }
  
  public void findById(int mid) {
	 Mobile mobile=entityManager.find(Mobile.class,mid);
	 System.out.println(mobile);
  }
}
