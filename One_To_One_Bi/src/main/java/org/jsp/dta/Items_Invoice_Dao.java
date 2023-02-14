package org.jsp.dta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Items_Invoice_Dao {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction=entityManager.getTransaction();
	  
	  public void saveItems(Items items) {
		  entityTransaction.begin();
		  entityManager.persist(items);
		  entityTransaction.commit();
	  }
	  
	  public void saveInvoice(Invoice invoice) {
		  entityTransaction.begin();
		  entityManager.persist(invoice);
		  entityTransaction.commit();
	  }
}
