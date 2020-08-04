package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BUSROUTES {

	@Id
	String routeid;
	int distance;
	String destination,busowner,source,bustype,owner;
	public String getRoutid() {
		return routeid;
	}
	public void setRoutid(String routid) {
		this.routeid = routid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String getBusowner() {
		return busowner;
	}
	public void setBusowner(String busowner) {
		this.busowner = busowner;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
