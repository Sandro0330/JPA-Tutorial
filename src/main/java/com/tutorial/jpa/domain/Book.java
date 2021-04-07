package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	private Long id;
	private String name;
	
	@OneToOne
	private StudentOneToOne student;

	public Book() {
		super();
	}

	public Book(Long id, String name, StudentOneToOne student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentOneToOne getStudent() {
		return student;
	}

	public void setStudent(StudentOneToOne student) {
		this.student = student;
	}
	
}
