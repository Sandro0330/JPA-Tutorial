package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Book;
import com.tutorial.jpa.domain.StudentOneToOne;

public class OneToOne {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentOneToOne student1 = new StudentOneToOne();
		student1.setName("Carlos");
		
		StudentOneToOne student2 = new StudentOneToOne();
		student2.setName("Sergio");
		
		em.persist(student1);
		em.persist(student2);
		
		Book book1 = new Book();
		book1.setId(101L);
		book1.setName("Java");
		book1.setStudent(student1);
		
		Book book2 = new Book();
		book2.setId(102L);
		book2.setName("POO");
		book2.setStudent(student2);
		
		em.persist(book1);
		em.persist(book2);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
