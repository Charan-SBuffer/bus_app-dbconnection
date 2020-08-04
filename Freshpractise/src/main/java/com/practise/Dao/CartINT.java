package com.practise.Dao;

import java.util.List;

import com.practise.model.CART;
import com.practise.model.Message;

public interface CartINT {

	public List<CART> getallcarts();
	public CART getcartonid(String id);
	public Message addtocart(CART cart);
}
