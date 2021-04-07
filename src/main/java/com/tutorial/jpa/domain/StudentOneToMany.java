package com.tutorial.jpa.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentOneToMany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	@OneToMany(targetEntity = Book2.class )
	private List<?> book_issued;

	public List<?> getBook_issued() {
		return book_issued;
	}

	public void setBook_issued(List<?> book_issued) {
		this.book_issued = book_issued;
	}

	public StudentOneToMany() {

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
