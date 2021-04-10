package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Aggregate {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advanced_operations");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select count(s) from StudentAdvanced s");
		System.out.println("Number of student: " + query.getSingleResult());
		
		Query query2 = em.createQuery("Select MAX(s.s_age) from StudentAdvanced s ");
		System.out.println("Maximum age: " + query2.getSingleResult());
		
		Query query3 = em.createQuery("Select MIN(s.s_age) from StudentAdvanced s");
		System.out.println("Minimum age: " + query3.getSingleResult());
	
		em.getTransaction().commit();
		em.close();
	
	}
}
