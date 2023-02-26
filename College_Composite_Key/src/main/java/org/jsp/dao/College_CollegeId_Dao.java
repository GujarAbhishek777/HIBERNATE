package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.College;

public class College_CollegeId_Dao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveDetails(College college) {
		transaction.begin();
		manager.persist(college);
		transaction.commit();
	}
}
