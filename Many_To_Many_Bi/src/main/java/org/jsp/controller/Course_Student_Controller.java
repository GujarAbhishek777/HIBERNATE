package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Course_Student_Dao;
import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_Controller {

	public static void main(String[] args) {
		
		Student student= new Student();
		student.setName("Ganesh");
		student.setAddress("Thane");
		student.setEmail("ganesh@gmail.com");
				
		Student student1= new Student();
		student1.setName("Ramesh");
		student1.setAddress("Thane");
		student1.setEmail("ramesh@gmail.com");
		
		Student student2= new Student();
		student2.setName("Ram");
		student2.setAddress("Thane");
		student2.setEmail("ram@gmail.com");
		
//		List<Student>list = new ArrayList<Student>();
//		list.add(student);
//		list.add(student1);
//		list.add(student2);
		
		
		Course course= new Course();
		course.setName("Java");
		course.setDuration(120);
		//course.setStudent(list);
		
		Course course1= new Course();
		course1.setName("Java8");
		course1.setDuration(120);
		//course1.setStudent(list);
		
		
		List<Course>list1= new ArrayList<Course>();
		list1.add(course);
		list1.add(course1);
		
		student.setCourse(list1);
		student1.setCourse(list1);
		student2.setCourse(list1);
		
		Course_Student_Dao dao= new Course_Student_Dao();
		//dao.saveCourses(course);
		//dao.saveCourses(course1);
		
		
		dao.saveStudent(student);
		dao.saveStudent(student1);
		dao.saveStudent(student2);
		
		
		
		
	}
}
