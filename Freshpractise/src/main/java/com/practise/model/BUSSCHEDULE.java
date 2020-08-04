package com.practise.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity		
public class BUSSCHEDULE  {
	
	@Id
	String scheduleid;
	String serviceno,drivername;
	Date  dateofjourney;int fare,availableseats;
	Time arrivaltime,departuretime;
	public String getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}
	public String getServiceno() {
		return serviceno;
	}
	public void setServiceno(String serviceno) {
		this.serviceno = serviceno;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
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
	public Time getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(Time arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public Time getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(Time departuretime) {
		this.departuretime = departuretime;
	}
	
	

}
