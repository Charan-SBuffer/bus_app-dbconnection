package com.practise.model;

import java.awt.Image;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
public class BUS implements Serializable {
	
	@Id
	String busid;
	String bustype,owner,busowner;
	@Transient
	Image[] busimages =new Image[3];
	public Image[] getUserimage() {
		return busimages;
	}
	public void setUserimage(Image[] userimage) {
		this.busimages = userimage;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getBusowner() {
		return busowner;
	}
	public void setBusowner(String busowner) {
		this.busowner = busowner;
	}
	
	
	

}
