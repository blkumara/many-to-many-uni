package com.ty.Many_To_Many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourse {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Student student=new  Student();
		student.setName("kumara");
		student.setAge(22);
		
		Course course1=entityManager.find(Course.class, 1);
		Course course2=entityManager.find(Course.class, 3);
		
	
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		
		student.setCourses(courses);
		
		entityTransaction.begin();
		entityManager.persist(student);
	
		entityTransaction.commit();
		
		System.out.println("*****DONE*****");
		
	}

}
