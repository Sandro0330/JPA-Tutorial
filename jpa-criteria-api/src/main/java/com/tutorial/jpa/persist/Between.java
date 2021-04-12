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

public class Between {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("where");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		AbstractQuery<Student> abstractQuery = criteriaBuilder.createQuery(Student.class);
		
		Root<Student> studentRoot = abstractQuery.from(Student.class);
		
		abstractQuery.where(criteriaBuilder.between(studentRoot.get("s_age"), 22, 26));
		CriteriaQuery<Student> criteriaQuery = ((CriteriaQuery<Student>) abstractQuery).select(studentRoot);
		TypedQuery<Student> typedQuery = em.createQuery(criteriaQuery);
		List<Student> list = typedQuery.getResultList();
		
		//Estudante entre 22 e 26
		System.out.println("Student having between 22 and 26");
		
		System.out.print("s_id");
		System.out.print(" \t s_name");
		System.out.println(" \t s_age");
		
		for(Student s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println(" \t" + s.getS_age());
		}
		
		em.getTransaction().commit();
		em.close();
	}
}
