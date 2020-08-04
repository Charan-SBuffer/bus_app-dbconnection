package com.practise.Dao;

import java.util.List;

import com.practise.model.TICKETHISTORY;

public interface TicketbookINT {

	public List<TICKETHISTORY > getfullhistoryofbookings();
	public TICKETHISTORY  getbookedticketonid(String id);
	public void addticketbooking(String th,String vwbustypeid);
	}
