package com.practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TICKETHISTORY  {

	@Id
	String bookid;
	String customerid;
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	
	
}
