package com.practise.Dao;

import java.util.List;

import com.practise.model.BUSROUTES;



public interface Busroutesint {

	public List<BUSROUTES> getallbusses();
	public boolean addbusroute(BUSROUTES route);
	public boolean deletbusroute(String routeid);
	public BUSROUTES getbusrouteonID(String id);
	
}
