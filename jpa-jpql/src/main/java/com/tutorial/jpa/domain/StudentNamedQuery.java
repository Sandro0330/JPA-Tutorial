package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "student_named_query")
@NamedQuery(name = "find name", query = "Select s from StudentNamedQuery s")
public class StudentNamedQuery {
	
	@Id
	private int s_id;
	
	private String s_name;
	private int s_age;
	
	public StudentNamedQuery() {
		super();
	}

	public StudentNamedQuery(int s_id, String s_name, int s_age) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
}
