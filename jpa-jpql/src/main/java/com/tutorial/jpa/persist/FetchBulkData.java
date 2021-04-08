package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorial.jpa.domain.StudentBulkData;

public class FetchBulkData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bulk_data");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select s from StudentBulkData s");
		
		@SuppressWarnings("unchecked")
		List<StudentBulkData> list = (List<StudentBulkData>)query.getResultList();
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for (StudentBulkData s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t " + s.getS_name());
			System.out.println("\t " + s.getS_age());
		}
		em.getTransaction().commit();
		em.close();
	
	}
}
