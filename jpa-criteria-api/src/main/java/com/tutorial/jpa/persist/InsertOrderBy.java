package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentOrderBy;

public class InsertOrderBy {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("select");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Preenchendo a tabela student_select
		
		StudentOrderBy student1 = new StudentOrderBy(101, "Uilson", 11);
		StudentOrderBy student2 = new StudentOrderBy(102, "Alessandro", 12);				
		StudentOrderBy student3 = new StudentOrderBy(103, "Thiago", 31);
		StudentOrderBy student4 = new StudentOrderBy(104, "Regina", 32);
		StudentOrderBy student5 = new StudentOrderBy(105, "Maria", 40);
		StudentOrderBy student6 = new StudentOrderBy(106, "Sandro", 42);
		StudentOrderBy student7 = new StudentOrderBy(107, "Regiane", 25);
		StudentOrderBy student8 = new StudentOrderBy(108, "Fabio", 35);
		StudentOrderBy student9 = new StudentOrderBy(109, "Marcelo", 25);
		StudentOrderBy student10 = new StudentOrderBy(110, "José", 23);
		
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
