package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorial.jpa.domain.StudentNamedQuery;

public class FetchColumnNQ {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("basics_operations");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("find name");
		
		@SuppressWarnings("unchecked")
		List<StudentNamedQuery> list = query.getResultList();
		
		System.out.println("Student Name: ");
		
		for (StudentNamedQuery s:list) {
			
			System.out.println(s.getS_name());
		}
		
		em.close();
	}
}
