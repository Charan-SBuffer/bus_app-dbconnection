package com.practise.Dao;

import java.util.List;

import com.practise.model.BUSSCHEDULE;

public interface BusscheduleINT {
public List<BUSSCHEDULE > getallbusschedule();
public BUSSCHEDULE  getscheduleonID(String id);
public boolean addbusschedule(BUSSCHEDULE  bus);
public boolean deletbusschedule(String id);
}
