package com.ty.Many_To_Many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCapPersons {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cab cab = entityManager.find(Cab.class, 1);
		if (cab != null) {
			List<Person> person = cab.getPersons();
			System.out.println("Cab Id Is:" + cab.getId());
			System.out.println("Cab Id Is:" + cab.getDrivernName());
			System.out.println("Cab Id Is:" + cab.getCost());

			System.out.println("*****************");

			for (Person person2 : person) {
				System.out.println("Person Id Is:" + person2.getId());
				System.out.println("Person Name Is:" + person2.getName());
				System.out.println("Person Age Is:" + person2.getAge());
				System.out.println("Person Email Is:" + person2.getEmail());
				System.out.println("*****************");
			}
		} else {
			System.out.println("Cab Is Not Found");

		}

	}

}
