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

//Buscandos uma única coluna do banco de dados
public class Select {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<StudentSelect> criteriaQuery = criteriaBuilder.createQuery(StudentSelect.class);
		
		Root<StudentSelect> root = criteriaQuery.from(StudentSelect.class);
		
		criteriaQuery.select(root.get("s_name"));
		
		CriteriaQuery<StudentSelect> select = criteriaQuery.select(root);
		TypedQuery<StudentSelect> typedQuery = em.createQuery(select);
		List<StudentSelect> list = typedQuery.getResultList();
		
		System.out.println("s_id");
		
		for (StudentSelect s:list) {
			System.out.println(s.getS_id());
		}
		
		em.getTransaction().commit();
		em.close();
		
	}			
}
