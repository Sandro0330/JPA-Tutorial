package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Student;

public class RemoveStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = em.find(Student.class, 1L);
		
		em.remove(student);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
}
