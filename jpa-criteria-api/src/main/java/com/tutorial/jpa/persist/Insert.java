package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentSelect;

public class Insert {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Preenchendo a tabela student_select
		
		StudentSelect student1 = new StudentSelect(101, "Uilson", 11);
		StudentSelect student2 = new StudentSelect(102, "Alessandro", 12);				
		StudentSelect student3 = new StudentSelect(103, "Thiago", 31);
		StudentSelect student4 = new StudentSelect(104, "Regina", 32);
		StudentSelect student5 = new StudentSelect(105, "Maria", 40);
		StudentSelect student6 = new StudentSelect(106, "Sandro", 42);
		StudentSelect student7 = new StudentSelect(107, "Regiane", 25);
		StudentSelect student8 = new StudentSelect(108, "Fabio", 35);
		StudentSelect student9 = new StudentSelect(109, "Marcelo", 25);
		StudentSelect student10 = new StudentSelect(110, "José", 23);
		
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
