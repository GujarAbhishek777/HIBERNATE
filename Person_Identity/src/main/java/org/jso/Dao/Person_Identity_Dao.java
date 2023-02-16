package org.jso.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dta.Identity;
import org.jsp.dta.Person;



public class Person_Identity_Dao 
{
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void save_Person_Details(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
public void update_Person_Data(Person person,List<Identity> identity, int id) {
		
		Person data= entityManager.find(Person.class, id);
		List<Identity> identity1=data.getIdentity();
		identity1.addAll(identity);
		data.setIdentity(identity1);
		entityTransaction.begin();
		entityManager.merge(data);
		entityTransaction.commit();
}

public void delete_Person_Data(int id)
{
	Person c2=entityManager.find(Person.class,id);

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
	Query q=entityManager.createQuery("select a from Person a");
	List<Person> l=q.getResultList();
	System.out.println(l);
}

public void findPersonById(int id) {
	Person person= entityManager.find(Person.class, id);
	System.out.println(person);
}


}
