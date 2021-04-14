package com.tutorial.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RetiredEmployee_table_class")
public class RetiredEmployee extends Employee {
	private static final long serialVersionUID = 1L;
	
	private int e_pension;

	public RetiredEmployee() {
		
	}

	public RetiredEmployee(int e_id, String e_name, int e_pension) {
		super(e_id, e_name);
		this.e_pension = e_pension;
	}

	public int getE_pension() {
		return e_pension;
	}

	public void setE_pension(int e_pension) {
		this.e_pension = e_pension;
	}
}
