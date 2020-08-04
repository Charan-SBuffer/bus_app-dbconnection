package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CART {

	@Id
	String cartid;
	String userid;
	String scheduleid;
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}
	
	
}
