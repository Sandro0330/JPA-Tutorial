package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.tutorial.jpa.domain.Student;

public class Like {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("where");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		AbstractQuery<Student> abstractQuery = criteriaBuilder.createQuery(Student.class);
		
		Root<Student> studentRoot = abstractQuery.from(Student.class);
		
		abstractQuery.where(criteriaBuilder.like(studentRoot.get("s_name"), "R%"));
		CriteriaQuery<Student> criteriaQuery = ((CriteriaQuery<Student>) abstractQuery).select(studentRoot);
		TypedQuery<Student> typedQuery = em.createQuery(criteriaQuery);
		List<Student> list = typedQuery.getResultList();
		
		//Nome do aluno que começa com a letra R
		System.out.println("Student name starting with R");
		
		System.out.print("s_id");
		System.out.print("\t s_name"); 
		System.out.println("\t s_age"); 
 
		
		for(Student s:list) {
		
			System.out.print(s.getS_id()); 
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age()); 
		}
			
		em.getTransaction();
		em.close();
	}
}
