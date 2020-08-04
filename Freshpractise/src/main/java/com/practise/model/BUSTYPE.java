package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BUSTYPE  {
	@Id
	String bustypeid;
	String bustype, capacity;

	public String getBustypeid() {
		return bustypeid;
	}

	public void setBustypeid(String bustypeid) {
		this.bustypeid = bustypeid;
	}

	public String getBustype() {
		return bustype;
	}

	public void setBustype(String bustype) {
		this.bustype = bustype;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
