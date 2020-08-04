package com.practise.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class  VW_BUS_COMPLETE_DATA {

	@Id
	String scheduleid;
	String bustypeid,bustype,busid,owner,serviceno,routeid,drivername,source,destination;
	int capacity,fare,availableseats;Date dateofjourney;Time arrivaltime,depaturetime;


	public String getScheduleid() {
		return scheduleid;
	}


	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}


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


	public String getBusid() {
		return busid;
	}


	public void setBusid(String busid) {
		this.busid = busid;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getServiceno() {
		return serviceno;
	}


	public void setServiceno(String serviceno) {
		this.serviceno = serviceno;
	}


	public String getRouteid() {
		return routeid;
	}


	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}


	public String getDrivername() {
		return drivername;
	}


	public void setDrivername(String drivername) {
		this.drivername = drivername;
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


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getFare() {
		return fare;
	}


	public void setFare(int fare) {
		this.fare = fare;
	}


	public int getAvailableseats() {
		return availableseats;
	}


	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}


	public Date getDateofjourney() {
		return dateofjourney;
	}


	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}


	public Time getArrivaltime() {
		return arrivaltime;
	}


	public void setArrivaltime(Time arrivaltime) {
		this.arrivaltime = arrivaltime;
	}


	public Time getDepaturetime() {
		return depaturetime;
	}


	public void setDepaturetime(Time depaturetime) {
		this.depaturetime = depaturetime;
	}


	
	
	
}
