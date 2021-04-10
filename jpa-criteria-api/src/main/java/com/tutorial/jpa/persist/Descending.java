package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.tutorial.jpa.domain.StudentOrderBy;

public class Descending {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<StudentOrderBy> criteriaQuery = criteriaBuilder.createQuery(StudentOrderBy.class);
		
		Root<StudentOrderBy> root = criteriaQuery.from(StudentOrderBy.class);
		
		criteriaQuery.orderBy(criteriaBuilder.desc(root.get("s_age")));
		CriteriaQuery<StudentOrderBy> select = criteriaQuery.select(root);
		TypedQuery<StudentOrderBy> typedQuery = em.createQuery(select);
		List<StudentOrderBy> list = typedQuery.getResultList();
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentOrderBy s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t " + s.getName());
			System.out.println("\t " + s.getS_age());
		}
		
		em.getTransaction().commit();
		em.close();
		
	}
}
