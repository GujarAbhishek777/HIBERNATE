package org.jsp.controller;

import org.jsp.dao.Book_Book_Id_Dao;
import org.jsp.dto.Book;
import org.jsp.dto.Book_Id;

public class Book_Book_Id_Controller {

	
	public static void main(String[] args) {
		
		Book_Id book_Id= new Book_Id();
		book_Id.setAuthorName("Rohit");
		book_Id.setBookName("Hibernate");
		book_Id.setPublication("rfcvguygbhjm");
		
		Book book = new Book();
		book.setPrice(1234);
		book.setEdition(1998);
		
		book.setId(book_Id);
		
		Book_Book_Id_Dao dao=new Book_Book_Id_Dao();
		dao.saveDetails(book);
	}
}
