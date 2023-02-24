package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_Dao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveCourses(Course course) {
		transaction.begin();
		manager.persist(course);
		transaction.commit();
	}
	
	public void saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
}
