package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.tutorial.jpa.domain.StudentSelect;

public class SelectSeveral {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<StudentSelect> criteriaQuery = criteriaBuilder.createQuery(StudentSelect.class);
		
		Root<StudentSelect> root = criteriaQuery.from(StudentSelect.class);
		
		criteriaQuery.multiselect(root.get("s_id"), root.get("s_name"), root.get("s_age"));
		
		CriteriaQuery<StudentSelect> select = criteriaQuery.select(root);
		TypedQuery<StudentSelect> typedQuery = em.createQuery(select);
		List<StudentSelect> list = typedQuery.getResultList();
		
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentSelect s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t  " + s.getS_name());
			System.out.println("\t" + s.getS_age());
		}
		
		em.getTransaction().commit();
		em.close();
	}
}
