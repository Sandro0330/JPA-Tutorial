package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book2 {

	@Id
	private Long id;
	
	private String name;

	public Book2() {
		
	}

	public Book2(Long id, String name, StudentOneToOne student) {

		this.id = id;
		this.name = name;
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
}
