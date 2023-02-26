package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Amazon;


public class Amazon_AmazonId_Dao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveDetails(Amazon amazon) {
		transaction.begin();
		manager.persist(amazon);
		transaction.commit();
	}
}
