package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dta.Train_Passengers_Dao;
import org.jsp.dto.Passengers;
import org.jsp.dto.Train;

public class Train_Passengers_Controller {

	public static void main(String[] args) {
		
		Train train= new Train();
		train.setId(111);
		train.setName("punchvati");
		train.setTrain_no(77777);
		
		Train train1= new Train();
		train1.setId(112);
		train1.setName("sevagram");
		train1.setTrain_no(2222);
	
		Train train2= new Train();
		train2.setId(113);
		train2.setName("Kamyani");
		train2.setTrain_no(4444);
		
		List<Train> list = new ArrayList<Train>();
		list.add(train);
		list.add(train1);
		list.add(train2);
		
	   Passengers passengers=new Passengers();
	   passengers.setId(2);
	   passengers.setPname("ashwini");
	   passengers.setMobno(8789799);
	   passengers.setTrain(list);
	  
		
	  Train_Passengers_Dao dao=new Train_Passengers_Dao();
		//dao.savePassenger(passengers);
		 // dao.findTrain(112);
	    // dao.updateTrain(2,list);
         //  dao.deleteTrain(2);
	      //  dao.findAll();
	}

}
