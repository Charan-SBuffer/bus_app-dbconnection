package com.practise.Dao;

import java.util.List;

import com.practise.model.VW_BUS_COMPLETE_DATA;

public interface Vw_bus_complete_dataint {

	public List< VW_BUS_COMPLETE_DATA> getlistoffulldata();
	public  VW_BUS_COMPLETE_DATA getonID(String id);
	public List<VW_BUS_COMPLETE_DATA> getlistofbusestype(String bustype);
	
	public void deletvwbus(String id);
}
