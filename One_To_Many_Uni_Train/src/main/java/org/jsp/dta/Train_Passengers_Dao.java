package org.jsp.dta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import org.jsp.dto.Passengers;
import org.jsp.dto.Train;



public class Train_Passengers_Dao {
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("ashu");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void savePassenger(Passengers passengers)
	{
		transaction.begin();
		manager.persist(passengers);
		transaction.commit();
	}
	
	public void findTrain(int mid)
	{
		
		Train train =manager.find(Train.class, mid);
    	System.out.println(train);
		
	}
	
	public void updateTrain(int id,List<Train> train )
	{
	    Passengers passengers=manager.find(Passengers.class, id);
	    List<Train> trains2=passengers.getTrain();
	    trains2.addAll(train);
	    passengers.setTrain(trains2);
	    transaction.begin();
	    manager.merge(passengers);
	    transaction.commit();
	}
	
	public void deleteTrain(int id)
	{
        Train i=manager.find(Train.class,id);
		
		if(i!=null) 
		{
			transaction.begin();
			manager.remove(i);
			transaction.commit();
		}
		else 
		{
			System.out.println("Id not found and data not deleted");
		}
	}
	
	public void findAll()
	{
		    Query q=manager.createQuery("select f from Passengers f");
			List<Passengers> l=q.getResultList();
			System.out.println(l);
	}

}
