package com.tutorial.jpa.persist;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Book2;
import com.tutorial.jpa.domain.StudentOneToMany;

public class OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Book2 book1 = new Book2();
		book1.setId(233L);
		book1.setName("PHP");
		
		Book2 book2 = new Book2();
		book2.setId(435L);
		book2.setName("PHP e MySQL");
		
		em.persist(book1);
		em.persist(book2);
		
		ArrayList<Book2> list = new ArrayList<Book2>();
		list.add(book1);
		list.add(book2);
		
		StudentOneToMany student3 = new StudentOneToMany();
		student3.setName("Leandro");
		student3.setBook_issued(list);
		
		em.persist(student3);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
