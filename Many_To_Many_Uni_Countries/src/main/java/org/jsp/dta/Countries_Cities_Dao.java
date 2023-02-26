package org.jsp.dta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Cities;
import org.jsp.dto.Countries;




public class Countries_Cities_Dao {
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("ashu");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	  public void saveCities(Cities cities) {
		  transaction.begin();
		  manager.persist(cities);
		  transaction.commit();
	  }

    public void updateCities(int id,List<Countries> countries) {
		  
		  transaction.begin();
		  Cities cities= manager.find(Cities.class, id);
		  List<Countries> countries2= cities.getCountries();
		  countries2.addAll(countries);
		  cities.setCountries(countries2);
		  
//		  for (Customer pro : customer) {
//			pro.s
//		}
		  
		  manager.merge(cities);
		  transaction.commit();
	  }
    
    public void deleteCities(int id) {
		  Cities c2=manager.find(Cities.class,id);
			
			if(c2!=null) {
				transaction.begin();
				manager.remove(c2);
				transaction.commit();
	   }else {
			System.out.println("Id not found and data not deleted");
			}
	  }
	  
}
