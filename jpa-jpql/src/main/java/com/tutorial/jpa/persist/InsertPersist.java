package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentBO;

public class InsertPersist {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("basics_operations");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		StudentBO student1 = new StudentBO(101, "Uilson", 9);
		StudentBO student2 = new StudentBO(102, "Alessandro", 12);
		StudentBO student3 = new StudentBO(103, "Maria", 30);
		StudentBO student4 = new StudentBO(104, "Regina", 32);
		StudentBO student5 = new StudentBO(105, "Fabio", 43);

		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(student4);
		em.persist(student5);

		em.getTransaction().commit();
		em.close();
	}
}
