package com.tutorial.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.domain.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 1L);
		System.out.println("Antes do Update");
		System.out.println("Student ID: " + student.getId());
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		
		student.setAge(11);
		
		System.out.println("Depois do Update");
		System.out.println("Student ID: " + student.getId());
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		
	}
}
