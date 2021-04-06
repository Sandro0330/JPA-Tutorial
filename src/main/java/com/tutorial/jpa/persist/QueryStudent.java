package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Student;

public class QueryStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 2L);
		
		System.out.println("Student ID: " + student.getId());
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
	}
}
