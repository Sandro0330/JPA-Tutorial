package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentPersist;

public class Remove {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("remove");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentPersist student = em.find(StudentPersist.class, 102);
		em.remove(student); //excluindo aluno 
		
		em.getTransaction().commit();
		em.close();
	}

}
