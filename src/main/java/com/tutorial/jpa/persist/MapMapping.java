package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Address;
import com.tutorial.jpa.domain.EmployeeMapMapping;

public class MapMapping {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("map_mapping");
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
	
		Address a1 = new Address();
		a1.setPincode(190345L);
		a1.setCidade("Suzano");
		a1.setState("São Paulo");
		
		Address a2 = new Address();
		a2.setPincode(350345L);
		a2.setCidade("Ribeirão Preto");
		a2.setState("São Paulo");

		Address a3 = new Address();
		a3.setPincode(890345L);
		a3.setCidade("Cotia");
		a3.setState("São Paulo");

		Address a4 = new Address();
		a4.setPincode(980345L);
		a4.setCidade("São Roque");
		a4.setState("São Paulo");


		EmployeeMapMapping e1 = new EmployeeMapMapping();
		e1.setName("Gilberto");
		
		EmployeeMapMapping e2 = new EmployeeMapMapping();
		e2.setName("Júnior");
		
		EmployeeMapMapping e3 = new EmployeeMapMapping();
		e3.setName("Marcio");
		
		EmployeeMapMapping e4 = new EmployeeMapMapping();
		e4.setName("Itamar");
		
		e1.getMap().put(1, a1);
		e2.getMap().put(2, a2);
		e3.getMap().put(3, a3);
		e4.getMap().put(4, a4);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		
		
		em.getTransaction().commit();
		em.close();
		
	}	
}
