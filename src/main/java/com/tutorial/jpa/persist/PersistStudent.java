package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Student;

public class PersistStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setId(1L);
		s1.setName("Uilson");
		s1.setAge(10);
		
		Student s2 = new Student();
		s2.setId(2L);
		s2.setName("Alessandro");
		s2.setAge(12);
		
		Student s3 = new Student();
		s3.setId(3L);
		s3.setName("Regina");
		s3.setAge(31);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		em.getTransaction().commit();
	}
}
