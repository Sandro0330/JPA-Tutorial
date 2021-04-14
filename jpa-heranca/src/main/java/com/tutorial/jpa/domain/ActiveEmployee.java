package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ActiveEmployee_table_class")
public class ActiveEmployee extends Employee {
	private static final long serialVersionUID = 1L;
	
	private double e_salary;
	private int e_experience;
	
	public ActiveEmployee() {
		super();
	}

	public ActiveEmployee(int e_id, double e_salary, String e_name,int e_experience) {
		super(e_id, e_name);
		this.e_salary = e_salary;
		this.e_experience = e_experience;
	}

	public double getE_salary() {
		return e_salary;
	}

	public void setE_salary(double e_salary) {
		this.e_salary = e_salary;
	}

	public int getE_experience() {
		return e_experience;
	}

	public void setE_experience(int e_experience) {
		this.e_experience = e_experience;
	}
}
