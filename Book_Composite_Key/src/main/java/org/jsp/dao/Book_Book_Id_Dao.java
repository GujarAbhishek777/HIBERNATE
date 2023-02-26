package org.jsp.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Book;


public class Book_Book_Id_Dao {

	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveDetails(Book book) {
		transaction.begin();
		manager.persist(book);
		transaction.commit();
	}
}
