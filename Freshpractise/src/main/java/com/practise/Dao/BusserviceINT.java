package com.practise.Dao;

import java.util.List;

import com.practise.model.BUSSERVICE;

public interface BusserviceINT {

	public List<BUSSERVICE> getallbuses();
	public BUSSERVICE  getserviceID(String id);
	public boolean addbusservice(BUSSERVICE  bs);
	public boolean deletbusservice(String id); 
}
