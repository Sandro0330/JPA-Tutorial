package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentNamedQuery;

public class InsertBulkData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("basics_operations");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		StudentNamedQuery student1 = new StudentNamedQuery(101, "Uilson", 9);
		StudentNamedQuery student2 = new StudentNamedQuery(102, "Alessandro", 12);
		StudentNamedQuery student3 = new StudentNamedQuery(103, "Maria", 30);
		StudentNamedQuery student4 = new StudentNamedQuery(104, "Regina", 32);
		StudentNamedQuery student5 = new StudentNamedQuery(105, "Fabio", 43);

		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(student4);
		em.persist(student5);

		em.getTransaction().commit();
		em.close();
	}
}
