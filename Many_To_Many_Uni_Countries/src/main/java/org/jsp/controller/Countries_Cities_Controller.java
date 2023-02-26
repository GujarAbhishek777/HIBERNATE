package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dta.Countries_Cities_Dao;
import org.jsp.dto.Cities;
import org.jsp.dto.Countries;


public class Countries_Cities_Controller {
	
	public static void main(String[] args) {
		
		Countries countries=new Countries();
		//countries.setId(1);
		countries.setName("India");
		
		Countries countries1=new Countries();
		//countries1.setId(2);
		countries1.setName("UK");
		
		List<Countries> list=new ArrayList<Countries>();
		list.add(countries);
		list.add(countries1);
		
		
		
		Cities cities=new Cities();
		//cities.setCid(11);
		cities.setCname("Nasi");
		cities.setCountries(list);
		
		Countries_Cities_Dao dao=new Countries_Cities_Dao();
		//dao.saveCities(cities);
	//	dao.updateCities(3, list);
		dao.deleteCities(1);
	}

}
