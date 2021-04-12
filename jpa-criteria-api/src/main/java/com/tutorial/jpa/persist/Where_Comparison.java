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

public class Where_Comparison {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("where");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		AbstractQuery<Student> abstractQuery1 = criteriaBuilder.createQuery(Student.class);
		AbstractQuery<Student> abstractQuery2 = criteriaBuilder.createQuery(Student.class);
		
		Root<Student> studentRoot = abstractQuery1.from(Student.class);
		
		abstractQuery1.where(criteriaBuilder.greaterThan(studentRoot.get("s_age"), 22));
		
		CriteriaQuery<Student> criteriaQuery = ((CriteriaQuery<Student>) abstractQuery1).select(studentRoot);
		TypedQuery<Student> typedQuery = em.createQuery(criteriaQuery);
		List<Student> list1 = typedQuery.getResultList();
		
		//Estudante com idade superior a 22
		System.out.println("Student having age greater than 22");
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(Student s:list1) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}
		
		Root<Student> studentRoot2 = abstractQuery2.from(Student.class);
		
		abstractQuery2.where(criteriaBuilder.lessThan(studentRoot2.get("s_age"), 22));
		
		CriteriaQuery<Student> criteriaQuery2 = ((CriteriaQuery<Student>)abstractQuery2).select(studentRoot2);
		TypedQuery<Student> typedQuery2 = em.createQuery(criteriaQuery2);
		List<Student> list2 = typedQuery2.getResultList();
		
		
		//Estudante com idade inferior a 22
		System.out.println("Student having age Less than 22");
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for( Student s:list2) {
			System.out.print(s.getS_id());
			System.out.print("\t" + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}
		
		em.getTransaction().commit();
		em.close();
	}
}






























