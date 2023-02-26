package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Bike;

public class Bike_Controller {

	public static void main(String[] args) {
		
		Bike bike= new Bike();
		bike.setId(2);
		bike.setName("ABGX");
		bike.setColor("Red");
		bike.setPrice(1236543);
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
//			transaction.begin();
//			manager.persist(bike);
//			transaction.commit();
//			
			
			Bike bike2=manager.find(Bike.class, 1);
			Bike bike3=manager.find(Bike.class, 2);
		
			Bike bike4=manager.find(Bike.class, 1);
			Bike bike5=manager.find(Bike.class, 2);
			
			System.out.println(bike2);
			System.out.println(bike3);
			System.out.println(bike4);
			System.out.println(bike5);
	}
}
