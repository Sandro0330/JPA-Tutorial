package com.tutorial.jpa.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeMapMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ElementCollection
	private Map<Integer, Address> map = new HashMap<Integer, Address>();
	
	public EmployeeMapMapping() {

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

	public Map<Integer, Address> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Address> map) {
		this.map = map;
	}
}
