	package com.practise.Dao;

import java.util.List;

import com.practise.model.BUSTYPE;

public interface Bustypeint {

  public List<BUSTYPE> getallBustypes();
  public boolean addbustype(BUSTYPE b);
  public BUSTYPE getbustypeonID(String id);
  public boolean deletbustype(String id);
  
}
