package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.ActiveEmployee;
import com.tutorial.jpa.domain.RetiredEmployee;

public class Single_Table {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("single_table");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		ActiveEmployee activeEmployee1 = new ActiveEmployee(101, 1000.0, "Uilson", 5);
		ActiveEmployee activeEmployee2 = new ActiveEmployee(102, 1500.0, "Alessandro", 4);
		ActiveEmployee activeEmployee3 = new ActiveEmployee(103, 1700.0, "Regina", 4);
		ActiveEmployee activeEmployee4 = new ActiveEmployee(104, 1300.0, "Maria", 4);
		ActiveEmployee activeEmployee5 = new ActiveEmployee(105, 1220.0, "Fabio", 4);
		ActiveEmployee activeEmployee6 = new ActiveEmployee(106, 1460.0, "Monaliza", 5);		
		ActiveEmployee activeEmployee7 = new ActiveEmployee(107, 1000.0, "Sandro", 7);
		
		em.persist(activeEmployee1);
		em.persist(activeEmployee2);
		em.persist(activeEmployee3);
		em.persist(activeEmployee4);
		em.persist(activeEmployee5);
		em.persist(activeEmployee6);
		em.persist(activeEmployee7);
		
		RetiredEmployee retiredEmployee1 = new RetiredEmployee(108, "José", 3500);
		RetiredEmployee retiredEmployee2 = new RetiredEmployee(109, "João", 3500);
		RetiredEmployee retiredEmployee3 = new RetiredEmployee(110, "Marcia", 3500);
		RetiredEmployee retiredEmployee4 = new RetiredEmployee(111, "Marcondes", 3500);
		RetiredEmployee retiredEmployee5 = new RetiredEmployee(112, "Eduardo", 3500);
		RetiredEmployee retiredEmployee6 = new RetiredEmployee(113, "Meire", 3500);
		RetiredEmployee retiredEmployee7 = new RetiredEmployee(114, "Gabriel", 3500);
		
		em.persist(retiredEmployee1);
		em.persist(retiredEmployee2);
		em.persist(retiredEmployee3);
		em.persist(retiredEmployee4);
		em.persist(retiredEmployee5);
		em.persist(retiredEmployee6);
		em.persist(retiredEmployee7);
		
		em.getTransaction().commit();
		em.close();
	}
}
