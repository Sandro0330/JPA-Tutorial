package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentManyToOne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToOne
	private Book3 book;

	public StudentManyToOne() {
		super();
	}
	
	public StudentManyToOne(Long id, String name, Book3 book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
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

	public Book3 getBook() {
		return book;
	}

	public void setBook(Book3 book) {
		this.book = book;
	}
	
	
}
