package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Student;

public class Insert {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Preenchendo a tabela student_select
		
		Student student1 = new Student(101, "Uilson", 11);
		Student student2 = new Student(102, "Alessandro", 12);				
		Student student3 = new Student(103, "Thiago", 31);
		Student student4 = new Student(104, "Regina", 32);
		Student student5 = new Student(105, "Maria", 40);
		Student student6 = new Student(106, "Sandro", 42);
		Student student7 = new Student(107, "Regiane", 25);
		Student student8 = new Student(108, "Fabio", 35);
		Student student9 = new Student(109, "Marcelo", 25);
		Student student10 = new Student(110, "José", 23);
		
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(student4);
		em.persist(student5);
		em.persist(student6);
		em.persist(student7);
		em.persist(student8);
		em.persist(student9);
		em.persist(student10);
		
		em.getTransaction().commit();
		em.close();
	}
}
