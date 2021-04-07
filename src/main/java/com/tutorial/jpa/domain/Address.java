package com.tutorial.jpa.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private Long pincode;
	private String cidade;
	private String state;
	
	
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	
}
