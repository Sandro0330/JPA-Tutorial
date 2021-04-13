package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentGroupBy;

public class InsertGroupBy {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("group_by");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Preenchendo a tabela student_select
		
		StudentGroupBy student1 = new StudentGroupBy(101, "Uilson", 11);
		StudentGroupBy student2 = new StudentGroupBy(102, "Alessandro", 12);				
		StudentGroupBy student3 = new StudentGroupBy(103, "Thiago", 31);
		StudentGroupBy student4 = new StudentGroupBy(104, "Regina", 32);
		StudentGroupBy student5 = new StudentGroupBy(105, "Maria", 40);
		StudentGroupBy student6 = new StudentGroupBy(106, "Sandro", 42);
		StudentGroupBy student7 = new StudentGroupBy(107, "Regiane", 25);
		StudentGroupBy student8 = new StudentGroupBy(108, "Fabio", 35);
		StudentGroupBy student9 = new StudentGroupBy(109, "Marcelo", 25);
		StudentGroupBy student10 = new StudentGroupBy(110, "José", 23);
		StudentGroupBy student11 = new StudentGroupBy(111, "Régis", 11);
		StudentGroupBy student12 = new StudentGroupBy(112, "Alessandra", 12);				
		StudentGroupBy student13 = new StudentGroupBy(113, "Thania", 31);
		StudentGroupBy student14 = new StudentGroupBy(114, "Reginaldo", 32);
		StudentGroupBy student15 = new StudentGroupBy(115, "Mario", 40);
		StudentGroupBy student16 = new StudentGroupBy(116, "Sandra", 42);
		StudentGroupBy student17 = new StudentGroupBy(117, "Cassiano", 25);
		StudentGroupBy student18 = new StudentGroupBy(118, "Mizael", 35);
		StudentGroupBy student19 = new StudentGroupBy(119, "Hélio", 25);
		StudentGroupBy student20 = new StudentGroupBy(120, "Edson", 23);
		StudentGroupBy student21 = new StudentGroupBy(121, "Tina", 31);
		StudentGroupBy student22 = new StudentGroupBy(122, "Melissa", 12);				
		StudentGroupBy student23 = new StudentGroupBy(123, "Monaliza", 31);
		StudentGroupBy student24 = new StudentGroupBy(124, "Cicero", 32);
		StudentGroupBy student25 = new StudentGroupBy(125, "Fernando", 40);
		StudentGroupBy student26 = new StudentGroupBy(126, "Eduardo", 42);
		StudentGroupBy student27 = new StudentGroupBy(127, "Celeste", 25);
		StudentGroupBy student28 = new StudentGroupBy(128, "Tino", 35);
		StudentGroupBy student29 = new StudentGroupBy(129, "Julio", 25);
		StudentGroupBy student30 = new StudentGroupBy(130, "Darlete", 42);
		
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
		em.persist(student11);  
		em.persist(student12);  
		em.persist(student13);  
		em.persist(student14);  
		em.persist(student15);  
		em.persist(student16);  
		em.persist(student17);  
		em.persist(student18);  
		em.persist(student19);  
		em.persist(student20); 
		em.persist(student21);  
		em.persist(student22);  
		em.persist(student23);  
		em.persist(student24);  
		em.persist(student25);  
		em.persist(student26);  
		em.persist(student27);  
		em.persist(student28);  
		em.persist(student29);  
		em.persist(student30); 
		
		em.getTransaction().commit();
		em.close();
	}
}
