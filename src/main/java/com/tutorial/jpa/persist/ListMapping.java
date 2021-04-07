package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Address;
import com.tutorial.jpa.domain.Employee;

public class ListMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		Address a1 = new Address();
		a1.setPincode(2456L);
		a1.setCidade("Osasco");
		a1.setState("São Paulo");
		
		Address a2 = new Address();
		a2.setPincode(2478L);
		a2.setCidade("São Paulo");
		a2.setState("São Paulo");
		
		Employee e1 = new Employee();
		e1.setName("Uilson");
		e1.getAddress().add(a1);
		
		
		Employee e2 = new Employee();
		e2.setName("Alessandro");
		e2.getAddress().add(a2);
		
		
		em.persist(e1);
		em.persist(e2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
