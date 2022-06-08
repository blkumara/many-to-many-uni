package com.ty.Many_To_Many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudentCourse {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 1);
		if (student != null) {
			List<Course> course = student.getCourses();
			System.out.println("Student Id Is:" + student.getId());
			System.out.println("Student Name Is:" + student.getName());
			System.out.println("Student Age Is:" + student.getAge());
			System.out.println("********************");

			for (Course course1 : course) {

				System.out.println("Course Id Is:" + course1.getId());
				System.out.println("Course Name Is:" + course1.getName());
				System.out.println("Course Duration Is:" + course1.getDuration());
				System.out.println("********************");
			}
		} else {
			System.out.println("Student Is Not Found");

		}

	}

}
