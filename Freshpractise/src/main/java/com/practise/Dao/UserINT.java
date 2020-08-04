package com.practise.Dao;

import java.util.List;

import com.practise.model.USER;

public interface UserINT {
  
	public List<USER> getallusers();
	public String adduser(USER user);
	public USER getuseronid(String userid);
	public void deleteuseronid(String id);
	public boolean logincheck(String id,String password);
}
