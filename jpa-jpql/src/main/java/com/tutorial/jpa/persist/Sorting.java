package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorial.jpa.domain.StudentAdvanced;

public class Sorting {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advanced_operations");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select s from StudentAdvanced s order by s.s_age desc");
		
		@SuppressWarnings("unchecked")
		List<StudentAdvanced> list = (List<StudentAdvanced>)query.getResultList();
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t \t s_age");
		
		for(StudentAdvanced s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name() + "\t" );
		    System.out.println("\t" + s.getS_age() + "\t" );
		
		}
		
		em.getTransaction().commit();
		em.close();
	
	}
}
