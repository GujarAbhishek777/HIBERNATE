package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jso.Dao.Person_Identity_Dao;
import org.jsp.dta.Identity;
import org.jsp.dta.Person;

public class Person_identity_Controller 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Details of the Identites of the person:  ");
		Identity identity=new Identity();
		
		
		System.out.println("For First Identity Card:");
		System.out.println("Enter CardType");
		String cardType=sc.nextLine();
		
		identity.setCardname(cardType);
		
		System.out.println("Enter CardId");
		long cardId=sc.nextLong();
		
		identity.setId(cardId);
		
		Identity identity1=new Identity();
		
		System.out.println("For Second Identity Card:");
		System.out.println("Enter CardType");
		String cardType1=sc.next();
		
		identity1.setCardname(cardType1);
		
		System.out.println("Enter CardId");
		long cardId1=sc.nextLong();
		
		identity1.setId(cardId1);
		
		Identity identity2=new Identity();
		
		System.out.println("For Third Identity Card:");
		System.out.println("Enter CardType");
		String cardType2=sc.next();
		
		identity2.setCardname(cardType2);
		
		System.out.println("Enter CardId");
		long cardId2=sc.nextLong();
		
		identity2.setId(cardId2);
		
		
		Person person = new Person();
		person.setId(10);
		person.setName("abhi");
		person.setEmail("Abhi@emial.com");
		person.setMno(55554452l);
		List<Identity> list = new ArrayList<Identity>();
		list.add(identity2);
		list.add(identity1);
		list.add(identity);
		person.setIdentity(list);
		
		System.out.println("Please Select option from the below: ");
		System.out.println("1.To save the details ");
		System.out.println("2. To Update the details ");
		System.out.println("3. To find the all records ");
		System.out.println("4. To Delete the records ");
		System.out.println("5. To find the rocords of person identity based on id");
	    int n=sc.nextInt();
	    
	    Person_Identity_Dao dao=new Person_Identity_Dao();
	    
	    switch(n) {
	    
	    case 1:System.out.println("You have selected Save option");
	           dao.save_Person_Details(person);
	           break;
	    
	    case 2:System.out.println("You have selected Update option ");
	           System.out.println("Please enter the Mapping id of person:");
	           int id=sc.nextInt();
	            dao.update_Person_Data(person, list, id);
	            break;
	    
	    case 3:System.out.println("You have selected Find option ");
	           dao.FindAll();
	           break;
	    
	    case 4:System.out.println("You have selected Deleted Option");
	           System.out.println("Please enter the id of person to delete records:");
                int id1=sc.nextInt();
	          dao.delete_Person_Data(id1);
	          break;
	          
	    case 5:System.out.println("You have selected Find option ");
	           System.out.println("Please enter the id which you find the data ");
	           int id2=sc.nextInt();
	           dao.findPersonById(id2);
	           break;
	    }
		
				
	}

}
