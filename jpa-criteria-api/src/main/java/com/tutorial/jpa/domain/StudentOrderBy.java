package com.tutorial.jpa.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_order_by")
public class StudentOrderBy {

	@Id
	private int s_id;
	private String name;
	private int s_age;
	
	public StudentOrderBy() {
		super();
	}

	public StudentOrderBy(int s_id, String name, int s_age) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.s_age = s_age;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

}
