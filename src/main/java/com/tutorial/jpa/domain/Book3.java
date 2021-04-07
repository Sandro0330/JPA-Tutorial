package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book3 {

	@Id
	private Long id;
	private String name;
		
	public Book3() {
		super();
	}

	public Book3(Long id, String name) {
		super();
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
