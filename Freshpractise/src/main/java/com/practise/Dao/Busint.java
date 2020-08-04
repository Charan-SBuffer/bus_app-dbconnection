package com.practise.Dao;

import java.util.List;

import com.practise.model.BUS;


public interface Busint {
public List<BUS> getallbuses();
public boolean addbus( BUS b);
public boolean deletbud(String id);
public BUS getbusonID(String id);
}
