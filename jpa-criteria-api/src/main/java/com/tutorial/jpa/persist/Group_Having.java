package com.tutorial.jpa.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.tutorial.jpa.domain.StudentGroupBy;

public class Group_Having {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("group_by");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object [].class);
		Root<StudentGroupBy> root = criteriaQuery.from(StudentGroupBy.class);
		
		criteriaQuery.multiselect(root.get("s_age"), criteriaBuilder.count(root)).groupBy(root.get("s_age")).having(criteriaBuilder.ge(root.get("s_age"), 25));
		
		System.out.print("s_age");
		System.out.println("\t Count");
		
		List<Object[]> list = em.createQuery(criteriaQuery).getResultList();
		
		for(Object[] object:list) {
			System.out.println(object[0] + " " + object[1]);
		}
		
		em.getTransaction().commit();
		em.close();
	}	
}
