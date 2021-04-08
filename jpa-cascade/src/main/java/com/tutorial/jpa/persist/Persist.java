package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.StudentPersist;
import com.tutorial.jpa.domain.Subject1;

public class Persist {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persist");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		StudentPersist student1 = new StudentPersist();
		student1.setId(101);
		student1.setName("Sandro");
		student1.setAge(35);
		
		StudentPersist student2 = new StudentPersist();
		student2.setId(102);
		student2.setName("Uilson");
		student2.setAge(12);
		
		Subject1 subject1 = new Subject1();
		subject1.setId(student1.getId());
		subject1.setName("ENGLISH");
		subject1.setMask(80);
		
		Subject1 subject2 = new Subject1();
		subject2.setId(student2.getId());
		subject2.setName("Maths");
		subject2.setMask(75);
		
		student1.setSub(subject1);
		student2.setSub(subject2);
		
		//No need to perform persist operation separately for different entities. 
		//Não há necessidade de realizar operações persistentes separadamente para diferentes entidades.
		em.persist(student1);
		em.persist(student2);
		
		em.getTransaction().commit();
	
		em.close();
		
	/*Nota - A chave primária na tabela do aluno, ou seja, s_id, será tratada 
	 * como uma chave estrangeira na tabela do assunto para manter um relacionamento entre as duas tabelas.*/
	}
}
