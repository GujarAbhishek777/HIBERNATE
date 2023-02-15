package org.jsp.dta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Flipkart;
import org.jsp.dto.Items;



public class Flipkart_Items_Dao {
     
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveFilpkart_Customer_Details(Flipkart flipkart) {
		entityTransaction.begin();
		entityManager.persist(flipkart);
		entityTransaction.commit();
	}
	
	public void findCustomerById(int id) {
		Flipkart flipkart= entityManager.find(Flipkart.class, id);
		System.out.println(flipkart);
	}
	
	public void update_Customer_Cart(Flipkart flipkart,List<Items> items, int id) {
		
		Flipkart kart= entityManager.find(Flipkart.class, id);
		List<Items> items1=kart.getItems();
		items1.addAll(items);
		kart.setItems(items1);
		entityTransaction.begin();
		entityManager.merge(kart);
		entityTransaction.commit();
}
	public void delete_Customer_Cart(int id)
	{
		Flipkart c2=entityManager.find(Flipkart.class,id);
	
		if(c2!=null) {
			entityTransaction.begin();
			entityManager.remove(c2);
			entityTransaction.commit();
		}else {
			System.out.println("Id not found and data not deleted");
		}
	}
	public void FindAll()
	{
		Query q=entityManager.createQuery("select flipkart from Flipkart flipkart");
		List<Flipkart> l=q.getResultList();
		System.out.println(l);
	}
}
