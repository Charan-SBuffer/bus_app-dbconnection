package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BUSSERVICE  {

	@Id
	String serviceno;
	String busid,routeid;
	public String getServiceno() {
		return serviceno;
	}
	public void setServiceno(String serviceno) {
		this.serviceno = serviceno;
	}
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public String getRouteid() {
		return routeid;
	}
	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}
	
	
}
