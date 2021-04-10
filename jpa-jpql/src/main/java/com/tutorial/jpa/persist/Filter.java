package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorial.jpa.domain.StudentAdvanced;

public class Filter {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("advanced_operations");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select s from StudentAdvanced s where s.s_age between 22 and 24");
		
		@SuppressWarnings("unchecked")
		List<StudentAdvanced> list = (List<StudentAdvanced>)query.getResultList();
		
		System.out.println("Between Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for (StudentAdvanced s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}
		
		Query query2 = em.createQuery("Select s from StudentAdvanced s where s.s_age IN(23,32, 31)");
		
		@SuppressWarnings("unchecked")
		List<StudentAdvanced> list2 = (List<StudentAdvanced>)query2.getResultList(); 
		
		System.out.println("IN Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentAdvanced s:list2) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}
		
		Query query3 = em.createQuery("Select s from StudentAdvanced s where s.s_name like '%a%'");
		
		@SuppressWarnings("unchecked")
		List<StudentAdvanced> list3 = (List<StudentAdvanced>) query3.getResultList();

		System.out.println("Like Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t \t s_age");
		
		for(StudentAdvanced s:list3) {
			System.out.print(s.getS_id());
			System.out.print("\t " + s.getS_name());
			System.out.println("\t " + s.getS_age());
		}
		
		em.getTransaction().commit();
	}
}
























