package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Address;
import com.tutorial.jpa.domain.EmployeeSetMapping;

public class SetMapping {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("set_mapping");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		
		Address a1 = new Address();
		a1.setPincode(20191L);
		a1.setCidade("Taboão da Serra");
		a1.setState("São Paulo");
		
		Address a2 = new Address();
		a2.setPincode(20134L);
		a2.setCidade("Itapecirica da Serra");
		a2.setState("São Paulo");
		
		Address a3 = new Address();
		a3.setPincode(201951L);
		a3.setCidade("Sorocaba");
		a3.setState("São Paulo");
		
		Address a4 = new Address();
		a4.setPincode(20345L);
		a4.setCidade("Osasco");
		a4.setState("São Paulo");
		
		
		EmployeeSetMapping e1 = new EmployeeSetMapping();
		e1.setName("Sandro");
		
		EmployeeSetMapping e2 = new EmployeeSetMapping();
		e2.setName("Maria");
		
		EmployeeSetMapping e3 = new EmployeeSetMapping();
		e3.setName("José");
		
		EmployeeSetMapping e4 = new EmployeeSetMapping();
		e4.setName("João");
		
		e1.getAddresses().add(a1);
		e2.getAddresses().add(a4);
		e3.getAddresses().add(a3);
		e4.getAddresses().add(a2);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
