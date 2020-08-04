package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruits {

	@Id
	String FID;
	String name;
	int quantity;

	@Override
	public String toString() {
		String s = FID + "" + name + "" + quantity;
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFID() {
		return FID;
	}
	

}
