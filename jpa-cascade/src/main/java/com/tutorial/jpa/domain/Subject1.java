package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject1 {

	@Id
	private int id;
	private String name;
	private int mask;
	
	public Subject1() {
		super();
	}

	public Subject1(int id, String name, int mask) {
		super();
		this.id = id;
		this.name = name;
		this.mask = mask;
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

	public int getMask() {
		return mask;
	}

	public void setMask(int mask) {
		this.mask = mask;
	}
}