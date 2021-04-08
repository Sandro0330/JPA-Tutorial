package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchColumn {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("basics_operations");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select s.s_name from StudentBO s");
		
		@SuppressWarnings("unchecked")
		List<String> list = query.getResultList();
		
		System.out.println("Student Name: ");
		
		for (String s:list) {
			
			System.out.println(s);
		}
		
		em.close();
	}
}
