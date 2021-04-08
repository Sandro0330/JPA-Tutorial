package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentBulkData;

public class InsertNamedQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bulk_data");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		StudentBulkData student1 = new StudentBulkData(101, "Uilson", 9);
		StudentBulkData student2 = new StudentBulkData(102, "Alessandro", 12);
		StudentBulkData student3 = new StudentBulkData(103, "Maria", 30);
		StudentBulkData student4 = new StudentBulkData(104, "Regina", 32);
		StudentBulkData student5 = new StudentBulkData(105, "Fabio", 43);

		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(student4);
		em.persist(student5);

		em.getTransaction().commit();
		em.close();
	}
}
