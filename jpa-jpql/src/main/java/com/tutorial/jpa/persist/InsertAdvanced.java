package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentAdvanced;

public class InsertAdvanced {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advanced_operations");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		StudentAdvanced student1 = new StudentAdvanced (101, "Uilson", 9);
		StudentAdvanced student2 = new StudentAdvanced (102, "Alessandro", 12);
		StudentAdvanced student3 = new StudentAdvanced (103, "Maria", 24);
		StudentAdvanced student4 = new StudentAdvanced (104, "Regina", 32);
		StudentAdvanced student5 = new StudentAdvanced (105, "Fabio", 23);
		StudentAdvanced	student6 = new StudentAdvanced (106, "José", 27);     	
		StudentAdvanced student7 = new StudentAdvanced (107, "João", 25);
		StudentAdvanced student8 = new StudentAdvanced (108, "Mario", 20);     
		StudentAdvanced student9 = new StudentAdvanced (109, "Claudate", 22);    
		StudentAdvanced student10 = new StudentAdvanced (110, "Gabriel", 31); 
		
		em.persist(student1);
		em.persist(student2);                     
		em.persist(student3);                     
		em.persist(student4);
		em.persist(student5);                     
		em.persist(student6);                     
		em.persist(student7);                     
		em.persist(student8);                     
		em.persist(student9);                     
		em.persist(student10);                     
		                     
		em.getTransaction().commit();
		em.close();
	}
}
