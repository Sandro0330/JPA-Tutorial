package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Book3;
import com.tutorial.jpa.domain.StudentManyToOne;

public class ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Book3 book = new Book3();
		book.setId(101L);
		book.setName("Estrutura de Dados");
		
		em.persist(book);
		
		StudentManyToOne student = new StudentManyToOne();
		student.setName("Ronaldo");
		student.setBook(book);
		
		StudentManyToOne student2 = new StudentManyToOne();
		student2.setName("Thiago");
		student2.setBook(book);
		
		StudentManyToOne student3 = new StudentManyToOne();
		student3.setName("Manú");
		student3.setBook(book);
		
		em.persist(student);
		em.persist(student2);
		em.persist(student3);
		em.getTransaction().commit();
		em.close();
	}
}
