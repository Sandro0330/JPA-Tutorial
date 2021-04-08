package com.tutorial.jpa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentPersist {

	@Id
	private int id;
	private String name;
	private int age;
	
	//@OneToOne(cascade = CascadeType.PERSIST)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Subject1 sub;

	public StudentPersist() {
		super();
	}

	public StudentPersist(int id, String name, int age, Subject1 sub) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sub = sub;
	}

	public Subject1 getSub() {
		return sub;
	}
	
	public void setSub(Subject1 sub) {
		this.sub = sub;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
